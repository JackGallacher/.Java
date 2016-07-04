class Program
{
	public static void main(String[]args)
	{
		SimpleWarmup Warmup1 = new SimpleWarmup();
		MediumWarmup Warmup2 = new MediumWarmup();
				
		/*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
		We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.*/
		Warmup1.SleepIn(false, false);//true.
		Warmup1.SleepIn(true, false);//false.
		Warmup1.SleepIn(false, true);//true.
		
		/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
		We are in trouble if they are both smiling or if neither of them is smiling. 
		Return true if we are in trouble.*/
		Warmup1.MonkeyTrouble(true, true);//true.
		Warmup1.MonkeyTrouble(false, false);//true.
		Warmup1.MonkeyTrouble(true, false);//false.
		
		/*Given two int values, return their sum. Unless the two values are the same, then return double their sum.*/		
		System.out.println(Integer.toString(Warmup1.SumDouble(1,2)));//3
		System.out.println(Integer.toString(Warmup1.SumDouble(2,2)));//5
		System.out.println(Integer.toString(Warmup1.SumDouble(2,2)));//8
				
		/*Given an int n, return the absolute difference between n and 21, 
		except return double the absolute difference if n is over 21.*/
		System.out.println("Difference is: " + Integer.toString(Warmup1.Diff21(19)));//Returns 2.
		System.out.println("Difference is: " + Integer.toString(Warmup1.Diff21(10)));//Returns 11.
		System.out.println("Difference is: " + Integer.toString(Warmup1.Diff21(21)));//Returns 0.
		
		/*Given an int n, return true if it is within 10 of 100 or 200. 
		Note: Math.abs(num) computes the absolute value of a number.*/
		Warmup1.NearHundered(93);//true.
		Warmup1.NearHundered(90);//true.
		Warmup1.NearHundered(89);//false.
		
		
		/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.*/
		System.out.println(Warmup2.StringTimes("Hi", 2));//"HiHi"
		System.out.println(Warmup2.StringTimes("Hi", 3));//"HiHiHi"
		System.out.println(Warmup2.StringTimes("Hi", 1));//"Hi"
		
		/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
		or whatever is there if the string is less than length 3. Return n copies of the front;*/
		System.out.println(Warmup2.FrontTimes("Chocolate", 2));//"HiHi"
		System.out.println(Warmup2.FrontTimes("Chocolate", 3));//"HiHiHi"
		System.out.println(Warmup2.FrontTimes("Abc", 1));//"Hi"
		
		/*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".*/
		System.out.println("There are " + Integer.toString(Warmup2.CountXX("abcxx")) + " X's.");//1
		System.out.println("There are " + Integer.toString(Warmup2.CountXX("xxx")) + " X's.");//2
		System.out.println("There are " + Integer.toString(Warmup2.CountXX("xxxx")) + " X's.");//3
		
		/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".*/
		Warmup2.DoubleX("axxbb");//True.
		Warmup2.DoubleX("axaxax");//False.
		Warmup2.DoubleX("xxxxx");//True.
	}
}
class SimpleWarmup
{
	boolean SleepIn(boolean Weekday, boolean Vacation)
	{
		if(Weekday == false || Vacation == true)
		{
			System.out.println("We are sleeping in.");
			return true;
		}
		else	
		{
			System.out.println("We are not sleeping in.");
		}
		return false;
	}
	
	boolean MonkeyTrouble(boolean ASmile, boolean BSmile)
	{
		if(ASmile && BSmile || !ASmile && !BSmile)
		{
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	int SumDouble(int X, int Y)
	{
		if(X == Y)
		{
			return (X + Y) * 2;
		}
		else
		{
			return X + Y;
		}
	}
			
	int Diff21(int MyNumber)
	{
		int Difference = 0;
		
		if(MyNumber <= 21)
		{					
			Difference = 21 - MyNumber;		
		}
		if(MyNumber > 21)
		{
			Difference = MyNumber - 21;
			Difference = Difference * 2;
		}		
		return Difference;		
	}	
	
	boolean NearHundered(int MyNumber)
	{
		if(Math.abs(100 - MyNumber) <= 10 || Math.abs(200 - MyNumber) <= 10)
		{
			System.out.println(Integer.toString(MyNumber) + " IS within 10 of 100/200.");
			return true;
		}
		else
		{
			System.out.println(Integer.toString(MyNumber) + " IS NOT within 10 of 100/200.");
			return false;
		}
	}	
}
class MediumWarmup
{
	String StringTimes(String MyString, int TimesToRepeat)
	{
		String RepeatedString = "";
		for(int i = 0; i < TimesToRepeat; i++)
		{
			RepeatedString = RepeatedString + MyString;
		}
		return RepeatedString;
	}
	
	String FrontTimes(String MyString, int TimesToRepeat)
	{
		String RepeatedString = "";
		for(int i = 0; i < TimesToRepeat; i++)
		{	
			if(MyString.length() >= 3)//Checks if the string length is greater or equal to three.
			{
				RepeatedString = RepeatedString + MyString.substring(0,3);//Selects the first 3 characters of the string.
			}
			else//If there are less than three characters in the string.
			{
				RepeatedString = RepeatedString + MyString.substring(0,MyString.length());//Just select the entire length of the current string.
			}
		}
		return RepeatedString;
	}
	
	int CountXX(String MyString)
	{
		int XCount = 0;	
		for(int i = 0; i < MyString.length()-1; i++)
		{
		  if(MyString.substring(i, i + 2).equals("xx"))//.equals compares the two strings contents e.g "hello" matches "hello" compared to == which just checks the references.
		  {
		    XCount++;
		  }
		}
		return XCount;
	}
	
	boolean DoubleX(String MyString)
	{
	  int Index = MyString.indexOf("x");//Gets the position in the string of the first  "X"	  
	  if(Index + 1 >= MyString.length() || Index == -1)//If Next X is out of scope or it does not contain X
	  {
		System.out.println("Returning False");
	    return false;
	  }
	  if(MyString.substring(Index + 1, Index + 2).equals("x"))//If the next X after the first equals X. substring(first index, end index - 1)
		System.out.println("Returning True");
	    return true;
	  }
	  else
	  {
		System.out.println("Returning False");
	    return false;
	  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
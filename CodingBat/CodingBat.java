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
		Warmup1.MonkeyTrouble(true, true)//true.
		Warmup1.MonkeyTrouble(false, false)//true.
		Warmup1.MonkeyTrouble(true, false)//false.
		
		/*Given two int values, return their sum. Unless the two values are the same, then return double their sum.*/		
		System.out.println(Integer.toString(Warmup1.SumDouble(1,2));//3
		System.out.println(Integer.toString(Warmup1.SumDouble(2,2));//5
		System.out.println(Integer.toString(Warmup1.SumDouble(2,2));//8
				
		/*Given an int n, return the absolute difference between n and 21, 
		except return double the absolute difference if n is over 21.*/
		System.out.println("Difference is: " + Integer.toString(Warmup1.Diff21(19)) + "\n");//Returns 2.
		System.out.println("Difference is: " + Integer.toString(Warmup1.Diff21(10)) + "\n");//Returns 11.
		System.out.println("Difference is: " + Integer.toString(Warmup1.Diff21(21)) + "\n");//Returns 0.
		
		/*Given an int n, return true if it is within 10 of 100 or 200. 
		Note: Math.abs(num) computes the absolute value of a number.*/
		Warmup1.NearHundered(93);//true.
		Warmup1.NearHundered(90);//true.
		Warmup1.NearHundered(89);//false.
		
	}
}
class SimpleWarmup
{
	boolean SleepIn(boolean Weekday, boolean Vacation)
	{
		if(Weekday == false || Vacation == true)
		{
			System.out.println("We are sleeping in.\n");
			return true;
		}
		else	
		{
			System.out.println("We are not sleeping in.\n");
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
			System.out.println(Integer.toString(MyNumber) + "IS within 10 of 100/200.");
			return true;
		}
		else
		{
			System.out.println(Integer.toString(MyNumber) + "IS NOT within 10 of 100/200.");
			return false;
		}
	}	
}
class MediumWarmup
{
	
}
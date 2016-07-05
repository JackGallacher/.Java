import java.util.Arrays;//Allows the use of the "Arrays" functions, letting us do things like Arrays.toString();
class Program
{
	public static void main(String[]args)
	{
		SimpleWarmup Warmup1 = new SimpleWarmup();
		MediumWarmup Warmup2 = new MediumWarmup();
		
		StringOne String1 = new StringOne();
		ArrayOne Array1 = new ArrayOne();
		LogicOne Logic1 = new LogicOne();
		
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
		
		/*Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".*/
		System.out.println(Warmup2.StringBits("Hello"));//Hlo.
		System.out.println(Warmup2.StringBits("Hi"));//H.
		System.out.println(Warmup2.StringBits("Heeololeo"));//Hello.
		
		/*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".*/
		System.out.println(String1.HelloName("Bob"));//Hello Bob!
		System.out.println(String1.HelloName("Alice"));//Hello Alice!
		System.out.println(String1.HelloName("X"));//Hello X!
		
		/*Given two strings, a and b, return the result of putting them together in the order abba, 
		e.g. "Hi" and "Bye" returns "HiByeByeHi".*/
		System.out.println(String1.MakeAbba("Hi", "Bye"));//HiByeByeHi.
		System.out.println(String1.MakeAbba("Yo", "Alice"));//YoAliceAliceYo.
		System.out.println(String1.MakeAbba("What", "Up"));//WhatUpUpWhat.
		
		/*The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
		In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
		Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".*/
		System.out.println(String1.MakeTags("i", "Yay"));//<i>Yay</i>.
		System.out.println(String1.MakeTags("i", "Hello"));//<i>Hello</i>.
		System.out.println(String1.MakeTags("cite", "Yay"));//<i>Yay</i>.
		
		/*Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, 
		e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.*/
		System.out.println(String1.MakeOutWord("<<>>", "Yay"));//<<Yay>>
		System.out.println(String1.MakeOutWord("<<>>", "WooHoo"));//<<WooHoo>>
		System.out.println(String1.MakeOutWord("[[]]", "word"));//[[word]]
		
		/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.*/
		System.out.println(String1.ExtraEnd("Hello"));//lololo.
		System.out.println(String1.ExtraEnd("ab"));//ababab.
		System.out.println(String1.ExtraEnd("Hi"));//HiHiHi.
		
		/*Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
		If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" 
		yields the empty string "". Note that str.length() returns the length of a string.*/
		System.out.println(String1.FirstTwo("Hello"));//He.
		System.out.println(String1.FirstTwo("abcdefg"));//ab.
		System.out.println(String1.FirstTwo("ab"));//ab.
		
		
		/*Given an array of ints, return true if 6 appears as either the first or last element in the array. 
		The array will be length 1 or more.*/
		int[] FirstArray = new int[]{1,2,6};
		int[] SecondArray = new int[]{6,1,2,6};
		int[] ThirdArray = new int[]{13,6,1,2,3};		
		Array1.FirstLast6(FirstArray);//True.
		Array1.FirstLast6(SecondArray);//True.
		Array1.FirstLast6(ThirdArray);//False.
		
		/*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.*/
		Array1.SameFirstLast(FirstArray);//False.
		Array1.SameFirstLast(SecondArray);//True.
		Array1.SameFirstLast(ThirdArray);//False.
		
		/*Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.*/
		int[] PiResult = Array1.MakePi();
		System.out.println(Arrays.toString(PiResult));
		
		/*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. 
		Both arrays will be length 1 or more.*/
		int[] CommonArray1 = new int[]{1,2,3};
		int[] CommonArray2 = new int[]{7,3};
		int[] CommonArray3 = new int[]{13,6,1,2,7};		
		Array1.CommonEnd(CommonArray1, CommonArray2);//True.
		Array1.CommonEnd(CommonArray2, CommonArray3);//False.
		Array1.CommonEnd(CommonArray3, CommonArray1);//False.
		
		/*Given an array of ints length 3, return the sum of all the elements.*/
		System.out.println(Integer.toString(Array1.Sum3(CommonArray1)));//6.
		
		/*Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.*/
		System.out.println(Arrays.toString(Array1.RotateLeft3(CommonArray1)));//[2,3,1].
		
		/*When squirrels get together for a party, they like to have cigars. 
		A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
		Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
		Return true if the party with the given values is successful, or false otherwise.*/
		Logic1.CigarParty(30, false);//False.
		Logic1.CigarParty(50, false);//True.
		Logic1.CigarParty(70, true);//True.
		
		/*You and your date are trying to get a table at a restaurant. 
		The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. 
		The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, 
		then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). 
		Otherwise the result is 1 (maybe).*/
		System.out.println(Integer.toString(Logic1.DateFashion(5,10)));//2
		System.out.println(Integer.toString(Logic1.DateFashion(5,2)));//0
		System.out.println(Integer.toString(Logic1.DateFashion(5,5)));//1
		
		/*The squirrels in Palo Alto spend most of the day playing. In particular, 
		they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. 
		Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.*/
		Logic1.SquirrelPlay(70, false);//True.
		Logic1.SquirrelPlay(95, false);//False.
		Logic1.SquirrelPlay(95, true);//True.
		
		/*You are driving a little too fast, and a police officer stops you. 
		Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
		If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
		If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.*/
		System.out.println(Integer.toString(Logic1.CaughtSpeeding(60, false)));//0.
		System.out.println(Integer.toString(Logic1.CaughtSpeeding(65, false)));//1.
		System.out.println(Integer.toString(Logic1.CaughtSpeeding(65, true)));//0.
		
		/*Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.*/
		System.out.println(Integer.toString(Logic1.SortaSum(3,4)));//7.
		System.out.println(Integer.toString(Logic1.SortaSum(9,4)));//20.
		System.out.println(Integer.toString(Logic1.SortaSum(10,11)));//21.
		
		/*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, 
		return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" 
		and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and 
		weekends it should be "off".*/		
		System.out.println(Logic1.AlarmClock(1,false));//7:00.
		System.out.println(Logic1.AlarmClock(5,false));//7:00.
		System.out.println(Logic1.AlarmClock(0,false));//7:00.
	}
}
class SimpleWarmup//Simple warmup problems
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
class MediumWarmup//Medium warmup problems
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
	  if(MyString.substring(Index + 1, Index + 2).equals("x"))	  //If the next X after the first equals X. substring(first index, end index - 1)
	  {
		System.out.println("Returning True");
	    return true;
	  }
	  else
	  {
		System.out.println("Returning False");
	    return false;
	  }
	}
	
	String StringBits(String MyString)
	{
		String NewString = "";
		for(int i = 0; i < MyString.length(); i += 2)//Increments by 2 every time as we need every other character in the string.
		{
			NewString = NewString + MyString.substring(i, i + 1);//Selects the character in position "i" becuase (i + 1) -1 = i
		}		
		return NewString;
	}	
}
class StringOne//Basic String problems.
{
	String HelloName(String Name)
	{
		return "Hello " + Name + "!";
	}
	
	String MakeAbba(String A, String B)
	{
		return A + B + B + A;		
	}
	
	String MakeTags(String Tag, String Word)
	{
		return "<" + Tag + ">" + Word + "</" + Tag + ">";
	}
	
	String MakeOutWord(String Out, String Word)
	{
		return Out.substring(0,2) + Word + Out.substring(2,4);
	}
	
	String ExtraEnd(String MyString)
	{
		int StringLength = MyString.length();
		String NewString = MyString.substring(StringLength - 2);//Gets a substring from the length of the string - 2. eg. Hello = 5, 5-2 = 3, Create substring stating from the third character.
		return NewString + NewString + NewString;
	}
	
	String FirstTwo(String MyString)
	{
		if(MyString.length() < 2)//If the string is shorter than 2, just return that string.
		{
			return MyString;
		}
		return MyString.substring(0, 2);//Ruturn a substring from character 0 and up to, but not including 2. e.g. Hello -> 0 = H, 1 = e.
	}
	
}
class ArrayOne//Basic Array problems.
{
	boolean FirstLast6(int[] MyArray)
	{
		if(MyArray[0] == 6 || MyArray[MyArray.length - 1] == 6)
		{
			System.out.println("True");
			return true;
		}
		else
		{
			System.out.println("False");
			return false;
		}
	}
	
	boolean SameFirstLast(int[] MyArray)
	{
		if(MyArray.length < 1)//Checks to see if the array length is less than 1.
		{
			System.out.println("False");
			return false;
		}
		if(MyArray[0] == MyArray[MyArray.length - 1])//Are the first and last elements of the array the same?
		{
			System.out.println("True");
			return true;
		}
		else
		{
			System.out.println("False");
			return false;
		}
	}
	
	int[] MakePi()
	{
		int[] PiArray = new int[]{3,1,4};
		return PiArray;
	}
	
	boolean CommonEnd(int[]FirstArray, int[]SecondArray)
	{
		if(FirstArray.length < 1 && SecondArray.length < 1)
		{
			System.out.println("False");
			return false;
		}
		
		if(FirstArray[0] == SecondArray[0] || FirstArray[FirstArray.length - 1] == SecondArray[SecondArray.length - 1])
		{
			System.out.println("True");
			return true;
		}	
		else
		{
		  System.out.println("False");
		  return false;
		}		
	}
	
	int Sum3(int[] NumberArray)
	{
		int Total = 0;
		for(int Number : NumberArray)
		{
			Total = Total + Number;
		}
		return Total;
	}
	
	int[] RotateLeft3(int[] NumberArray)
	{		
		int Temp = NumberArray[0];
		NumberArray[0] = NumberArray[1];
		NumberArray[1] = NumberArray[2];
		NumberArray[2] = Temp;
				
		return NumberArray;
	}
	
	
	
	
}
class LogicOne//Basic Boolean logic problems.
{
	boolean CigarParty(int Cigars, boolean IsWeekend)
	{
		if(Cigars < 40)
		{
			System.out.println("False");
			return false;
		}
		if(Cigars >= 40 && Cigars <= 60)
		{
			System.out.println("True");
			return true;
		}
		if(Cigars > 60 && IsWeekend == true)
		{
			System.out.println("True");
			return true;
		}
		else
		{
			System.out.println("False");
			return false;
		}
	}
	
	int DateFashion(int You, int Date)
	{
		if(You <= 2 || Date <= 2)
		{
			return 0;
		}
		if(You >= 8 || Date >= 8)
		{
			return 2;
		}		
		else
		{
			return 1;
		}	
	}
	
	boolean SquirrelPlay(int Temperature, boolean IsSummer)
	{
		if(IsSummer == true)
		{
			if(Temperature >= 60 && Temperature <= 100)
			{
				System.out.println("True");
				return true;
			}
		}
		else if(Temperature >= 60 && Temperature <= 90)
		{
			System.out.println("True");
			return true;
		}
		System.out.println("False");
		return false;
	}
	
	int CaughtSpeeding(int Speed, boolean IsBirthday)
	{
  	if(IsBirthday == true)
	  {
  		if(Speed >= 66 && Speed <= 85)
  		{
  			return 1;			
  		}
  		if(Speed >= 86)
  		{
  			return 2;			
  		}
	  }
	  else
	  {
	    if(Speed >= 61 && Speed <= 80)
  		{
  			return 1;			
  		}
  		if(Speed >= 81)
  		{
  			return 2;			
  		}
	  }
		return 0;
	}
	
	int SortaSum(int A, int B)
	{
		if(A + B >= 10 && A + B <= 19)
		{
			return 20;
		}
		else
		{
			return A + B;
		}
	}
	
	String AlarmClock(int Day, boolean Vacation)
	{
		if(Vacation)
		{
			if(Day >= 1 && Day <= 5)
			{
				return "10:00";
			}
			else
			{
				return "off";
			}
		}
		else
		{
			if(Day >= 1 && Day <= 5)
			{
				return "7:00";
			}
			else
			{
				return "10:00";
			}
		}
	}	
}

class StringTwo//Medium String problems.
{
	
}

class ArrayTwo//Medium Array problems.
{
	
}
class LogicTwo//Medium Boolean logic problems.
{
	
}


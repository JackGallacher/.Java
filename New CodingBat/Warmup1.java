class Warmup1
{
	public static void main(String[]args)
	{
		Warmup1 Tasks = new Warmup1();//Instance of Warmup1 class
		
		//1
		Tasks.SleepIn(false, false);//true
		Tasks.SleepIn(true, false);//false
		Tasks.SleepIn(false, true);//true
		
		//2
		Tasks.MonkeyTrouble(true, true);//true
		Tasks.MonkeyTrouble(false, false);//true
		Tasks.MonkeyTrouble(true, false);//false
		
		//3		
		System.out.println(Integer.toString(Tasks.SumDouble(1,2)));//3
		System.out.println(Integer.toString(Tasks.SumDouble(3,2)));//5
		System.out.println(Integer.toString(Tasks.SumDouble(2,2)));//8
		
		//4
		System.out.println(Integer.toString(Tasks.Diff21(19)));//2
		System.out.println(Integer.toString(Tasks.Diff21(10)));//11
		System.out.println(Integer.toString(Tasks.Diff21(21)));//0
		
		//5
		Tasks.ParrotTrouble(true, 6);//true
		Tasks.ParrotTrouble(true, 7);//false
		Tasks.ParrotTrouble(false, 6);//false
		
		//6
		Tasks.Makes10(9, 10);//true
		Tasks.Makes10(9, 9);//false
		Tasks.Makes10(1, 9);//true
		
		//7
		Tasks.NearHundred(93);//true
		Tasks.NearHundred(90);//true
		Tasks.NearHundred(89);//false
		
		//8
		Tasks.PosNeg(1, -1, false);//true
		Tasks.PosNeg(-1, 1, false);//true
		Tasks.PosNeg(-4, -5, true);//true
		
		//9
		System.out.println(Tasks.NotString("Candy"));//Not Candy
		System.out.println(Tasks.NotString("X"));//Not X
		System.out.println(Tasks.NotString("Not Bad"));//Not Bad	
		
		//10
		System.out.println(Tasks.MissingChar("Kitten", 1));
		System.out.println(Tasks.MissingChar("Kitten", 0));
		System.out.println(Tasks.MissingChar("Kitten", 4));

		//11
		System.out.println(Tasks.FrontBack("code"));//eodc
		System.out.println(Tasks.FrontBack("a"));//a
		System.out.println(Tasks.FrontBack("ab"));//ba

		
		//12
		System.out.println(Tasks.Front3("Java"));//JavaJavaJava
		System.out.println(Tasks.Front3("Chocolate"));//ChoChoCho
		System.out.println(Tasks.Front3("abc"));//abcabcabc
		
		//13
		System.out.println(Tasks.BackAround("cat"));//tcatt
		System.out.println(Tasks.BackAround("Hello"));//oHelloo
		System.out.println(Tasks.BackAround("a"));//aaa
		
		//14
		Tasks.Or35(3);//true
		Tasks.Or35(10);//true
		Tasks.Or35(8);//false
		
		//15
		System.out.println(Tasks.Front22("kitten"));//kikittenki
		System.out.println(Tasks.Front22("Ha"));//HaHaHa
		System.out.println(Tasks.Front22("abc"));//ababcab
		
		//16
		Tasks.StartHi("hi there");//true
		Tasks.StartHi("hi");//true
		Tasks.StartHi("hello hi");//false
		
		//17
		Tasks.IcyHot(120, -1);//true
		Tasks.IcyHot(-1, 120);//true
		Tasks.IcyHot(2, 120);//false
		
		//19
		Tasks.In1020(12, 99);//true
		Tasks.In1020(21, 12);//true
		Tasks.In1020(8, 99);//false
		
		//20
		Tasks.HasTeen(13, 20, 10);//true
		Tasks.HasTeen(20, 19, 10);//true
		Tasks.HasTeen(20, 10, 13);//true
		
		//21
		Tasks.LoneTeen(13, 99);//true
		Tasks.LoneTeen(21, 19);//true
		Tasks.LoneTeen(13,13);//false
		
		//22
		System.out.println(Tasks.DelDel("adelbc"));//abc
		System.out.println(Tasks.DelDel("adelHello"));//aHello
		System.out.println(Tasks.DelDel("adedbc"));//adedbc
		
		//23
		Tasks.MixStart();
		Tasks.MixStart();
		Tasks.MixStart();
		
		//24
		

	}
	boolean SleepIn(boolean Weekday, boolean Vacation)
	{
		if(Weekday == false || Vacation == true)
		{
			System.out.println("Today we are sleeping in.");
			return true;
		}
		System.out.println("We are not sleeping in today.");
		return false;
	}	
	boolean MonkeyTrouble(boolean ASmile, boolean BSmile)
	{
		if(ASmile && BSmile || !ASmile && !BSmile)
		{
			System.out.println("Uh Oh, We are in trouble.");
			return true;
		}
		System.out.println("Phew, We are not in trouble.");
		return false;
	}
	int SumDouble(int A, int B)
	{
		if(A == B)
		{
			return (A + B) * 2;
		}
		return A + B;
		
	}
	int Diff21(int N)
	{
		if(N > 21)
		{
			return Math.abs((21 - N) * 2);//Returns absolute value (Always positive.)
		}
		return Math.abs(N - 21);		
	}
	boolean ParrotTrouble(boolean Talking, int Hour)
	{
		if(Talking)
		{
			if(Hour < 7 || Hour > 20)
			{
				System.out.println("We are in trouble!");
				return true;
			}
		}
		System.out.println("We are not in trouble!");
		return false;		
	}
	boolean Makes10(int A, int B)
	{
		if(A == 10 || B == 10 || A + B == 10)
		{
			System.out.println("One of the numbers is 10 or the sum is 10.");
			return true;
		}
		return false;
	}
	boolean NearHundred(int N)
	{
		if(Math.abs(100 - N) <= 10 || Math.abs(200 - N) <= 10 )
		{
			System.out.println("Withing 10 if 100 or 200.");
			return true;
		}
		return false;
	}
	boolean PosNeg(int A, int B, boolean Negative)
	{
		if(Negative)
		{
			if(A < 0 && B < 0)
			{
				System.out.println("Both values are negative.");
				return true;
			}
			return false;
		}
		if(A < 0 && B > 0 || B < 0 && A > 0)
		{
			System.out.println("One value is negative and one is positive.");
			return true;
		}
		return false;
	}
	String NotString(String Str)
	{
	  if(Str.length() >= 3 && Str.substring(0,3).equals("not"))
	  {
	    return Str;
	  }
	  return "Not " + Str;
	}
	String MissingChar(String Str, int N)
	{
		String Front = Str.substring(0, N);//Gets the substring from the first letter of the word to the letter before the one we want to exclude.
		String Back = Str.substring(N + 1, Str.length());//N + 1 to start from the letter after the N letter as substring start is inclusive.
		return Front + Back;		
	}
	String FrontBack(String Str)
	{
	  if(Str.length() > 1)
	  {
		  String Mid = Str.substring(1, Str.length() - 1);//Gets a string from the second character of the string and the last character - 1 in the string.
		  
		  char Start = Str.charAt(0);//Gets a character at a specific place in a string.
		  char End = Str.charAt(Str.length() - 1);
		  
		  return End + Mid + Start;
	  }
	  return Str;
	}
	String Front3(String Str)
	{		
		if(Str.length() < 3)
		{
			return Str + Str + Str;
		}
		
		String FrontThree = Str.substring(0, 3);
		return FrontThree + FrontThree + FrontThree;	
	}
	String BackAround(String Str)
	{
		String Last = Str.substring(Str.length() - 1);
		return Last + Str + Last;
	}
	boolean Or35(int N)
	{
		if(N % 3 == 0 || N % 5 == 0)
		{
			System.out.println(N + " is a multiple of 3 or 5");
			return true;
		}
		System.out.println(N + " is not a multiple of 3 or 5");
		return false;
	}
	String Front22(String Str)
	{
		if(Str.length() <= 2)
		{
			return Str + Str + Str;
		}
		
		String Front = Str.substring(0, 2);
		return Front + Str + Front;		
	}
	boolean StartHi(String Str)
	{
	  if(Str.length() < 2)
	  {
		System.out.println("String does not contain \"hi\" or is less than 2 characters");
	    return false;
	  }
		if(Str.substring(0,2).equals("hi"))
		{
			System.out.println("String begins with hi");
			return true;
		}
		System.out.println("String does not contain \"hi\" or is less than 2 characters");		
		return false;
	}
	boolean IcyHot(int Temp1, int Temp2)
	{
		if(Temp1 < 0 && Temp2 > 100 || Temp1 > 100 && Temp2 < 0)
		{
			System.out.println("One value is less than 0 and the other is more that 100");
			return true;
		}
		System.out.println("One value is not less than 0 and the other is more that 100");
		return false;
	}
	boolean In1020(int A, int B)
	{
		if(A >= 10 && A <= 20 || B >= 10 && B <= 20)
		{
			System.out.println("Either number is above 10 but below 20");
			return true;
		}
		System.out.println("Neither number is above 10 but below 20");
		return false;
	}
	boolean HasTeen(int A, int B, int C)
	{
		if(A >= 13 && A <= 19 || B >= 13 && B <= 19 || C >= 13 && C <= 19)
		{
			System.out.println("One of the values is between 13 and 19");
			return true;
		}
		System.out.println("None of the values is between 13 and 19");
		return false;
	}
	boolean LoneTeen(int A, int B)
	{
		if(A == B)
		{
			System.out.println("Numbers are both teen or both not teen");
			return false;
		}
		if(A >= 13 && A <= 19 && B < 13 || B > 19)
		{
			System.out.println("One of the number is a teen");
			return true;
		}
		if(B >= 13 && B <= 19 && A < 13 || A > 19)
		{
			System.out.println("One of the number is a teen");
			return true;
		}	
		System.out.println("Numbers are both teen or both not teen");
		return false;
	}
	String DelDel(String Str)
	{
	  if(Str.length() < 4)
	  {
	    return Str;
	  }
		if(Str.substring(1, 4).equals("del"))
		{
			return Str.charAt(0) + Str.substring(4, Str.length());
		}
		return Str;
	}
	boolean MixStart(String Str)
	{
		if(Str.length() >= 3)
		{
			if(Str.substring(1, 3).equals("ix"))
			{
				System.out.println("String starts with ix");
				return true;
			}
		}
		System.out.println("String does not start with ix");
		return false;
	}
	public String StartOz(String Str) 
	{
	  String NewString = "";
	  if(Str.length() >= 1)
		{
			if(Str.charAt(0) == 'o')
			{
				NewString += "o";
			}
		}
		if(Str.length() >= 2)
		{
			if(Str.charAt(1) == 'z')
			{
				NewString += "z";
			}
		}
		return NewString;
	}
	
	
		














































	
}
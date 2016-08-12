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
		Tasks.MissingChar("Kitten", 1);//Ktten
		Tasks.MissingChar("Kitten", 0);//itten
		Tasks.MissingChar("Kitten", 4);//Kittn
		
		//10 
		Tasks.FrontBack("code");//eodc
		Tasks.FrontBack("a");//a
		Tasks.FrontBack("ab");//ba
		
		//11
		Tasks.Front3("Java");//JavaJavaJava
		Tasks.Front3("Chocolate");//ChoChoCho
		Tasks.Front3("abc");//abcabcabc
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
		String Front = Str.substring(0, N)//Gets the substring from the first letter of the word to the letter before the one we want to exclude.
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














































	
}
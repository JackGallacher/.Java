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
	
}
class Program
{
	public static void main(String[]args)
	{
		Solutions MySolutions = new Solutions();
		
		
		/*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
		We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.*/
		MySolutions.SleepIn(false, false);//true.
		MySolutions.SleepIn(true, false);//false.
		MySolutions.SleepIn(false, true);//true.
		
		/*Given an int n, return the absolute difference between n and 21, 
		except return double the absolute difference if n is over 21.*/
		System.out.println("Difference is: " + Integer.toString(MySolutions.Diff21(19)) + "\n");//Returns 2.
		System.out.println("Difference is: " + Integer.toString(MySolutions.Diff21(10)) + "\n");//Returns 11.
		System.out.println("Difference is: " + Integer.toString(MySolutions.Diff21(21)) + "\n");//Returns 0.
	}
}
class Solutions
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
			Difference  = Difference * 2;
		}		
		return Difference;		
	}	
}
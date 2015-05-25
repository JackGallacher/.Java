public class beersong
{
	public static void main (String [] args)
	{
		int bottles = 99;
		String word = "bottles";
		
		while (bottles > 0)
		{
			if (bottles == 1)
			{
				word = "bottle";
			}
			
			System.out.println(bottles + " " + word + " of beer of the wall");
			System.out.println(bottles + " " + word + " of beer");
			System.out.println("take one down, pass it around");
			bottles--;
			System.out.println(bottles + " " + word + " of beer left of the wall");
			System.out.println("------------------------------------------------");
			
			if (bottles == 0)
			{
				System.out.println("No more bottles of beer on the wall");
			}
		}		
	}
}

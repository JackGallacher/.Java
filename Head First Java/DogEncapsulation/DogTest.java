class Dog
{
	//makes size variable only changeable in this class.
	private int size;
	
	//gets the size value.
	public int getsize()
	{
		return size;
	}
	
	//sets the size value.
	public void setsize(int s)
	{
		size = s;
	}
	
	//bark method.
	void bark()
	{
		if(size > 60)
		{
			System.out.println("woof woof");
		}
		else if(size > 14)
		{
			System.out.println("ruff ruff");
		}
		else
		{
			System.out.println("yap yap");
		}
	}
}

class DogTest
{
	public static void main (String [] args)
	{
		Dog one = new Dog();
		Dog two = new Dog();
		
		one.setsize(65);
		two.setsize(5);
		
		System.out.println("dog one size is: " + one.getsize());
		System.out.println("dog two size is: " + two.getsize());
		
		one.bark();
		two.bark();
	}
}
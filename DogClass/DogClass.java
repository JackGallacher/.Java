class Dog
{
	int size;
	String breed;
	String name;
	
	void bark()
	{
		System.out.println("woof woof!");
	}
}

class DogClass
{
	public static void main (String [] args)
	{
		Dog teddy = new Dog();
		
		teddy.size = 5;
		teddy.breed = "cocker spaniel";
		teddy.name = "teddy";
		teddy.bark();
		
		System.out.println(teddy.size);
		System.out.println(teddy.name);
		System.out.println(teddy.breed);
	}
}
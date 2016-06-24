class Program
{
	public static void main(String[]args)
	{
		//Instantiation and usage of the Calculator class.
		//Calculator MyCalculator = new Calculator();		
		//MyCalculator.Square(5);
		
		//Usage of the Animal class through polymorphism.
		Animal MyAnimal = new Lion();
		MyAnimal.Sound();
		MyAnimal.Diet();
		
		MyAnimal.PrintFromAbstract();//We can acces the abstract class function through the child class.
		
	}
}
class Calculator
{
	int Add(int x, int y)
	{
		return x + y;
	}
	int Subtract(int x, int y)
	{
		return x - y;
	}	
	int Multiply(int x, int y)
	{
		return x * y;
	}
	int Divide(int x, int y)
	{
		return x / y;
	}
	void Square(int x)
	{
		int Result = x * x;
		System.out.format("The square of %s is %s", x, Result);
	}
}

abstract class Animal
{
	abstract void Sound();//We declare these as abstract becuase we want the actual implementation of these to be declared in thier actual child classes. These MUST be overridden.
	abstract void Diet();	
	
	void PrintFromAbstract()
	{
		System.out.println("This is being printed from the abstract class Animal, to get to this we had to instantiate the type of this class through polymorhism of its child class. e.g. Animal x = new Lion();");
	}
	
}
class Lion extends Animal
{
	void Sound()
	{
		System.out.println("ROAR!\n");
	}
	void Diet()
	{
		System.out.println("Meat.\n");
	}
	
}

//Interfaces example
//Method overloading example.
//Input/Output example

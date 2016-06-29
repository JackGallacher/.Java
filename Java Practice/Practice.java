import java.util.Scanner;

class Program
{
	public static void main(String[]args)
	{
		//Instantiation and usage of the Calculator class.
		Calculator MyCalculator = new Calculator();		
		//MyCalculator.Square(5);
		
		//Usage of the Animal class through polymorphism.
		//Animal MyAnimal = new Lion();
		//MyAnimal.Sound();
		//MyAnimal.Diet();		
		//MyAnimal.PrintFromAbstract();//We can acces the abstract class function through the child class.
		
		//Usage of an interface from a class that "implements it".
		//MediaControls Media = new MediaControls();
		//Media.Play();
		//Media.Pause();
		//Media.Record();
		//Media.Stop();
		
		//User input example.
		String MyString;		
		System.out.println("Enter something into the console...");
		
		Scanner Scan = new Scanner(System.in);
		MyString = Scan.nextLine();
	
		System.out.format("You just entered %s\n", MyString);
		
		int FirstInt = 0;
		int SecondInt = 0;
		System.out.println("Enter first number");
		FirstInt = Scan.nextInt();
		
		System.out.println("Enter second number");
		SecondInt = Scan.nextInt();
		
		System.out.format("%s + %s = %s", FirstInt, SecondInt, MyCalculator.Add(FirstInt, SecondInt));		
		System.out.println(Double.toString(MyCalculator.Add(23.8, 17.9)));
		
		Scan.close();
		
		System.out.println("\n" + Integer.toString(FirstInt) + " " + Integer.toString(SecondInt));//Converts int to string and concatinates varaibles into strings.
		
		//Loop example.
		for(int i = 0; i < 10; i++)
		{
			System.out.print(i + " ");
		}		
	}
}

//Class example
class Calculator
{
	//Method Overloading example.
	int Add(int x, int y)
	{
		System.out.println("\nThis returns and int plus an int.");
		return x + y;
	}
	double Add(double x, double y)
	{
		System.out.println("\nThis returns and double plus an double.");
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

//Abstract class and method overloading example.
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
interface Remote
{
	public void Play();
	public void Pause();
	public void Record();
	public void Stop();
}
class MediaControls implements Remote
{
	public void Play()//Implementations of interfaces need to be public.
	{
		System.out.println("Play has been pressed.\n");
	}
	public void Pause()
	{
		System.out.println("Pause has been pressed.\n");
	}
	public void Record()
	{
		System.out.println("Record has been pressed.\n");
	}
	public void Stop()
	{
		System.out.println("Stop has been pressed.\n");
	}
}



































class Program
{
	public static void main(String[]args)
	{
		Calculator MyCalculator = new Calculator();
		
		MyCalculator.Square(5);
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

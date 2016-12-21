package package1;
import static java.lang.System.out;
public class Animal 
{
	void bark()
	{
		out.println("I am barking becuase this is default access.");
	}
	protected void speak(){
		out.println("Woah, I am talking english becuase I am protected!");
	}
}

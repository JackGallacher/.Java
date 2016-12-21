package package2;
import package1.Animal;

public class Dog extends Animal 
{
	public void dogTalk()
	{
		speak();//This works becuase this method is 'protected' in the other package meaning subclases can acces it through inheritance when in another package.
		//bark(); - This function from animal doesnt work becuase it is in a different package and his default access.
	}
}

class Dog
{
	String name;
	public static void main (String [] args)
	{	//make a new dog object and access it.
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "bart";
		
		//make a new dog array.
		Dog[] myDogs = new Dog[3];
		
		//put some dogs in the array.
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = new Dog();
		
		//access dog using array references.
		myDogs[0].name = "fred";
		myDogs[1].name = "bob";
		myDogs[2].name = "terry";
		
		//what is dog number 2's name?
		System.out.println("2nd dog in the array is called " + myDogs[1].name);
		
		//loop through array and tell all dogs to bark
		int i = 0;
		while(i < myDogs.length)
		{
			myDogs[i].bark();
			i++;
		}
		
	}	
	void bark()
	{
		System.out.println(name + " says woof woof!");
	}
}
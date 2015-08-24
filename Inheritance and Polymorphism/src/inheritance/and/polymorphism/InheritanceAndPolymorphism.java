package inheritance.and.polymorphism;

abstract class Animal//superclass
{
    abstract void sound();//classes are abstract, meaning they have to be overridden.
    abstract void diet();
    abstract void family();
};
class Lion extends Animal//subclass of animal
{
    @Override void sound(){System.out.println("ROAR");}//override methods
    @Override void diet(){System.out.println("meat");}
    @Override void family(){System.out.println("feline");}
};
class Lizard extends Animal//subclass of animal
{
    @Override void sound(){System.out.println("Hissss");}//override methods
    @Override void diet(){System.out.println("bugs");}
    @Override void family(){System.out.println("reptile");}
};
class Cow extends Animal//subclass of animal
{
    @Override void sound(){System.out.println("MOOO");}//override methods
    @Override void diet(){System.out.println("grass");}
    @Override void family(){System.out.println("bovine");}
    void hi(){System.out.println("dentistix");}
};

abstract class Canine extends Animal//abstract class canine.
{
   abstract void dogtreatofchoice();
};
class Dog extends Canine//Dog extending the abstact canine class.
{
    @Override void dogtreatofchoice(){System.out.println("dentistix!");} 
    
    @Override void sound(){System.out.println("Woof");}
    @Override void diet(){System.out.println("meat");}
    @Override void family(){System.out.println("canine");}
};
public class InheritanceAndPolymorphism 
{
    public static void main(String[] args) 
    {
       Animal a = new Lion();
       Animal b = new Lizard();
       Animal c = new Cow();
           
       a.sound();
       b.diet();
       c.family();
       
       Canine d = new Dog();
       d.dogtreatofchoice();
       d.sound();  
       
       
       //using the "Object" type allows functions to be made as generic as possible.
       Dog o = new Dog();
       Object p = o;//make a generic object type "p" to store the dog object "o"
       Dog i = (Dog) p; //converting the type object back to dog to use specific dog functions, this dog object is a copy of "Dog o".
       i.diet();// i can now use all of the dog functions.
    }  
}

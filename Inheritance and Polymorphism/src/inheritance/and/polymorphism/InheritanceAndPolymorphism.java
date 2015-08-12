package inheritance.and.polymorphism;

class Animal//superclass
{
    void sound(){System.out.println("default sound");}
    void diet(){System.out.println("default diet");}
    void family(){System.out.println("default family");} 
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
    }  
}

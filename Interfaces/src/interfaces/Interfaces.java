package interfaces;
class Animal
{
    private int height;      
     
    public int setheight(int x){return height = x;}
    public int getheight(){return height;}

    void noise(){System.out.println("default grr...");}
}
class Feline extends Animal
{
    void purr(){System.out.println("purrrrrr, from the Feline class");}
}
class Canine extends Animal
{
    void growl(){System.out.println("grrrrrr, from the Canine class");}
}
interface Pet
{
    abstract void beFriendly();
    abstract void play();
}
class Dog extends Canine implements Pet
{
    @Override public void beFriendly(){System.out.println("this dog is being friendly, overridden from Pet");}
    @Override public void play(){System.out.println("this dog is playing, overridden from Pet");}
    @Override void noise(){System.out.println("bark, overridden from Animal");}
}
class Cat extends Feline implements Pet
{
    @Override public void beFriendly(){System.out.println("this cat is being friendly, overridden from Pet");}
    @Override public void play(){System.out.println("this cat is playing, overridden from Pet");}  
    @Override void noise(){System.out.println("meow, overridden from Animal");}
}
class Lizard implements Pet
{
    @Override public void beFriendly(){System.out.println("this lizard is being friendly, overridden from Pet");}
    @Override public void play(){System.out.println("this lizard is playing, overridden from Pet");}  
}
public class Interfaces 
{  
 public static void main(String[] args) 
    {
       Dog x = new Dog();
       x.growl();
       x.noise();
       x.setheight(7);
       x.play();
       x.beFriendly();
       System.out.println("height is " + x.getheight() + "\n");
       
       Cat z = new Cat();
       z.purr();
       z.noise();
       z.setheight(7);
       z.play();
       z.beFriendly();
       System.out.println("height is " + z.getheight() + "\n");
       
       Lizard y = new Lizard();
       y.beFriendly();
       y.play();   
    }  
}

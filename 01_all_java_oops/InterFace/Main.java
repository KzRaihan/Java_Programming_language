interface Animal{
    void eat();
    // void display();
}
interface  Dog{
    // public void eat();
    void display();
   
}
class Cat implements Animal,Dog{
    public void eat()
    {
        System.out.println("This is the part of Animal");
    }
    public void display()
    {
        System.out.println("This is the part of Dog");
    }
}


public class Main{
    public static void main(String[]args)
    {
        Cat c = new Cat();
        c.eat();
        c.display();
    }
}
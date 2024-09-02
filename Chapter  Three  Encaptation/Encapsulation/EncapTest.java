// Topic : Encapsulation introduction
// packaging variable and method into a single unit
public class info{
    // when default access modifier

    // Fields
    public String name;
    public int age;
    public double mark;

    // method
    public void method_01() {
         System.out.println("Welcome Everyone");
    }
}

public class EncapTest {
    public static void main(String args[]) {
        // create Intro class object
        info obj = new info();

        //  assign  the Intro class Properties using object
        obj.name = "Raihan"; 
        obj.age = 25;
        obj.mark = 85.5;

        // access 
        System.out.println("Name: "+ obj.name);

        // call the method
        obj.method_01();
    }
}
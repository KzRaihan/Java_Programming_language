class Person {
    String name, dep;
    int id, phone;

    // parameterized constructor method
    Person(String name, int id, String dep, int phone) {
        this.name = name;
        this.id = id;
        this.dep = dep;
        this.phone = phone;
    }

    // Normal method
    public void Display() {
        System.out.println("Name     : " + name);
        System.out.println("ID       : " + id);
        System.out.println("Depart   : " + dep);
        System.out.println("Phone    : " + phone);
    }

}
// main class start here
public class Parameterize_Constructor{
    
    public static void main(String[]args)
    {
        // create  first object(Kz)
        Person Kz = new Person("Kz", 4039, "CSE", 333);
        Kz.Display();
        
        // Create second object(Ra)
        System.out.println("\n");
        Person Ra = new Person("Raihan", 4000, "EEE", 222);
        Ra.Display();
        
        System.out.println("\n");
        
        // create Third object (Sk)
        Person Sk = new Person("SK", 4554, "Medical", 111);
        Sk.Display();
        
        System.out.println("\n");
        
        
    }
    
    
}
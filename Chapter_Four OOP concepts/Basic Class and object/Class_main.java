class Person {
    // attribute|field
    public String name;
    int id;
    String dep;
    int mobile;
    // method|function
    public void Person_Action()
    {
        System.out.println("Hello Everyone!");
        System.out.println("Student of SU");
    }
}
public class Class_main {
    public static void main(String[]args)
    {
        // Creating object(Student1) of class person
        Person Student1 = new Person();

        // Accessing direct value using object(Student1)
        Student1.name = "Kz";
        Student1.id = 4039;
        Student1.dep = "CSE";
        Student1.mobile = 428609;
        
        // Access or display the details of object (Student1) by using object
        System.out.println("Name  : " + Student1.name);
        System.out.println("id    : " + Student1.id);
        System.out.println("dep   : " + Student1.dep);
        System.out.println("Mobile: " + Student1.mobile);

        // Access Person class method by using object 
        System.out.println("\n\n");
        Student1.Person_Action();

        System.out.println("\n\n");


    }
}

/*
 * Create class , object, field, method
 * How to minimize(keep down) code (main method code or main class mode)
 */
class person {
    // attribute | field
    String name, dep;
    int id, mobile;

    // Method_01 Set the details or accessing the value
    public void Set_Details(String name, int id, String dep, int mobile)
    {
        this.name = name;
        this.id = id;
        this.dep = dep;
        this.mobile = mobile;
    }

    public void Get_Details()
    {
        System.out.println("Name      : " + name);
        System.out.println("ID        : " + id);
        System.out.println("Department: " + dep);
        System.out.println("Mobile    : " + mobile);
    }
}
public class This_keyword {

    public static void main(String[] args)
    {
        // Create object for class person
        person Student1 = new person(); // first object (Student1)
        Student1.Set_Details("Kz", 4039, "CSE", 8609);
        Student1.Get_Details();
        
        // Second object(Student2)
        System.out.println("\n\n");
        person Student2 = new person();
        Student2.Set_Details("Raihan", 4000, "EEE", 2643);
        Student2.Get_Details();
        
    }
    
}

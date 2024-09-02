/*
 * Create class , object, field, method
 * How to minimize(keep down) code (main method code or main class mode)
 */
class person {
    // attribute | field
    String name, dep;
    int id, mobile;

    // Method_01 Set the details or accessing the value
    public void Set_Details(String S_name, int S_id, String S_dep, int S_mobile)
    {
        name = S_name;
        id = S_id;
        dep = S_dep;
        mobile = S_mobile;
    }

    public void Get_Details()
    {
        System.out.println("Name      : " + name);
        System.out.println("ID        : " + id);
        System.out.println("Department: " + dep);
        System.out.println("Mobile    : " + mobile);
    }
}
public class Class_main_1 {

    public static void main(String[] args)
    {
        // Create object for class person
        person Student1 = new person(); // first object (Student1)
        Student1.Set_Details("Kamruzzaman", 4039, "CSE", 8609);
        Student1.Get_Details();
        
        // Second object(Student2)
        System.out.println("\n\n");
        person Student2 = new person();
        Student2.Set_Details("Raihan", 4000, "EEE", 792643);
        Student2.Get_Details();
        
    }
    
}

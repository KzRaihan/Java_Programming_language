// # this is the first program
// Topic: class and object

public class Person{
    // Attribute
    public String name;
    String id;
    int mobile;
    
    // method
    public void Action_person()
    {
        System.out.println("They can run");
        System.out.println("They can eat");
        System.out.println("They can drink");
    }
    
    // main method
    public static void main(String[] args){
        // crete an object at the same class
        Person object_01 = new Person();
        
        // access variable directly
        object_01.name = "Md Kamruzzaman";
        object_01.id =   "CSE2103024039";
        // object_01.mobile = 9999;
        
        
        // display
        System.out.println("Name: "+object_01.name);
        System.out.println("ID  : "+object_01.id);
        // System.out.println("Name: "+object_01.mobile);
        
        //  access and display the method 
        object_01.Action_person();
    }
    
}
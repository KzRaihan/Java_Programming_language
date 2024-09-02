public class Person_02{
    // Attribute or field or properties
    public String name;
    int id;
    int mobile;
    
    // Get the value
    public void set_value(String nam, int ID, int mob)
    {
        name = nam;
        id = ID;
        mobile = mob;
    }
    
    // method
    // Get the value
    public void get_value()
    {
       System.out.println("Name: "+name);
       System.out.println("ID  : "+id);
       System.out.println("Mobile: "+mobile);
    }
    
    // main method
    public static void main(String[] args){
        // crete an object at the same class
        Person_02 object_01 = new Person_02();
        
        // set the value 
        object_01.set_value("Kz", 4039, 770);
    
        //  access or get the value and display the method 
        object_01.get_value();
    }
    
}
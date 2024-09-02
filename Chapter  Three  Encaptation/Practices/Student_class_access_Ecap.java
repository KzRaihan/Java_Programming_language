public class Student_class_access_Ecap {
    public static void main(String[] args) {
        // create object and set value of name and age (fields)
        Student_class obj = new Student_class("Kz", 23);

        // assign id 
        obj.Set_id("CSE_4039");

        // access first id
        System.out.println(obj.Get_id());
        
        // access Get name
        System.out.println(obj.Get_name());

        // access Get age
        System.out.println(obj.Get_age());
        
    }
}
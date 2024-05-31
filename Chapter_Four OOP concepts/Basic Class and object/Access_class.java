public class Access_class {
    public static void main(String[] args) {
        
        Create_class teacher1 = new Create_class(); // declare object(teacher1) is create

        // Access the Create_class (class) element
        teacher1.name = "Kz";
        teacher1.id = " CSE4039";
        teacher1.mobile = 1770428609;

        System.out.println("Teacher name   : " + teacher1.name);
        System.out.println("Teacher ID     : " + teacher1.id);
        System.out.println("Teacher Mobile : " + teacher1.mobile);
    }
    
} 

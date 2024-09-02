public class intro_2 {

    // attribute or field or variable
    String name = "Kz_Raihan";
    int age = 23; 
    double mark_math = 98.23;
    // To access this Properties we have to create an object otherwise we can't access
    
    public static void main(String[] args) {
        // only within main function properties we can't create any object
     
        // eg_01: main function properties
        String Frist_name = "MD ";
        double mark_java = 95.50;

        // access main fun pro
        System.out.println("First name : " + Frist_name);
        System.out.println("mark java  : " + mark_java);

        // Create an object to access class properties
        intro_2 obj = new intro_2();
        
        // access class properties
        System.out.println("\nName : "+ obj.name);
        System.out.println("age  : "+ obj.age);
        System.out.println("Mark math: "+ obj.mark_math);
    }
}

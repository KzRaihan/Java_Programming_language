class Parent{
    public String name;
    public int age;
    
    // Constructor
    Parent(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    // method
    public void display()
    {
        System.out.println("Name    : "+name);
        System.out.println("Age     : "+age);
    }
}

class Child extends Parent {
    public String address;
    public int mobile;

    // Constructor
    Child(String name, int age, String address, int mobile) {
        super(name, age);
        this.address = address;
        this.mobile = mobile;
    }

    // overriding Method
    public void display() {
        super.display();
        System.out.println("Address : " + address);
        System.out.println("Mobile  : " + mobile);
        System.out.println("\n\n");

    }
}
class Child_2 extends Child{
    public String education = "BUET";
    public String job = "ML engineer";

   
//    public void set_edu(String education)
//    {
//         this.education = education;
//    } 
//    public String get_edu()
//    {
//         // System.out.println("Education: "+ education);
//         return education;
//    }

//    public void set_job(String job)
//    {
//         this.job = job;
//    }
//    public String get_job()
//    {
//         // System.out.println("JOB: "+ job);
//         return job;
//    }
    // overriding Method
    public void display2() {
        // super.display();
        // System.out.println("Education : " + get_edu());
        // System.out.println("Job       : " + get_job());
        System.out.println("Education : " + education);
        System.out.println("Job       : " + job);

        System.out.println("\n\n");
    }

}

public class Main{
    public static void main(String[]args)
    {
        // Child c1 = new Child("Kz", 23, "Dhaka", 770);
        // c1.display();
        
        // BY using Polymorphism 
        Parent P1 = new Parent("Kz", 23);
        P1.display();
        
        System.out.println("\n\n");
        
        P1 = new Child("Kz_Raihan", 23, "DHA", 770);
        P1.display();

        // Parent P2 = new Child_2();
        Child_2 obj = new Child_2();
        // obj.set_edu("SU");
        // obj.set_job("ML Engineer");
        obj.display2();
        
    }
}


class Overload_method {
    // Method: no parameter
    void method() {
        System.out.println("Name: Md Kamruzzaman Raihan");
    }

    // Method: one parameter
    void method(int id) {
        System.out.println("ID: " + id);
    }

    // Method: two parameters (int, String)
    void method(int age, String address) {
        System.out.println("Age      : " + age);
        System.out.println("Address  : " + address);
    }

    // Method: two parameters (String, int) - different order of parameters
    int method(String email, int mobile) {
        System.out.println("Email  : " + email);
        System.out.println("Mobile : " + mobile);
        return mobile;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Overload_method obj1 = new Overload_method();
        obj1.method();
        obj1.method(4039);
        obj1.method(23, "Dhaka");
        obj1.method("kz@gmail.com", 770);
    }
}

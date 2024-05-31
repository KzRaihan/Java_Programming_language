public class ParametrisedMethod_1 {
    
    String name,id;
    int age, phone;

    // Parametrised Method
    void set_method(String n,String i,int a,int p)
    {
        name = n;
        id = i;
        age = a;
        phone = p;
    }

    void get_method()
    {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("age : " + age);
        System.out.println("phone: " + phone);
        
    }
}

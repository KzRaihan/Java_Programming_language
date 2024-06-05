/*
 * Constructor is the special type of method that used to initial the object.
 * Properties:
 *    >> Constructor has the same name as the class name
 *     >> It has no return type not even void
 *     >> It is called automatically  
 * 
 */
public class Constructor_1 {

    String name, id;
    int age;

    // Construction
    Constructor_1(String n,String i,int a)
    {
        name = n;
        id = i;
        age = a;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("ID  : " + id);
        System.out.println("age : " + age);
    }
    
}

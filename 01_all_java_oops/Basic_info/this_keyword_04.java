// Topic: How to use this keyword

public class Person {
    public String name;
    public int age;         // this are public members
    double height; // <- this is the default member
    
    public void set_value(String name, int age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void get_value()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Height: "+this.height);
    }
    
}

public class this_keyword_04 {
    
    public static void main(String[] args) {
        Person obj = new Person();

        obj.set_value("Kz", 23, 5.6);
        obj.get_value();

    }
    
}

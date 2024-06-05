public class Person {
     String name;
     int age;
     double height; // in feet

    // Parameterized constructor
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Method to print all properties
    public void print_Properties() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
    }

    // Method to check if the person's height is greater than 5 feet
    public boolean Check_Hight() {
        return this.height > 5.0;
    }

    // Main method to create objects and use the methods
    public static void main(String[] args) {
        Person person1 = new Person("Kamruzzaman", 25, 5.7);
        Person person2 = new Person("Raihan", 23, 4.2);
        Person person3 = new Person("KzRaihan", 35, 5.9);

        person1.print_Properties();
        System.out.println("Is height greater than 5 feet? " + person1.Check_Hight());
        System.out.println();

        person2.print_Properties();
        System.out.println("Is height greater than 5 feet? " + person2.Check_Hight());
        System.out.println();

        person3.print_Properties();
        System.out.println("Is height greater than 5 feet? " + person3.Check_Hight());

        System.out.println("\n\n");
    }
}
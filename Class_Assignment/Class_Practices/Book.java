/*
 * Question: Create a class in Java named Book with three fields: title, author, and price. 
 * Use a parameterized constructor. Define two user-defined methods:
 *        i. to print all the properties. 
 *        ii. to check whether the price of the book is above $200. 
 *   Create 3 objects and use the methods.
 */
class Book_class {
    // field
    private String title;
    private String author;
    private double price;
    
    // constructor
    public Book_class(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // method to print properties
    public void Book_Properties() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    
    // method to check price above $20
    void Check_price()
    {
        if (price > 200) {
            System.out.println("The price of the book is above $200.");
        }
        else {
            System.out.println("The price of the book is not above $200.");
        }
    }
    
}

public class Book {
    public static void main(String[] args) {
        // object one
        Book_class obj_1 = new Book_class("Java Programming", "Kz_Raihan", 550.50);
        obj_1.Book_Properties();
        obj_1.Check_price();

        System.out.println("\n\n");
        // object two
        Book_class obj_2 = new Book_class("Python", "Raihan", 1080.99);
        obj_2.Book_Properties();
        obj_2.Check_price();

        System.out.println("\n\n");

        // object three
        Book_class obj_3 = new Book_class("C++", "Sk", 190.25);
        obj_3.Book_Properties();
        obj_3.Check_price();

        System.out.println("\n\n");



        
    }
    
}

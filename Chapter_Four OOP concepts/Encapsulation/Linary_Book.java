/*
 * 2.Imagine you are developing a library management system for a university library. 
  You need to create a LibraryBook class that encapsulates details about each book, including its title, author, 
  ISBN (International Standard Book Number), and availability status 
  (whether the book is currently checked out or available on the shelf).Task:
  Your task is to implement the LibraryBook class with the following requirements:
  Private variables: title, author, isbn, and isAvailable.Getter methods for title, author, isbn, and isAvailable.
  Setter method for isAvailable to update the availability status of the book.Ensure appropriate encapsulation and validation:
  Ensure that the availability status (isAvailable) is correctly updated and accessed.

  * Key points:
     class = LIbrary_Book
     private fields (title, author, isbn, isAvailable)
     Setter method = to set the values
     Getter methods = to get the values(availability status is correctly update)
 */
class Encapsulates {
    // private fields
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // * set_title : set the book title
    public void set_title(String title) {
        this.title = title;
    }
    // * get_title: to get the title of book
    public String get_title() {
        return title;
    }

    // set_author: to set the author name
    public void set_author(String author) {
        this.author = author;
    }
    // get_author: to get the author name
    public String get_author() {
        return author;
    }
    
    // set_isbn: to set the ISBN number
    public void set_isbn(String isbn) {
        this.isbn = isbn;
    }
    // get_isbn : to get the isbn number
    public String get_isbn() {
        return isbn;
    }
    
    // set_available: to update the availability status of the book
    public void set_available(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    // get_available: to get the availability status of the book
    public boolean get_available() {
        if (isAvailable == true)
        {
            return isAvailable;
        }
        else {
            return false;
        }
        
    }

    // display all properties at a time
    void display_info()
    {
        System.out.println("Title     : " + get_title());
        System.out.println("Author    : " + get_author());
        System.out.println("ISBN      : " + get_isbn());
        System.out.println("Available : " + get_available());
        System.out.println("\n");
    }

}

public class Linary_Book {
    public static void main(String[] args) {
        Encapsulates obj1 = new Encapsulates();
        // By using object set the or initialize the Book details(fields)
        obj1.set_title("Java Programming language");
        obj1.set_author("KzRaihan");
        obj1.set_isbn("CSE_4039");
        obj1.set_available(true);

        // Display book details
        obj1.display_info();
        
        // Change the availability status of the book
        obj1.set_title("Python Programming language");
        obj1.set_available(false);
        System.out.println("After changing availability status:");
        obj1.display_info();

        
    }
    
}

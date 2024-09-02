/*
  2.Imagine you are developing a library management system for a university library. 
  You need to create a LibraryBook class that encapsulates details about each book,
   including its title, author, ISBN (International Standard Book Number), and 
  availability status (whether the book is currently checked out or available on the shelf).Task:

*   Your task is to implement the LibraryBook class with the following requirements:
*     Private variables: title, author, isbn, and isAvailable.Getter methods for title, author, isbn, and
*     isAvailable.Setter method for isAvailable to update the availability status of the book.
*     Ensure appropriate encapsulation and validation:
*     Ensure that the availability status (isAvailable) is correctly updated and accessed.


write a code in java language without using any built in function
 */

public class LibraryBook {
    // Private variables
    private String title;
    private String author_name;
    private String isbn;
    private boolean isAvailable;

    // Constructor to initialize the book details
     LibraryBook(String title, String author_name, String isbn) {
        this.title = title;
        this.author_name = author_name;
        this.isbn = isbn;
        this.isAvailable = true; // By default, the book is available
    }

    // Getter methods to get title of book
    public String getTitle() {
        return title;
    }

    // get author name
    public String getAuthor() {
        return author_name;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    // Setter method for isAvailable
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public static void main(String[] args) {
        // Create a new LibraryBook instance
        LibraryBook book = new LibraryBook("1984", "George Orwell", "1234567890");

        // Print book details
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Is Available: " + book.getIsAvailable());

        // Update the availability status
        book.setIsAvailable(false);
        System.out.println("Updated Availability: " + book.getIsAvailable());
    }
}

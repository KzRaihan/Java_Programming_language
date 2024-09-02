public class LibraryBook {
    // Private variables
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Default constructor
    public LibraryBook() {
        this.isAvailable = true; // By default, the book is available
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    // Setter methods for book details
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Setter method for isAvailable
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public static void main(String[] args) {
        // Create a new LibraryBook instance
        LibraryBook book = new LibraryBook();

        // Set book details using setter methods
        book.setTitle("To Kill a Mockingbird");
        book.setAuthor("Harper Lee");
        book.setIsbn("978-0061120084");

        // Print book details
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Is Available: " + book.getIsAvailable());

        // Update the book details
        book.setTitle("1984");
        book.setAuthor("George Orwell");
        book.setIsbn("978-0451524935");

        // Print updated book details
        System.out.println("Updated Title: " + book.getTitle());
        System.out.println("Updated Author: " + book.getAuthor());
        System.out.println("Updated ISBN: " + book.getIsbn());

        // Update the availability status
        book.setIsAvailable(false);
        System.out.println("Updated Availability: " + book.getIsAvailable());
    }
}

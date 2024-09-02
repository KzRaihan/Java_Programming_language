public class LibraryBookNoCon {
    // Private variables
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

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
     // Default constructor
    public LibraryBook() {
        this.isAvailable = true; // By default, the book is available
    }

}

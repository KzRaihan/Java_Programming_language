public class libraryBook_test {
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

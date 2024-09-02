public class LibraryBookNoConAccess1{
  public static void main(String[] args) {
    LibraryBookNoCon obj = new LibraryBookNoCon();
        // set value
        obj.setTitle("Learning Python");
        obj.setAuthor("Mark Lutz");
        obj.setIsbn("ISBN-10: 1449355730");
        obj.setIsAvailable(true);

        // get value
        System.out.println("Title       : " + obj.getTitle());
        System.out.println("Author      : " + obj.getAuthor());
        System.out.println("ISBN        : " + obj.getIsbn());
        System.out.println("Is Available: " + obj.getIsAvailable());
  }
}
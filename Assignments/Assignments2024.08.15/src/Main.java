import java.util.List;

public class Main {
    public static void main(String[] args){
        Library library = new Library();

        try {
            library.addBook(new Book("978-0134685991", "Effective Java", "Joshua Bloch", 45.99));
            library.addBook(new Book("978-0201633610", "Design Patterns", "Erich Gamma", 54.99));
            library.addBook(new Book("978-0134685991", null, null, 0));
        } catch (DuplicateBookException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            library.updateBookPrice("978-0134685991", 49.99);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            library.removeBook("978-0134685991");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        List<Book> result = library.searchBookByTitle("Effective");
        System.out.println("Books with title containing 'Effective': " + result);

        List<String> authors = library.getAllAuthors();
        System.out.println("All authors: " + authors);
        
        double totalPrice = library.calculateTotalPrice();
        System.out.println("Total price of books is: " + totalPrice);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static ArrayList<Book> books;
    
    public Library(){
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) throws DuplicateBookException{
        for(Book existingBook : books){
            if(existingBook.getIsbn().equals((book.getIsbn()))){
                throw new DuplicateBookException("Item already exists.");
            }
        }
        books.add(book);
    }

    public void removeBook(String isbn) throws BookNotFoundException{
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                books.remove(book);
                return;
            }
        }
        throw new BookNotFoundException("Book with ISBN " + isbn +  " cant be found.");
    }

    public void updateBookPrice(String isbn, double newPrice) throws BookNotFoundException{
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                book.setPrice(newPrice);
                return;
            }
        }
        throw new BookNotFoundException("Book with ISBN " + isbn + " cant be found.");
    }

    public Book searchBookByIsbn(String isbn){
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                System.out.println("Book found: " + book.getTitle());
                return book;
            }
        }
        return null;
    }

    public List<Book> searchBookByTitle(String title){
        List<Book> result = new ArrayList<>();
        for(Book book :books){
            if(book.getTitle().equals(title)){
                result.add(book);
            }
        }
        return result;
    }

    public List<String> getAllAuthors(){
        List<String> authors = new ArrayList<>();
        for(Book book : books){
            authors.add(book.getAuthor());
        }
        return authors;
    }
    
    public double calculateTotalPrice(){
        double totalPrice = 0.0;
        for(Book book : books){
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }
}

package HashMap;

import java.util.List;

public class Main {
    public static void main(String[] args){
        
        Library library = new Library();

        Book book1 = new Book("Book1", "Emre Ç", "12345", true);
        Book book2 = new Book("Book2", "Efe Ç", "54321", true);

        library.addBook(book1);
        library.addBook(book2);
    
    try {
        User user1 = new User("user1", "Emre");
        library.registerUser(user1);

        library.borrowBook("user1", "12345");
        library.returnBook("user1", "12345");

        List<Book> usersBorrowedBooks = library.getUserBorrowedBook("user1");
        for(Book book : usersBorrowedBooks){
        System.out.println("Borrowed: " + book.getTitle());

        library.removeBook("12345");

        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    
    
    
    
    
    
    
    
    
    }
    
}

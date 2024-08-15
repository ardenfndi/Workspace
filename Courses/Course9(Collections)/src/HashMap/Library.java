package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private HashMap<String, Book> books;
    private HashMap<String, User> users;
    
    public Library(){
        this.books = new HashMap<>();
        this.users = new HashMap<>();
    }

    public void addBook(Book book){
        books.put(book.getISBN(), book);
    }
    
    public void registerUser(User user) throws UserAlreadyExistsException{
        if(users.containsKey(user.getUserId())){
            throw new UserAlreadyExistsException("User with this id already exists");
        }
        users.put(user.getUserId(), user);
    }

    public void borrowBook(String userId, String ISBN) throws BookNotAvailableException, UserNotFoundException, BookLimitExceededException{
        if(!users.containsKey(userId)){
            throw new UserNotFoundException("User not found");
        }
        
        Book book = books.get(ISBN);
        if(book == null || !book.getIsAvailable()){
            throw new BookNotAvailableException("Book not available");
        }

        User user = users.get(userId);
        user.borrowBook(book);
    }

    public void returnBook(String userId, String ISBN) throws UserNotFoundException, BookNotAvailableException{
        if(!users.containsKey(userId)){
            throw new UserNotFoundException("User with this id can not be found.");
        }
        if (!books.containsKey(ISBN)){
            throw new BookNotAvailableException("Book with this ISBN can not be found.");
        }

        Book book = books.get(ISBN);  
        User user = users.get(userId);      
        user.returnBook(book.getISBN());
    }

    public List<Book> getUserBorrowedBook(String userId) throws UserNotFoundException{
        if(!users.containsKey(userId)){
            throw new UserNotFoundException("User with this id can not be found");
        }
        User user = users.get(userId);
        HashMap<String, Book> usersBorrowedBooks = user.getBorrowedBooks();
        
        List<Book> borrowedBooks = new ArrayList<>();
        
        for(String key : usersBorrowedBooks.keySet()){
            Book value = usersBorrowedBooks.get(key);
            borrowedBooks.add(value);
        }
        
        return borrowedBooks;
    }

    public void removeBook(String ISBN) throws BookNotAvailableException{
        if (books.containsKey(ISBN)){
            books.remove(ISBN);
        }
        else {
            throw new BookNotAvailableException("Book with this ISBN can not be found.");
        }
    }
}

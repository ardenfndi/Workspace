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
            throw new UserAlreadyExistsException("User with this ID already exist");
        }
        users.put(user.getUserId(), user);
    }

    public void borrowBook(String userId, String ISBN) throws BookNotAvailableException, UserNotFoundException, BookLimitExceededException{
        if(!users.containsKey(userId)){
            throw new UserNotFoundException("User with this ID does not exist");
        }

        Book book = books.get(ISBN);
        if(book == null || !book.getIsAvailable()){
            throw new BookNotAvailableException("This book is not available right now");
        }
        User user = users.get(userId);
        user.borrowBook(book);                        
    }

    public void returnBook(String userId, String ISBN) throws UserNotFoundException{
        if(!users.containsKey(userId)){
            throw new UserNotFoundException("User with this ID does not exists");
        }
            Book book = books.get(ISBN);
            User user = users.get(userId);
            user.returnBook(book.getISBN());
    }

    public List<Book> getUserBorrowedBooks(String userId) throws UserNotFoundException{
        if(!users.containsKey(userId)){
            throw new UserNotFoundException("User with this ID does not exist");
        }

        User user = users.get(userId);
        HashMap<String, Book> usersBorrowedBook = user.getBorrowedBooks();

        List<Book> borrowedBooks = new ArrayList<>();

        for(String key : usersBorrowedBook.keySet()){
            Book value = usersBorrowedBook.get(key);
            borrowedBooks.add(value);
        }

        return borrowedBooks;

    }

    public void removeBook(String ISBN) throws BookCurrentlyBorrowedException{
        if(books.containsKey(ISBN)){
        books.remove(ISBN);
        }
        else{
            throw new BookCurrentlyBorrowedException("Book is already borrowed");
        }
    }
}

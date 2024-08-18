import java.util.HashMap;

public class User {
    private String userId;
    private String name;
    private HashMap<String, Book> borrowedBooks; 

    public User(String userId, String name){
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }
    
    public String getUserId(){
        return userId;
    }
    
    public void setUserId(String userId){
        this.userId = userId;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public HashMap<String, Book> getBorrowedBooks(){
        return borrowedBooks;
    }
    
    public void setBorrowedBooks(HashMap<String, Book> borrowedBooks){
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) throws BookLimitExceededException{
        if(borrowedBooks.size()>= 5){
            throw new BookLimitExceededException("You cant borrow more books")
        }
        borrowedBooks.put(book.getISBN(), book);
        book.setIsAvailable(false);
    }
    public void returnBook(String ISBN){
        borrowedBooks.remove(ISBN);
    }


    
}

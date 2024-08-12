package Q1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);     
    }
    
    public void lendBook(String title) throws BookNotFoundException, BookAlreadyLentException{
        Book book = findBook(title);
        if(book.getIsLent()){
            throw new BookAlreadyLentException("The book " + title + " is already lent out.");
        }
        
        book.setIsLent(true);
        System.out.println(title + " has been lent out.");
    }

    public Book findBook(String title) throws BookNotFoundException {
        // for(int i = 0; i < books.size(); i++){
        //     if(books.get(i).getTitle().equals(title)){
        //         return books.get(i);
        //     }
        // }

        for(Book book : books){ // For Each loop
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        throw new BookNotFoundException("Book not found");        
    }

    public void returnBook(String title) throws BookNotFoundException, BookNotLentException{
        Book book = findBook(title);
        if(!book.getIsLent()){
            throw new BookNotLentException("Book is not lented already.");
        }
        book.setIsLent(false);
        System.out.println(title + " has been returned.");
    }
    
    
}

package Q5;

public class Book extends LibraryItem {
    private int numberOfPages;
    
    public Book(String title, String author, int yearOfPublication, int numberOfPages){
        super(title, author, yearOfPublication);
        this.numberOfPages = numberOfPages;
    } 
    
    @Override
    public void displayInfo(){
        System.out.println("Book title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of publication: " + getYearOfPublication());
        System.out.println("Number of pages: " + numberOfPages);
    }
    
}

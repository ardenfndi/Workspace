package Q3;

public class Book extends Product {
    public String author;
    
    public Book(String name, double price, int quantity, String author){
        super(name, price, quantity);
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Author: " + author);
    }

    
}

package Q1;

public class Book {
    private String title;
    private String author;
    private boolean isLent;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isLent = false;
    }

    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public boolean getIsLent(){
        return isLent;
    }

    public void setIsLent(boolean isLent){
        this.isLent = isLent;
    }
}

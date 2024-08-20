public class Book extends Item {
    private  String author;
    private int publishedYear;
    private boolean isCheckedOut;

    public Book(int id, String title, String genre, String author, int publishedYear, boolean isCheckedOut){
        super(id, title, genre);
        this.author = author;
        this.publishedYear = publishedYear;
        this. isCheckedOut = isCheckedOut;
    }
    
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPublishedYear(){
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear){
        this.publishedYear = publishedYear;
    }

    public boolean getIsCheckedOut(){
        return isCheckedOut;
    }
    
    public void setCheckedOut(boolean isCheckedOut){
        this.isCheckedOut = isCheckedOut;
    }

    @Override
    public void displayDetails(){
        System.out.println("Author: " + author + " Published year: " + publishedYear + "Checked out: " + isCheckedOut);
    }
    
}

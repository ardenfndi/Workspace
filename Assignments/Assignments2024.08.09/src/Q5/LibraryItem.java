package Q5;

abstract class LibraryItem {
    private String title;
    private String author;
    private int yearOfPublication;

    public LibraryItem(String title, String author, int yearOfPublication){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
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
    public int getYearOfPublication(){
        return yearOfPublication;
    }
    public void setyearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
    public abstract void displayInfo();

    }
    


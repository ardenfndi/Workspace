package Example1;
public class EBook extends Book {
    double filesize;

    public EBook(String title, String author, double price, double filesize){
        super(title, author, price);
        this.filesize = filesize;
    }

    public double getFileSize(){
        return filesize;
    }

    public void setFileSize(double filesize){
        this.filesize = filesize;
    }
    
}

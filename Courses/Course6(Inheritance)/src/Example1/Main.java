package Example1;
public class Main {
    public static void main(String[] args){
        EBook eBook1 = new EBook("Book", "Emre", 100, 99);
        System.out.println("Title is:" + eBook1.getTitle());
        System.out.println("Author is: " +eBook1.getAuthor());
        System.out.println("Price is: " + eBook1.getPrice());
        System.out.println("FileSize is: " + eBook1.getFileSize());
    }    
}

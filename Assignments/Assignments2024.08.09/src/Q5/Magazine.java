package Q5;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, String string, int issueNumber){
        super(title, author, issueNumber);
        this.issueNumber = issueNumber;
    }
    @Override
    public void displayInfo(){
        System.out.println("Magazine title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of publication: " + getYearOfPublication());
        System.out.println("Issue number: " + issueNumber);
    }
    
}

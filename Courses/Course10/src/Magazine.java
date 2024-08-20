public class Magazine extends Item {
    private int issueNumber;
    private String releaseDate;

    public Magazine(int id, String title, String genre, int issueNumber, String releaseDate){
        super(id, title, genre);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
    }

    public int getIssueNumber(){
        return issueNumber;
    }
    
    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber;
    }
    
    public String getReleaseDate(){
        return releaseDate;
    }
    
    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    public void displayDetails(){
        System.out.println(" Issue number: " + issueNumber + " Release date: " + releaseDate);
    }
    
}

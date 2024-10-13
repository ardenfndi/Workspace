public class MovieTest {

    public static void main(String[] args){

        Movie movie1 = new Movie();
        Movie movie2 = new Movie(120, 7, "Film", "Emre");

       

        System.out.println("Movie2 name: " + movie2.getName() + " Movie2 rating: " + movie2.getRating() + " Movie2 duration: " + movie2.getDuration() + " Movie2 director: " + movie2.getDirector()); 
        
        System.out.println(movie2.toString());

        Movie movie3 = new Movie(120, 7, "Film", "Emre");

        System.out.println("Movie2 equals to Movie3 " + movie2.equals(movie3));
    }
    
}

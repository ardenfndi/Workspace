public class Movie {

    private int duration;
    private double rating;
    private String name;
    private String director;


    public Movie(){

        this.duration = 0;
        this.rating = 0.0;
        this.name = ".";
        this.director = ".";

    }

    public Movie(int duration, double rating, String name, String director){

        setDuration(duration);
        setRating(rating);
        this.name = name;
        this.director = director;
    }

    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        if(duration >= 0){
            this.duration = duration;
        }
        else {
        System.out.println("Duration cannot be less than 0");
        }
    }
    public double getRating(){
        return rating;
    }
    public void setRating(double rating){
        if(rating < 10 || rating > 0){
            this.rating = rating;
        }
        else {
            System.out.println("Rating cannot be less than 0 or more than 10");
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    @Override 
    public String toString(){
        return ("Movie name: " + name + " Movie rating: " + rating + " Movie duration: " + duration + " minutes " + " Movie director: " + director);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }
        Movie otherMovie = (Movie) otherObject;
        return duration == otherMovie.duration && name.equals(otherMovie.name) && director.equals(otherMovie.director);
    }


}

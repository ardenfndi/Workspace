public class Car {
    String color;
    String model;
    int tire;
    int year;

    public Car(String color, String model, int tire, int year){

        this.color = color;
        this.model = model;
        this.tire = tire;
        this.year = year;
    }

    public void display(){
        System.out.println("Car model is: " + model);
        System.out.println("Car color is: " + color);
        System.out.println("Car year is: " + year);
        System.out.println("Car has " + tire + " tires.");
    }

    public static void main(String[] args){
        Car myCar = new Car("White", "BMW", 4, 2020);
        myCar.display();
    }
    
}

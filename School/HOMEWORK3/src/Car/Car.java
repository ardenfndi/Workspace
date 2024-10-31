package Car;
public class Car {
    private String model;
    private String color;
    private int year;
    private int total;


   public Car(){
    
    this.model = " ";
    this.color = " ";
    this.year = 0;
    total++;
   }

   public Car(String model, String color, int year){

    this.model = model;
    this.color = color;
    setYear(year);
    total++;
   }

   public String getModel(){
    return model;
   }
   
   public void setModel(String model){
    this.model = model;
   }

   public String getColor(){
    return color;
   }

   public void setColor(String color){
    this.color = color;
   }

   public int getYear(){
    return year;
   }

   public void setYear(int year){
    if(year < 0 || year > 2024){
        this.year = 0;
        System.out.println("Please enter a valid date.");
    }
    else {
        this.year = year;
    }
   }

   @Override
   
   public boolean equals(Object otherObject){
    if(this == otherObject) return true;
    if ( otherObject == null || getClass() != otherObject.getClass()) return false;
    Car car = (Car) otherObject;
    return year ==car.year && model.equals(car.model) && color.equals(car.color);

   }

   @Override

   public String toString(){
    return "Car model: " + model + " Car color: " + color + " Car year: " + year + " Total number of cars created: " + total;
   }
    
}


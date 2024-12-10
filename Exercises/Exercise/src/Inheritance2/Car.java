package Inheritance2;

public class Car extends Vehicle {

    private int numDoors;
    private String engineType;


    public Car(String brand, String model, double price, int numDoors, String engineType){
        super(brand, model, price);
        this.numDoors = numDoors;
        this.engineType = engineType;
    }

    public Car(){
        super("Generic Car", "Basic", 0.0);
        this.engineType = "Hybrid";
        this.numDoors = 4;
    }

    public int getNumDoors(){
        return numDoors;
    }
    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }
    public String getEngineType(){
        return engineType;
    }
    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    @Override
    public String toString(){
        return "Brand: " + getBrand() + " Model: " + getModel() + " Price: " + getPrice() + " Doors: " + numDoors + " Engine: " + engineType;
    }
}

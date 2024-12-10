package Inheritance2;

public class Vehicle {
    private String brand;
    private String model;
    private double price;

    public Vehicle(){
        this.brand = "Toyota";
        this.model = "Corolla";
        this.price = 20000;
    }

    public Vehicle(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    /*@Override
    public boolean equals(Object obj){

        if(obj == null) return false;
        else if( getClass() != obj.getClass()) return false;
        else{

        Vehicle car = (Vehicle) obj;
        return(getBrand().equals(car.getBrand())) 
        && getModel().equals(car.getModel()) 
        && getPrice() == (car.getPrice());
        }
    }
*/
@Override
public boolean equals(Object obj) {
    if (obj == null) return false; 
    if (getClass() != obj.getClass()) return false; 

    Vehicle car = (Vehicle) obj;

    if (getBrand() == null) {
        if (car.getBrand() != null) return false;
    } else if (!getBrand().equals(car.getBrand())) {
        return false;
    }

    if (getModel() == null) {
        if (car.getModel() != null) return false;
    } else if (!getModel().equals(car.getModel())) {
        return false;
    }
    return getPrice() == car.getPrice();
}

    @Override
    public String toString(){
        return "Brand: " + brand + " Model: " + model + " Price: " + price;
    }
}

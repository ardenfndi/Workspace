package Q3;

public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;
    
    public Electronics(String name, double price, int quantity, String brand, int warrantyPeriod){
        super(name, price, quantity);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(int warrantyPeriod){
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    
    public void display(){
        super.display();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty Period: " + warrantyPeriod);
    } 
}

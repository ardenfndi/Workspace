package Inheritance1;
public class Laptop extends ElectronicDevice{
    private int ramSize;
    private int storageSize;
    
    
    public Laptop(){
        super("Generic Laptop", false, 0.0);
        this.ramSize = 16;
        this.storageSize = 512;
    }
    
    public Laptop(String brand, boolean powerStatus, double price, int ramSize, int storageSize){
        super(brand, powerStatus, price);
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public int getRamSize(){
        return ramSize;
    }
    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }
    public int getStorageSize(){
        return storageSize;
    }
    public void setStorageSize(int storageSize){
        this.storageSize = storageSize;
    }

    @Override
    public String toString(){
        return "Brand: " + getBrand() + " Power Status: " + getPowerStatus() + " Price: " + getPrice() + " Ram Size: " + ramSize + " Storage Size: " + storageSize;
    }
}

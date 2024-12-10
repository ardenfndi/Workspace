package Inheritance1;
public class ElectronicDevice {
    private String brand;
    private boolean powerStatus;
    private double price;

    public ElectronicDevice(){
        
        this.brand = "Samsung";
        this.powerStatus = false;
        this.price = 0.0;
        
    }

    public ElectronicDevice(String brand, boolean powerStatus, double price){
        this.brand = brand;
        this.powerStatus = powerStatus;
        this.price = price;
    }
        public String getBrand(){
            return brand;
        }
        public void setBrand(String brand){
            this.brand = brand;
        }
        public boolean getPowerStatus(){
            return powerStatus;
        }
        public void setPowerStatus(boolean powerStatus){
            this.powerStatus = powerStatus;
        }
        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            if(price <= 0){
                System.out.println("Price must be higher than 0");
            } else {
                this.price = price;
            }
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
        
            ElectronicDevice device = (ElectronicDevice) obj;
            return (this.brand != null && this.brand.equals(device.brand)) || (this.brand == null && device.brand == null) && this.price == device.price;
        }


        @Override
        public String toString(){
            return "Brand: " + brand + " Power Status: " + powerStatus + " Price: " + price; 
        }

    
    
    
    
    
    
    
    }


    


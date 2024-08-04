package Example3;

public class PhysicalProduct extends Product{
    
    private double weight;
    private double shippingCost;

    public PhysicalProduct(String name, double price, String description, double weight, double shippingCost){
        super(name, price, description);
        this.weight = weight;
        this.shippingCost = shippingCost;

    }
    
    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getShippingCost(){
        return shippingCost;
    }

    public void setShippingCost(double shippingCost){
        this.shippingCost = shippingCost;
    }
    @Override
    
    public void displayProductInfo(){
        System.out.println("Name of product is: " + getName());
        System.out.println("Price of product is: " + getPrice());
        System.out.println("Description of product is: " + getDescription());
        System.out.println("Weight of the product is: " + weight);
        System.out.println("Shipping cost of the product is: " + shippingCost);
    }
}


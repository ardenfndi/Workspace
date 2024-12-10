package ProductException;
public class ProductDemo {
    public static void main(String[] args) {
        try {
            Date chickenExpiration = new Date(9, 9, 2024);
            Product chickenProduct = new Product("Chicken", chickenExpiration, 10.5);
            System.out.println(chickenProduct);
        } 
            catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }
        try {
            Date meatExpiration = new Date(12, 3, 2024);
            Product meatProduct = new Product("Meat", meatExpiration, -5.0);
            System.out.println(meatProduct);
        } 
            catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }
    }
}
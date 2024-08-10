package Q3;

public class Main {
    public static void main(String[] args){
        Product[] products = new Product[2];

        products[0] = new Book("The Catcher in the Eye", 10.99, 5, "J.D Salinger");
        products[1] = new Electronics("Iphone 14", 999.99, 3, "Apple", 12);

        for ( Product product : products){
            product.display();
            System.out.println();
        }

    }
    
}

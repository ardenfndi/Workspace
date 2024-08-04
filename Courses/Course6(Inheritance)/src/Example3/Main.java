package Example3;

public class Main {
    public static void main(String[] args) {
        // Create an instance of PhysicalProduct
        PhysicalProduct physicalProduct = new PhysicalProduct("Wireless Mouse", 25.99, "A wireless mouse with ergonomic design.", 0.2, 5.99);
        
        // Create an instance of DigitalProduct
        DigitalProduct digitalProduct = new DigitalProduct("E-book \"Java Programming\"", 15.99, "An in-depth guide to Java programming.", 1.5, "http://example.com/download/ebook");

        // Display the details of each product
        System.out.println("Physical Product Information:");
        physicalProduct.displayProductInfo();

        System.out.println("\nDigital Product Information:");
        digitalProduct.displayProductInfo();

        // Abstraction en az 2 örnekli detaylı
        // Polymorphism en az 2 örnekli detaylı
        // OBS (Screen Rec) video programı
    }
}

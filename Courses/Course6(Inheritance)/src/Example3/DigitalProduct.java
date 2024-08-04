package Example3;

// Derived class representing a digital product
class DigitalProduct extends Product {
    // Additional fields for digital product
    private double fileSize;
    private String downloadLink;

    // Constructor to initialize all fields, including inherited fields
    public DigitalProduct(String name, double price, String description, double fileSize, String downloadLink) {
        super(name, price, description); // Call to superclass constructor
        this.fileSize = fileSize;
        this.downloadLink = downloadLink;
    }

    // Getter and setter methods for file size and download link
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    // Override displayProductInfo method to include additional information
    @Override
    public void displayProductInfo() {
        super.displayProductInfo(); // Call superclass method
        System.out.println("File Size: " + fileSize + "MB");
        System.out.println("Download Link: " + downloadLink);
    }
}

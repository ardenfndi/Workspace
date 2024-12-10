package ProductException;
public class Product {
    private String nameOfProduct;
    private Date expirationDate;
    private double priceOfProduct;

    public Product(String nameOfProduct, Date expirationDate, double priceOfProduct) throws InvalidPriceException {
        this.nameOfProduct = nameOfProduct;
        this.expirationDate = expirationDate;
        setpriceOfProduct(priceOfProduct);
    }
    public void setpriceOfProduct(double priceOfProduct) throws InvalidPriceException {
        if (priceOfProduct <= 0) {
            throw new InvalidPriceException("Price must bigger than 0");
        }
        this.priceOfProduct= priceOfProduct;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public double getpriceOfProduct() {
        return priceOfProduct;
    }
    @Override
    public String toString() {
    return "Product name " + nameOfProduct + " Price of product " + priceOfProduct + " Expiration " + expirationDate;
    }
}
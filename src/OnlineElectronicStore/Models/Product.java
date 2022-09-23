package OnlineElectronicStore.Models;
public class Product {
    String productName;
    int productCode;
    String producerName;
    int price;
    int quantity;
    public Product(String productName, int productCode, String producerName, int price, int quantity) {
        super();
        this.productName = productName;
        this.productCode = productCode;
        this.producerName = producerName;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String productName, String producerName, int price, int quantity) {
        super();
        this.productName = productName;
        this.producerName = producerName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductCode() {
        return productCode;
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public String getProducerName() {
        return producerName;
    }
    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Products [productName=" + productName + ", productCode=" + productCode + ", producerName="
                + producerName + ", price=" + (float)price/100 + "€, quantity=" + quantity + "]";
    }
}


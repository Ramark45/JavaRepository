package OnlineElectronicStore.Managers;
import OnlineElectronicStore.Models.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductsManager {
    private static final String ZERO = "0";
    List<Product> products = null;
    int nextUniqueProductCode=0;
    private static ProductsManager instance = null;
    private ProductsManager() {
        this.products = new ArrayList<Product>();
    }
    public static ProductsManager getInstance() {
        if (instance == null)
            instance = new ProductsManager();
        return instance;
    }
    public void addProduct(Product product) {
        if(product == null) {
            System.out.println("Sorry but you've inserted a empty product...");
            return;
        }
        product.setProductCode(nextUniqueProductCode);
        this.products.add(product);
        this.nextUniqueProductCode++;
    }
    public void printAllProducts() {
        System.out.println("----- ALL PRODUCTS -----");

        for (Product p : this.products)
            System.out.println(p.toString());
        System.out.println("------------------------");
    }
    public void searchProducts() {
        try {
            Scanner scannerFloat = new Scanner(System.in);
            System.out.println("Insert max price... else insert 0 ");
            float maxPrice = scannerFloat.nextFloat();
            System.out.println("Insert min price... else insert 0 ");
            float minPrice = scannerFloat.nextFloat();
            Scanner scannerString = new Scanner(System.in);
            System.out.println("Insert product's name ... else insert 0 ");
            String productName = scannerString.nextLine();
            System.out.println("Insert producer's name ... else insert 0 ");
            String producerName = scannerString.nextLine();
            filterSearch(maxPrice, minPrice, productName, producerName);

        }
        catch(Exception e) {
            System.out.println("You have entered something invalid .. Try again!");
        }
    }
    private void filterSearch(float maxPrice, float minPrice, String productName, String producerName) {
        List<Product> mProductsFilter = new ArrayList<Product>();
        for(Product p: this.products) {
            boolean isToInsert = true;
            float price = p.getPrice()/100;
            if(maxPrice != 0 && price > maxPrice)
                isToInsert = false;
            if(minPrice != 0 && price < minPrice)
                isToInsert = false;
            String sProductName = p.getProductName().toLowerCase();
            if(!productName.equals(ZERO) && !sProductName.contains(productName.toLowerCase()))
                isToInsert = false;
            if(isToInsert)
                mProductsFilter.add(p);
        }
        System.out.println("------- Result of the search -------");
        for(Product pr: mProductsFilter)
            System.out.println(pr.toString());
    }
    public boolean buySomeProducts(String operation) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert product's code...");
            int productCode = scanner.nextInt();
            System.out.println("Insert product's quantity...");
            int productQuantity = scanner.nextInt();
            for(Product p: this.products) {
                if(p.getProductCode() == productCode) {
                    if(p.getQuantity() >= productQuantity) {
                        int index = this.products.indexOf(p);
                        this.products.remove(p);
                        p.setQuantity(p.getQuantity() - productQuantity);
                        this.products.add(index,p);
                        System.out.println("Congratulation! You've " + operation + " this product => "
                                + p.getProductName() + " qt = " + productQuantity);
                        checkIfThisProductIsOutOfStock(p);
                        return true;
                    } else {
                        System.out.println("The quantity that you want to " + operation + " is not avaiable...");
                        return false;
                    }
                }
            }
            System.out.println("Product not found... Retry!");
        } catch(Exception e) {
            System.out.println("You have entered something invalid .. Try again!");
        }
        return false;
    }
    private void checkIfThisProductIsOutOfStock(Product product) {
        if(product.getQuantity() == 0)
            System.out.println("This product is out of stock... Please reorder it ." + product.toString());
    }
}


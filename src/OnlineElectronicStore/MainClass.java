package OnlineElectronicStore;
import OnlineElectronicStore.Managers.CredentialsManager;
import OnlineElectronicStore.Managers.ProductsManager;
import OnlineElectronicStore.Models.*;
import OnlineElectronicStore.classes.Operations;

import java.util.Scanner;
public class MainClass {
    private static final String LOG_IN="l";
    private static final String SIGN_UP="s";
    public static void main(String[] args) {
        init();
        System.out.println("WELCOME to my e-commerce");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to Log in (key : l) or Sign Up (key : s) ?");
            String action = scanner.nextLine();
            switch(action) {
                case LOG_IN:
                    logIn();
                    break;
                case SIGN_UP:
                    signUp();
                    break;
                default:
                    System.out.println("Key inserted not valid... Retry!");
            }
        }
    }
    private static void init() {
        User user = new User("Bob", "Smith", new Credentials("bob","b"));
        CredentialsManager.getInstance().signUp(user);

        Product computer = new Product("Computer HP", "HP", 55600, 10);
        Product earphones = new Product("Earphones", "AKG", 3550, 2);
        Product tvXiaomi = new Product("Mi TV LED", "Xiaomi", 27900, 40);
        Product iPad = new Product("iPad", "Apple", 99999, 5);
        Product iPhone = new Product("iPhone X", "Apple", 129999, 2);

        ProductsManager.getInstance().addProduct(computer);
        ProductsManager.getInstance().addProduct(earphones);
        ProductsManager.getInstance().addProduct(tvXiaomi);
        ProductsManager.getInstance().addProduct(iPad);
        ProductsManager.getInstance().addProduct(iPhone);
    }
    private static void logIn() {
        boolean isLoggedIn = false;
        do {
            isLoggedIn = CredentialsManager.getInstance().logIn();
        } while(!isLoggedIn);
        loop : while(true) {
            String operation = Operations.askUserOperation();
            if(operation != null) {
                switch(operation) {
                    case Operations.SEARCH:
                        if(checkIfUserHavePermissions(CredentialsManager.USER, CredentialsManager.getInstance().getTypeOfPersonLoggedIn()))
                            ProductsManager.getInstance().searchProducts();
                        break;
                    case Operations.BUY:
                        if(checkIfUserHavePermissions(CredentialsManager.USER, CredentialsManager.getInstance().getTypeOfPersonLoggedIn()))
                            ProductsManager.getInstance().buySomeProducts(Operations.BUY);
                        break;
                    case Operations.PRINT_PRODUCT:
                        ProductsManager.getInstance().printAllProducts();
                        break;
                    case Operations.LOGOUT:
                        CredentialsManager.getInstance().logout();
                        break loop;
                    default:
                        System.out.println("Oops.. No operations found!");
                }
            }
        }
    }
    private static void signUp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your name...");
        String name = scanner.nextLine();

        System.out.println("Insert your lastname...");
        String lastname = scanner.nextLine();

        System.out.println("Insert username...");
        String username = scanner.nextLine();

        System.out.println("Insert password...");
        String password = scanner.nextLine();

        if(name == null && lastname == null && username == null && password == null) {
            System.out.println("One or more fields were not compiled correctly! Retry!");
            return;
        }
        if(CredentialsManager.getInstance().signUp(new User(name, lastname, new Credentials(username, password)))) {
            System.out.println("Registration was successful!");
            logIn();
        }
    }
    private static boolean checkIfUserHavePermissions(int permissionRequired, int yourPermissions) {
        if(permissionRequired == yourPermissions)
            return true;
        System.out.println("I'm sorry but you don't have the permissions to do this operation...");
        return false;
    }
}


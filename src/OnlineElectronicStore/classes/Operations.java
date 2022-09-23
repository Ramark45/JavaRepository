package OnlineElectronicStore.classes;
import OnlineElectronicStore.Managers.CredentialsManager;
import java.util.Scanner;
public class Operations {
    public static final String SEARCH = "search";
    public static final String BUY = "buy";
    public static final String PRINT_PRODUCT = "p";
    public static final String LOGOUT = "o";

    public static void printOperationThatUserCanDo(int typeOfPersonLoggedIn) {
        System.out.println("######## TYPE OF OPERATIONS YOU CAN DO ########");
        System.out.println("Print products list : (key : p)");
        switch(typeOfPersonLoggedIn){
            case CredentialsManager.USER:
                System.out.println("Search product : (key : search)");
                System.out.println("Buy one product (key : buy)");
                break;
            default:
                System.out.println("Oops something went wrong with type of permissions...");
        }
        System.out.println("Logout : (key : o)");
        System.out.println("####################");
    }
    public static String askUserOperation() {
        System.out.println("Insert key of operation you want to do...");
        return PossibleRequest();
    }
    private static String PossibleRequest() {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        switch(key) {
            case SEARCH:
                return SEARCH;
            case BUY:
                return BUY;
            case PRINT_PRODUCT:
                return PRINT_PRODUCT;
            case LOGOUT:
                return LOGOUT;
            default:
                return null;
        }
    }
}


package mypackage;
import java.util.Scanner;

public class PrintingNameExample {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name :");
        name = input.nextLine();
        System.out.println(name);
    }
}

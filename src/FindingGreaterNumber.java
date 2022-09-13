import java.util.Scanner;

public class FindingGreaterNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter First Value :");
        num1 = input.nextInt();
        System.out.print("Enter Second Value :");
        num2 = input.nextInt();

        if(num1>num2){
            System.out.println("The greater value is "+num1);
        }
        else{
            System.out.println("The greater value is "+num2);
        }
    }
}

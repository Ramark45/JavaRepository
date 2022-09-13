import java.util.Scanner;

public class GretaestAmongThreeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Num1,Num2,Num3;
        System.out.println("Enter Value 1 : ");
        Num1 = input.nextInt();
        System.out.println("Enter Value 2 : ");
        Num2 = input.nextInt();
        System.out.println("Enter Value 3 : ");
        Num3 = input.nextInt();

        if(Num1 > Num2 && Num1 > Num3){
            System.out.println("The Greatest Number is :"+Num1);
        }
        else if(Num2 > Num3){
            System.out.println("The Greatest Number is :"+Num2);
        }
        else{
            System.out.println("The Greatest Number is :"+Num3);
        }

    }
}

import java.util.Scanner;

public class Mango_Tree_Solution {
    public static void main(String args[])

    {

        Scanner s=new Scanner (System.in);

        System.out.print("Enter The Row Dimension :");
        int a=s.nextInt();
        System.out.print("Enter The Column Dimension :");
        int b=s.nextInt();
        System.out.println("Enter The Tree Number :");
        int c=s.nextInt();

        if(c%a==1)

        {

            System.out.println("yes, It's a Mango Tree.");

        }

        else

        {

            System.out.println("No, It's not a mango tree.");

        }

    }
}

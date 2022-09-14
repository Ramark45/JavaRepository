import java.util.Scanner;

public class Mango_Tree_Solution {
    public static void main(String args[])

    {

        Scanner s=new Scanner (System.in);

        System.out.print("Enter The Row Dimension :");
        int row=s.nextInt();
        System.out.print("Enter The Column Dimension :");
        int column=s.nextInt();
        System.out.println("Enter The Tree Number :");
        int tree_number=s.nextInt();

        if(tree_number >= 1 && tree_number <=column){
            System.out.println("It's a mango tree");
        } else if ((tree_number-1)%column==0) {
            System.out.println("It's a mango tree");
        } else if (tree_number % column ==0) {
            System.out.println("It's a mango tree");
        }
        else
            System.out.println("It's not a mango tree");

    }
}

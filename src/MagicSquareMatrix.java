import java.util.Scanner;

public class MagicSquareMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter the array size :");
        size = input.nextInt();
        int array1[][] = new int[size][size];

        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1.length;j++){
                array1[i][j] = input.nextInt();
            }
        }

        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1.length;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }

    }
}

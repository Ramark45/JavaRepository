import java.util.Scanner;
public class MagicSquareMatrix {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of an array :");
        n=sc.nextInt();
        int[][] matrix=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int forDiag=0, backDiag=0;
        int[] rowSum=new int[n];
        int[] colSum=new int[n];
        for (int i=0;i<n;i++){
            rowSum[i]=0;
            colSum[i]=0;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j)
                    forDiag+=matrix[i][j];
                if (i+j==n-1)
                    backDiag+=matrix[i][j];
                rowSum[i]+=matrix[i][j];
                colSum[j]+=matrix[i][j];
            }
        }
        int totalRowSum=0, totalColSum=0;
        for (int i=0;i<n;i++){
            totalRowSum+=rowSum[i];
            totalColSum+=colSum[i];
        }
        totalRowSum=totalRowSum/n;
        totalColSum=totalColSum/n;
        if (totalColSum==totalRowSum&&totalColSum==forDiag&&totalColSum==backDiag)
            System.out.println("It's a magic square.");
        else
            System.out.println("It's not a magic square");

    }
}
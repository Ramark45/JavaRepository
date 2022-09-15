import java.util.Arrays;
import java.util.Scanner;

public class RangeOfArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an array size :");
        int n = input.nextInt();
        int array1[] = new int[n];

        for(int i=0;i<n;i++){
            array1[i]=input.nextInt();
        }
        //int[] array2 = new int[n];
        Arrays.sort(array1);
        int minimum = array1[0];
        int maximum = array1[n-1];
        int range = maximum - minimum;

        System.out.print("Maximal value = "+maximum+"\n");
        System.out.print("Minimal value ="+minimum+"\n");
        System.out.print("Range of an given array is :"+range);
    }
}

import java.util.Scanner;

public class FindingOddEvenArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size;

        System.out.println("Enter the size of an array :");
        size = input.nextInt();

        int array1[] = new int[size];
        System.out.println("Enter the array elements :");
        for(int i=0;i<array1.length;i++){
            array1[i]=input.nextInt();
        }

        FindingArrayType(array1,size);

    }
    public static void FindingArrayType(int[] array,int n){
        int odd=0;int even=0;

        for(int i=0;i<n;i++){
            if(array[i] % 2 == 0)
                even++;
            else if(array[i] % 2 == 1)
                odd++;
        }
        if(even == n){
            System.out.println("Its an even array");
        }
        else if(odd == n){
            System.out.println("Its an odd array");
        }
        else
            System.out.println("Its a mixed array");

    }
}

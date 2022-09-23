import java.util.Scanner;

public class JavaAssessment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size :");
        int n = input.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        System.out.print("Enter the Target :");
        int target = input.nextInt();
        int[] output=indices(numbers,target);
        System.out.print("Indices to add to get target :");
        System.out.println(output[0]+" "+output[1]);

    }
    public static int[] indices(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j=i+1;j<numbers.length; j++) {
                if (numbers[i]+numbers[j] == target)
                    return new int[]{i, j};
            }
            }
        return new int[]{-1,-1};
    }
}



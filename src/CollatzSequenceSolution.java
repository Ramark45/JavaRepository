import java.util.Scanner;

public class CollatzSequenceSolution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt();
        if (n == 1) {
            System.out.println(n+ "\n"+"0");
        }
        else {
            System.out.println(n);
            while (n > 1) {
                if (n % 2 == 0)
                {
                    n = n / 2;
                } else {
                    n = (3 * n) + 1;
                }
                System.out.println(n);
            }
        }
    }
}

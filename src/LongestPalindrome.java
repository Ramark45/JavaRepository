import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if (s == null || s.length() < 2) {
            System.out.println(s);
        }

        int length = s.length();

        boolean[][] isPalindrome = new boolean[length][length];

        int left = 0;
        int right = 0;

        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                boolean isInnerWordPalindrome = isPalindrome[i + 1][j - 1] || j - i <= 2;

                if (s.charAt(i) == s.charAt(j) && isInnerWordPalindrome) {
                    isPalindrome[i][j] = true;

                    if (j - i > right - left) {
                        left = i;
                        right = j;
                    }
                }
            }
        }

        System.out.println(s.substring(left, right + 1));
    }
}

import java.util.Scanner;

public class DayOf_TheWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day of week in number :");
        int day = input.nextInt();
        switch(day){

            case 1:
                System.out.println("It's Sunday");
                break;
            case 2:
                System.out.println("It's Monday");
                break;
            case 3:
                System.out.println("It's Tuesday");
                break;
            case 4:
                System.out.println("It's Wednesday");
                break;
            case 5:
                System.out.println("It's Thursday");
                break;
            case 6:
                System.out.println("It's Friday");
                break;
            case 7:
                System.out.println("It's Saturday");
                break;

            default:
                System.out.println("Please Enter Valid Number.");
        }
    }
}

import java.util.Scanner;

public class OwnWrapperClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();
        MyWrapperClass value = new MyWrapperClass(n);
        System.out.println(value.getBinary());
        System.out.println(value.getInt());
        System.out.println(value.getString());
        System.out.println(value.isOdd());
    }
}
class MyWrapperClass {
    private int number;
    MyWrapperClass(int n){
        number=n;
    }
    public int getInt(){
        return number;
    }
    public String getString(){
        return Integer.toString(number);
    }
    public String getBinary(){
        return Integer.toBinaryString(number);
    }
    public boolean isOdd(){
        if (number%2==1)
            return true;
        else
            return false;
    }

}

import java.util.Scanner;
public class OwnExceptionCreation {
    class InvalidEmployeeIdException extends Exception{

    }
    void checkId(int empId) throws InvalidEmployeeIdException{
        if(empId<=0){
            throw new InvalidEmployeeIdException();
        }else
            System.out.println("Accepted.");
    }
    public static void main(String[] args) {
        OwnExceptionCreation emp = new OwnExceptionCreation();
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Employee ID :");
        int empId = input.nextInt();
        try{
            emp.checkId(empId);
        }

        catch(InvalidEmployeeIdException e){
            //System.out.println(e);
            System.out.println("Invalid Employee ID");
        }
    }


}

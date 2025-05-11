import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * INput mismatch exception 
 * NO. 29
 * Tested and works
 * 
 */
public class InputMismatch {
public static void main(String[] args) {

    boolean flag = true;
    Scanner input = new Scanner(System.in);
    while(flag){
        try {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            System.out.println("You entered "+ num+ ", that is a great Number!");
        } 
        catch(InputMismatchException ex) {
            System.out.println("You can't do that, integers only!");
            input.nextLine();
        }
    }
    input.close();

    
}
    
}

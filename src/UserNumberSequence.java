import java.util.Scanner;
import java.util.ArrayList;

/**
 * Number 26
 * It works amen
 */
public class UserNumberSequence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> sequence = new ArrayList<>();

        boolean flag = true;
        System.out.println("Enter any number to start sequence");
        System.out.println("Enter 0 to stop sequence");

        while (flag) {

            System.out.println("Keep going, enter 0 to stop");
            int value = input.nextInt();
            if (value == 0) {
                flag = false;
                input.close();
                break;
                

            }
            sequence.add(value);

        }
        System.out.println("Your sequence was: " + sequence.toString());

    }

}

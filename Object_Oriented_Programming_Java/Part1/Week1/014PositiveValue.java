
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        if (num > 0) {
            System.out.print("The number is positive.");
        } else {
            System.out.print("The number is not positive.");
        }
    }
}

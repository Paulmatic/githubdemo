
import java.util.*;

public class MenuExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int number1;
        int number2;
        int logic;

        do {
            System.out.println("Choices Available are:");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Divide");
            System.out.println("4 - Multiply");
            System.out.println("0 - Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Performing addition...");
                logic = number1 + number2;
            } else if (choice == 2) {
                System.out.println("Performing subtraction...");
                logic = number1 - number2;
            } else if (choice == 3) {
                System.out.println("Performing division...");
                logic = number1 / number2;
            } else if (choice == 4) {
                System.out.println("Performing multiplication...");
                logic = number1 * number2;
            } else if (choice == 0) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}
    


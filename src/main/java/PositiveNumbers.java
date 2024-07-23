import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (number != 0) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number > 0) {
                System.out.println("You entered a positive number: " + number);
            } else if (number < 0) {
                System.out.println("Your number must be positive.");
            }
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}

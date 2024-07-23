import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number != 5) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        }

        scanner.close();
        System.out.println("You entered 5. The program stops.");
    }
}

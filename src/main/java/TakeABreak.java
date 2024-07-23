import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("yes")) {
            System.out.print("Do you want to take a break? ");
            input = scanner.nextLine();
        }

        scanner.close();
        System.out.println("You decided to take a break!");
    }
}

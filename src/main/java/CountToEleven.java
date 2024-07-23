import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (number < 0 || number >= 11) {
            System.out.print("Enter a number less than 11: ");
            number = scanner.nextInt();
        }

        for (int i = number; i <= 11; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

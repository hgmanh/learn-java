import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false;
        int number;

        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            number = scanner.nextInt();

            // Check if the number is within the valid range
            if ((number >= 0 && number <= 10) || (number >= 90 && number <= 100)) {
                isValidInput = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValidInput);

        System.out.println("You have entered: " + number);

    }
}

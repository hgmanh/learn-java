import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = 3;
        int[] marks = new int[totalStudents];
        int sum = 0;
        double average;

        // Prompt the user for marks of each student
        for (int i = 0; i < totalStudents; i++) {
            boolean isValidInput = false;
            do {
                System.out.print("Enter the mark (0-100) for student " + (i + 1) + ": ");
                int mark = scanner.nextInt();

                // Check if the mark is within the valid range
                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    sum += mark;
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValidInput);
        }

        // Calculate the average
        average = (double) sum / totalStudents;

        // Print the average rounded to 2 decimal places
        System.out.printf("The average is: %.2f%n", average);

        scanner.close();
    }
}

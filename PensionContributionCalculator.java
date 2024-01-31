import java.util.Scanner;
public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Monthly salary is: ");
        double monthlySalary = sc.nextDouble();

        System.out.print("Age is: ");
        int age = sc.nextInt();

        calContribution(monthlySalary, age);
    }
    public static void calContribution(double monthlySalary, int age) {
        double employeeRate;
        double employerRate;

        if (age <= 55) {
            employeeRate = 0.20;
            employerRate = 0.17;
        } else if (age <= 60) {
            employeeRate = 0.13;
            employerRate = 0.13;
        } else if (age <= 65) {
            employeeRate = 0.075;
            employerRate = 0.09;
        } else {
            employeeRate = 0.05;
            employerRate = 0.075;
        }

        double salaryCeiling = 6000;

        double employeeContribution = Math.min(monthlySalary, salaryCeiling) * employeeRate;
        double employerContribution = Math.min(monthlySalary, salaryCeiling) * employerRate;
        double totalContribution = employeeContribution + employerContribution;

        System.out.printf("Employee's contribution: %.2f/n", employeeContribution));
        System.out.printf("Employer's contribution: %.2f/n", employerContribution));
        System.out.printf("Total contribution: %.2f/n", totalContribution));

    }
}


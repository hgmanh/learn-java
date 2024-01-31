import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseInteger(number);

        System.out.println("The reverse is: " + reversedNumber);
    }
    public static int reverseInteger(int number){
        int reverseNumber=0;
        while(number>0){
            int digit = number%10;;
            reverseNumber=reverseNumber*10+digit;
            number = number/10;
        }
        return reverseNumber;
    }   
}

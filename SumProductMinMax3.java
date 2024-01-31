import java.util.Scanner;
public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        printResult(number1, number2, number3);
    }
    public static int Sum3Number(int number1, int number2, int number3){
        int sum;
        sum = number1 + number2 + number3;
        return sum;
    }
    public static int Product3Number(int number1, int number2, int number3){
        int product;
        product=number1*number2*number3;
        return product;
    }
    public static int Max3Number(int number1, int number2, int number3){
        int max = number1;
        if(number2>max){
            max = number2;
        }
        if(number3>max){
            max = number3;
        }
        return max;
    }
    public static int Min3Number(int number1, int number2, int number3){
        int min = number1;
        if(number2<min){
            min = number2;
        }
        if(number3<min){
            min = number3;
        }
        return min;
    }
    public static void printResult(int number1, int number2, int number3) {
        System.out.println("The sum is: " + Sum3Number(number1,number2,number3));
        System.out.println("The product is: " + Product3Number(number1,number2,number3));
        System.out.println("The min is: " + Min3Number(number1,number2,number3));
        System.out.println("The max is: " + Max3Number(number1,number2,number3));
    }
        

}
import java.util.Scanner;
public class CircleComputation{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        printResult(radius);
    }   
    public static double calDiameter(double radius){
        double diameter;
        diameter = 2.0*radius;
        return diameter;
    }
    public static double calArea(double radius){
        double area;
        area = Math.PI*radius*radius;
        return area;
    }
    public static double calCircumference(double radius){
        double circumference;
        circumference = 2.0*Math.PI*radius;
        return circumference;
    }
    public static void printResult(double radius){
        System.out.printf("Diameter is: %.2f%n", calDiameter(radius));
        System.out.printf("Area is: %.2f%n", calArea(radius));
        System.out.printf("Circumference is: %.2f%n", calCircumference(radius));
    }
}
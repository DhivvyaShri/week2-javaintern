import java.util.Scanner;

public class Task4_MethodOperations {

    static double square(double n) {
        return n * n;
    }

    static double cube(double n) {
        return n * n * n;
    }

    static double average(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    static double maximum(double a, double b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its square: ");
        double n = sc.nextDouble();

        System.out.println("Square: " + square(n));
        System.out.println("Cube: " + cube(n));

        System.out.print("Enter three numbers for average: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Average: " + average(a, b, c));

        System.out.print("Enter two numbers to find maximum: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Maximum: " + maximum(x, y));

        sc.close();
    }
}
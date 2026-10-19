import java.util.Scanner;

public class Task3_MethodCalculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    static double modulus(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("\n--- Calculator Results ---");
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));

        if (b != 0) {
            System.out.println("Division: " + divide(a, b));
            System.out.println("Modulus: " + modulus(a, b));
        } else {
            System.out.println("Division: Cannot divide by zero.");
            System.out.println("Modulus: Cannot calculate with zero divisor.");
        }

        sc.close();
    }
}
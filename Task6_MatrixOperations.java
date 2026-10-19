import java.util.Scanner;

public class Task6_MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int sum = 0;

        System.out.println("Enter 9 elements for the 3 x 3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
        }

        System.out.println("\n--- 3 x 3 Matrix ---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nSum of all matrix elements: " + sum);

        sc.close();
    }
}

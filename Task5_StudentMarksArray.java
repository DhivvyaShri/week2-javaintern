import java.util.Scanner;

public class Task5_StudentMarksArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Enter a value from 0 to 100.");
                sc.close();
                return;
            }

            total += marks[i];
        }

        int highest = marks[0];
        int lowest = marks[0];

        System.out.println("\n--- Student Marks ---");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
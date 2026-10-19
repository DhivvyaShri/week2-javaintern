import java.util.Scanner;

public class Task1_StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Subject 1 (out of 100): ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        int mark3 = sc.nextInt();

        if (mark1 < 0 || mark1 > 100 ||
            mark2 < 0 || mark2 > 100 ||
            mark3 < 0 || mark3 > 100) {
            System.out.println("Invalid marks. Enter values from 0 to 100.");
        } else {
            int total = mark1 + mark2 + mark3;
            double percentage = total / 3.0;

            String result;
            if (mark1 >= 35 && mark2 >= 35 && mark3 >= 35) {
                result = "Pass";
            } else {
                result = "Fail";
            }

            System.out.println("\n--- Student Result ---");
            System.out.println("Student Name: " + name);
            System.out.println("Total Marks: " + total + "/300");
            System.out.printf("Percentage: %.2f%%%n", percentage);
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
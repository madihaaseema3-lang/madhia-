import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks > 90) {
            System.out.println("Grade: A");
        }

        if (marks >= 70) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        sc.close();
    }
}

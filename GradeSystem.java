package Project1;
import java.util.*;

public class GradeSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Marks");
        int marks = scanner.nextInt(); // Assume the marks are out of 100
        char grade = calculateGrade(marks);
        System.out.println("The grade is: " + grade);
    }

    public static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

import java.util.Scanner;

public class IT24100452Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Enter marks for 4 subjects for student " + student + ": ");
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += input.nextInt();
            }

            double average = sum / 4;
            String grade;

            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Student " + student + " - Average: " + average + " Grade: " + grade);
        }
    }
}

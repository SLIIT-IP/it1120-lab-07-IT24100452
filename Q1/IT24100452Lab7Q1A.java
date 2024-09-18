import java.util.Scanner;

public class IT24100452Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int subject1, subject2, subject3, subject4;
        double sum, average;
        String grade;
        

        System.out.println("Enter marks for subject 1: ");
        subject1 = input.nextInt();
        
        System.out.println("Enter marks for subject 2: ");
        subject2 = input.nextInt();
        
        System.out.println("Enter marks for subject 3: ");
        subject3 = input.nextInt();
        
        System.out.println("Enter marks for subject 4: ");
        subject4 = input.nextInt();
        

        sum = subject1 + subject2 + subject3 + subject4;
        average = sum / 4;
        

        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        

        System.out.println("Average: " + average + " Grade: " + grade);
    }
}

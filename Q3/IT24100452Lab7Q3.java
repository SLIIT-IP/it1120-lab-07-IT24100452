import java.util.Scanner;

public class IT24100452Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Enter total bill amount for customer " + customer + ": ");
            double billAmount = input.nextDouble();

            System.out.println("Enter payment mode (C/c for Cash, O/o for Other): ");
            char paymentMode = input.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * 0.05;
                double amountTobePaid = billAmount - discount;
                System.out.println("Discount: " + discount + " Amount to be Paid: " + amountTobePaid);

            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applicable. Amount to be Paid: " + billAmount);

            } else {
                System.out.println("Payment Mode is Not Valid");

            }
        }
    }
}

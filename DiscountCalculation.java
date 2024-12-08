package fundamentalsOfProgramming;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input student information
        System.out.print("Enter name of student: ");
        String studentName = input.nextLine();
        System.out.print("Enter number of units enrolled: ");
        int unitsEnrolled = input.nextInt();
        System.out.print("Enter price per unit: ");
        double pricePerUnit = input.nextDouble();

        // Calculate the computed tuition fee
        double computedTuition = unitsEnrolled * pricePerUnit;

        // Calculate tuition fees for different payment modes
        double cashPayment = computedTuition - (computedTuition * 0.10);
        double twoInstallment = computedTuition + (computedTuition * 0.05);
        double threeInstallment = computedTuition + (computedTuition * 0.10);

        // Display the computed tuition and payment modes without '$'
        System.out.printf("\nComputed Tuition fee:%,.2f dollars%n", computedTuition);
        System.out.println(studentName + ", you could avail the following payment modes:\n");
        System.out.printf("Payment Mode:\n");
        System.out.printf("Cash Payment: %,.2f dollars%n", cashPayment);
        System.out.printf("2-installment: %,.2f dollars%n", twoInstallment);
        System.out.printf("3-installment: %,.2f dollars%n", threeInstallment);

        input.close();
    }
}

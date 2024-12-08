package fundamentalsOfProgramming;

import java.util.*;
import java.text.*;

public class discountCalculationdf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,###.00 dollars");
		
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
        System.out.println("\nComputed Tuition fee: " + df.format(computedTuition));
        System.out.println(studentName + ", you could avail the following payment modes:\n");
        System.out.println("Payment Mode:");
        System.out.println("Cash Payment: " + df.format(cashPayment));
        System.out.println("2-installment: " + df.format(twoInstallment));
        System.out.print("3-installment: " + df.format(threeInstallment));

        input.close();
    }
}

package fundamentalsOfProgramming;

import java.util.Scanner;

public class SalesDiscount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input product information
        System.out.print("Enter product: ");
        String product = input.nextLine();
        System.out.print("Enter price: ");
        double price = input.nextDouble();
		
        double discount = 0;
        
        // Discount rates
        if (price <= 10000) {
        	discount = 0;
        }
        else if (price <= 20000) {
        	discount = 0.05;
        }
        else if (price <= 50000) {
        	discount = 0.10;
        }
        else if (price <= 100000) {
        	discount = 0.15;
        }
        else {
        	discount = 0.20;
        }
        
        // Calculating the discount
        double discountAmount = price * discount;
        double netPrice = price - discountAmount;
        
        // Display the discount amount and net price
        System.out.println("\nPrice of " + product + " is " + String.format("%.2f", price));
        System.out.println("Discount is " + String.format("%.2f", discountAmount));
        System.out.println("Net Price is " + String.format("%.2f", netPrice));
        		
	}
}

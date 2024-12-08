package fundamentalsOfProgramming;

import java.util.*;
import java.text.*;

public class salesDiscountdf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("Php ###,###,###.00");
		
		// Input product information
        System.out.print("Enter Product: ");
        String product = input.nextLine();
        System.out.print("Enter Price: ");
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
        System.out.println("\nPrice of " + product + " is Php " + df.format(price));
        System.out.println("Discount is " + df.format(discountAmount));
        System.out.println("Net Price is " + df.format(netPrice));
        		
	}
}

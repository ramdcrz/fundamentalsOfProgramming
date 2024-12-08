package fundamentalsOfProgramming;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sales_Discount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		System.out.print("Enter product: ");
		String product = input.nextLine();
		
		System.out.print("Enter price: ");
		double price = input.nextDouble();
		
		System.out.println("\nPrice of modern router is " + df.format(price));
		double discount = 0;
	
		if (price >= 0 && price <= 10000) {
			discount = price * 0;
			System.out.println("Discount is " + df.format(discount));
		} else if (price >= 10001 && price < 20000) {
			discount = price * 0.05;
			System.out.println("Discount is " + df.format(discount));
		} else if (price >= 20001 && price <= 50000) {
			discount = price * 0.10;
			System.out.println("Discount is " + df.format(discount));
		} else if (price >= 50001 && price <= 100000) {
			discount = price * 0.15;
			System.out.println("Discount is " + df.format(discount));
		} else {
			discount = price * 0.20;
			System.out.println("Discount is " + df.format(discount));
		}
		
		double netPrice = price - discount;
		System.out.println("Net Price is " + df.format(netPrice));
	}
}
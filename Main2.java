package fundamentalsOfProgramming;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Product and price input
        String product1 = "";
        double price1 = 0.0;
        String product2 = "";
        double price2 = 0.0;
        String product3 = "";
        double price3 = 0.0;

        System.out.print("Enter Product 1:\t");
        product1 = scan.nextLine();
        System.out.print("Enter Price:\t\t");
        price1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter Product 2:\t");
        product2 = scan.nextLine();
        System.out.print("Enter Price:\t\t");
        price2 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter Product 3:\t");
        product3 = scan.nextLine();
        System.out.print("Enter Price:\t\t");
        price3 = scan.nextDouble();
        scan.nextLine();

        // Payment terms input
        double cashDiscount = 0.0;
        double months3Interest = 0.0;
        double months6Interest = 0.0;
        double months12Interest = 0.0;

        System.out.println("\nInput Mode of Payment Terms");
        System.out.println("\nCash Discount:\t\t");
        cashDiscount = scan.nextDouble();
        scan.nextLine();
        System.out.println("\tYou input " + df.format(cashDiscount) + "% Discount for Cash");
        System.out.println("\n3 Months Installment:\t");
        months3Interest = scan.nextDouble();
        scan.nextLine();
        System.out.println("\tYou input " + df.format(months3Interest) + "% Interest for 3 Months Installment");
        System.out.println("\n6 Months Installment:\t");
        months6Interest = scan.nextDouble();
        scan.nextLine();
        System.out.println("\tYou input " + df.format(months6Interest) + "% Interest for 6 Months Installment");
        System.out.println("\n12 Months Installment:\t");
        months12Interest = scan.nextDouble();
        scan.nextLine();
        System.out.println("\tYou input " + df.format(months12Interest) + "% Interest for 12 Months Installment");

        System.out.println("\nMain Menu\n");

        // Display menu options
        System.out.println("Press I/i: " + product1);
        System.out.println("\tPrice: $" + df.format(price1) + " dollars");
        System.out.println("Press S/s: " + product2);
        System.out.println("\tPrice: $" + df.format(price2) + " dollars");
        System.out.println("Press X/x: " + product3);
        System.out.println("\tPrice: $" + df.format(price3) + " dollars");

        System.out.print("\nEnter Item:\t");
        char item = scan.next().charAt(0);

        // Process the selected item
        String selectedProduct = "";
        double selectedPrice = 0.0;
        int selectedPaymentOption = 0;
        double discount = 0.0;
        double interest = 0.0;
        double totalAmount = 0.0;
        double monthlyAmortization = 0.0;

        if (item == 'I' || item == 'i') {
            selectedProduct = product1;
            selectedPrice = price1;
        } else if (item == 'S' || item == 's') {
            selectedProduct = product2;
            selectedPrice = price2;
        } else if (item == 'X' || item == 'x') {
            selectedProduct = product3;
            selectedPrice = price3;
        } else {
            // Handle invalid item choice
            selectedProduct = "Error";
            selectedPrice = 0.0;
            discount = 0.0;
            interest = 0.0;
            totalAmount = 0.0;
            monthlyAmortization = 0.0;
        }

        if (item == 'I' || item == 'i' || item == 'S' || item == 's' || item == 'X' || item == 'x') {
            System.out.println("Product:\t" + selectedProduct);
            System.out.println("Price:\t\t$" + df.format(selectedPrice) + " dollars");
            System.out.println("\nPress 1: Cash\t\t\t" + df.format(cashDiscount) + "% Discount");
            System.out.println("Press 2: 3 Months Installment\t" + df.format(months3Interest) + "% Interest");
            System.out.println("Press 3: 6 Months Installment\t" + df.format(months6Interest) + "% Interest");
            System.out.println("Press 4: 12 Months Installment\t" + df.format(months12Interest) + "% Interest");
            System.out.print("\nEnter Mode of Payment:\t");
            selectedPaymentOption = scan.nextInt();
            switch (selectedPaymentOption) {
                case 1:
                    discount = selectedPrice * (cashDiscount / 100);
                    break;
                case 2:
                    interest = (selectedPrice * (months3Interest / 100)) / 3;
                    break;
                case 3:
                    interest = (selectedPrice * (months6Interest / 100)) / 6;
                    break;
                case 4:
                    interest = (selectedPrice * (months12Interest / 100)) / 12;
                    break;
                default:
                    // Handle invalid payment choice
                    selectedProduct = "Error";
                    selectedPrice = 0.0;
                    discount = 0.0;
                    interest = 0.0;
                    totalAmount = 0.0;
                    monthlyAmortization = 0.0;
            }
            totalAmount = selectedPrice - discount + interest;
            monthlyAmortization = interest / (selectedPaymentOption == 2 ? 3 : (selectedPaymentOption == 3 ? 6 : 12));
        }

        // Display the final result
        System.out.println("\nMode of Payment:\t\t" + getPaymentType(selectedPaymentOption));
        System.out.println("Item:\t\t\t\t" + selectedProduct);
        System.out.println("Price:\t\t\t\t$" + df.format(selectedPrice) + " dollars");
        System.out.println("Discount:\t\t\t$" + df.format(discount) + " dollars");
        System.out.println("Interest:\t\t\t$" + df.format(interest) + " dollars");
        System.out.println("Total Amount:\t\t\t$" + df.format(totalAmount) + " dollars");
        System.out.println("Monthly Amortization:\t\t$" + df.format(monthlyAmortization) + " dollars");
    }

    public static String getPaymentType(int choice) {
        switch (choice) {
            case 1:
                return "Cash";
            case 2:
                return "3 Months Installment";
            case 3:
                return "6 Months Installment";
            case 4:
                return "12 Months Installment";
            default:
                return "Error";
        }
    }
}

package fundamentalsOfProgramming;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare DecimalFormat
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Declare variables
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
        System.out.println();

        System.out.print("Enter Product 2:\t");
        product2 = scan.nextLine();
        System.out.print("Enter Price:\t\t");
        price2 = scan.nextDouble();
        scan.nextLine();
        System.out.println();

        System.out.print("Enter Product 3:\t");
        product3 = scan.nextLine();
        System.out.print("Enter Price:\t\t");
        price3 = scan.nextDouble();
        scan.nextLine();
        System.out.println();

        System.out.println("Input Mode of Payment Terms");
        System.out.println();

        double cash = 0.0;
        double _3months = 0.0;
        double _6months = 0.0;
        double _12months = 0.0;

        System.out.print("Cash Discount:\t\t");
        cash = scan.nextDouble();
        System.out.println("\tYou input " + df.format(cash) + "% Discount for Cash");
        System.out.println();
        System.out.print("3 Months Installment:\t");
        _3months = scan.nextDouble();
        System.out.println("\tYou input " + df.format(_3months) + "% Interest for 3 Months Installment");
        System.out.println();
        System.out.print("6 Months Installment:\t");
        _6months = scan.nextDouble();
        System.out.println("\tYou input " + df.format(_6months) + "% Interest for 6 Months Installment");
        System.out.println();
        System.out.print("12 Months Installment:\t");
        _12months = scan.nextDouble();
        System.out.println("\tYou input " + df.format(_12months) + "% Interest for 12 Months Installment");
        System.out.println();

        System.out.println("Main Menu");
        System.out.println();

        // Display menu options
        System.out.println("Press I/i: " + product1);
        System.out.println("\tPrice: $" + df.format(price1) + " dollars");
        System.out.println("Press S/s: " + product2);
        System.out.println("\tPrice: $" + df.format(price2) + " dollars");
        System.out.println("Press X/x: " + product3);
        System.out.println("\tPrice: $" + df.format(price3) + " dollars");
        System.out.println();

        System.out.print("Enter Item:\t");
        char item = scan.next().charAt(0);

        // Process the selected item
        String selectedProduct = "";
        double selectedPrice = 0.0;

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
            System.out.println("Mode of Payment: Error");
            System.out.println("Item: Error");
            System.out.println("Price: $.00 dollars");
            System.out.println("Discount: $.00 dollars");
            System.out.println("Interest: $.00 dollars");
            System.out.println("Total Amount: $.00 dollars");
            System.out.println("Monthly Amortization: $.00 dollars");
            scan.close();
            return;
        }

        System.out.println("Product:\t" + selectedProduct);
        System.out.println("Price:\t\t$" + df.format(selectedPrice) + " dollars");

        // Display payment options
        System.out.println("Press 1: Cash\t\t\t" + df.format(cash) + "% Discount");
        System.out.println("Press 2: 3 Months Installment\t" + df.format(_3months) + "% Interest");
        System.out.println("Press 3: 6 Months Installment\t" + df.format(_6months) + "% Interest");
        System.out.println("Press 4: 12 Months Installment\t" + df.format(_12months) + "% Interest");
        System.out.print("Enter Mode of Payment:\t\t");

        int paymentChoice = scan.nextInt();
        double discount = 0.0;
        double interest = 0.0;

        switch (paymentChoice) {
            case 1:
                discount = selectedPrice * (cash / 100);
                break;
            case 2:
                interest = (selectedPrice * (_3months / 100)) / 3;
                break;
            case 3:
                interest = (selectedPrice * (_6months / 100)) / 6;
                break;
            case 4:
                interest = (selectedPrice * (_12months / 100)) / 12;
                break;
            default:
                // Handle invalid payment choice
                System.out.println("Invalid choice for mode of payment");
                scan.close();
                return;
        }

        double totalAmount = selectedPrice - discount + interest;
        double monthlyAmortization = interest / (paymentChoice == 2 ? 3 : (paymentChoice == 3 ? 6 : 12));

        System.out.println("Mode of Payment: " + getPaymentType(paymentChoice));
        System.out.println("Item: " + selectedProduct);
        System.out.println("Price: $" + df.format(selectedPrice) + " dollars");
        System.out.println("Discount: $" + df.format(discount) + " dollars");
        System.out.println("Interest: $" + df.format(interest) + " dollars");
        System.out.println("Total Amount: $" + df.format(totalAmount) + " dollars");
        System.out.println("Monthly Amortization: $" + df.format(monthlyAmortization) + " dollars");

        scan.close();
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
                return "Invalid Payment Type";
        }
    }
}

package fundamentalsOfProgramming;

import java.util.Scanner;
import java.text.*;
public class Main4 {

    public static void main(String[] args){

    Scanner scan=new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("###,###,###.00");

    String product_1 = "";
    double price_1 = 0.0;
    String product_2 = "";
    double price_2 = 0.0;
    String product_3 = "";
    double price_3 = 0.0;
    double cash = 0.0;
    double threeInstall = 0.0;
    double sixInstall = 0.0;
    double twelveInstall = 0.0;
    char item;
    char mode;

    System.out.print("Enter Product 1:\t");
    product_1 = scan.nextLine();
    System.out.print("Enter Price:\t\t");
    price_1 = scan.nextDouble();
    scan.nextLine(); //use this syntax because nextDouble() does not consume the newline character
    System.out.println("");

    System.out.print("Enter Product 2:\t");
    product_2 = scan.nextLine();
    System.out.print("Enter Price:\t\t");
    price_2 = scan.nextDouble();
    scan.nextLine();
    System.out.println("");

    System.out.print("Enter Product 3:\t");
    product_3 = scan.nextLine();
    System.out.print("Enter Price:\t\t");
    price_3 = scan.nextDouble();
    System.out.println("");

    scan.nextLine();

    System.out.println("Input Mode of Payment Terms ");
    System.out.println();
        
    System.out.print("Cash Discount:\t\t");
    cash = scan.nextDouble();
    System.out.print("\tYou input " + df.format(cash) + "% Discount for Cash");

    System.out.println("");
    System.out.print("\n3 Months Installment:\t");
    threeInstall = scan.nextDouble();
    System.out.print("\tYou input " + df.format(threeInstall) + "% Discount for 3 Months Installment");

    System.out.println("");
    System.out.print("\n6 Months Installment:\t");
    sixInstall = scan.nextDouble();
    System.out.print("\tYou input " + df.format(sixInstall) + "% Discount for 6 Months Installment");

    System.out.println("");
    System.out.print("\n12 Months Installment:\t");
    twelveInstall = scan.nextDouble();
    System.out.print("\tYou input " + df.format(twelveInstall) + "% Discount for 12 Months Installment");

    System.out.println();
        
    System.out.println("\nMain Menu");
    System.out.println();

    System.out.print("Press I/i: " + product_1);
    System.out.print("\n\tPrice:$" + df.format(price_1) + " dollars");
    System.out.print("\nPress S/s: " + product_2);
    System.out.print("\n\tPrice:$" + df.format(price_2) + " dollars");
    System.out.print("\nPress X/x: " + product_3);
    System.out.print("\n\tPrice:$" + df.format(price_3) + " dollars");

    System.out.println();
    String product="";
    double price = 0.0;
    System.out.print("\nEnter Item:\t");
    item = scan.next().charAt(0);
    item = Character.toLowerCase(item);
    switch(item) {
    	case 'i':
            product=product_1;
            price=price_1;
            break;
    	case 's':
            product=product_2;
            price=price_2;
            break;
    	case 'x':
            product=product_3;
            price=price_3;
            break;
        default:
            System.out.println("\nMode of Payment: \t\t" + "Error");
            System.out.println("Item:\t\t\t\t" + "Error");
            System.out.println("Price:\t\t\t\t$" + ".00 dollars");
            System.out.println("Discount:\t\t\t$" + ".00 dollars");
            System.out.println("Interest:\t\t\t$" + ".00 dollars");
            System.out.println("Total Amount:\t\t\t$" + ".00 dollars");
            System.out.println("Monthly Amortization:\t\t$" + ".00 dollars");
            System.exit(0);
            break;
    }

    
            System.out.println("Product:\t"+ product);
    		System.out.println("Price:\t\t$"+ df.format(price) + " dollars");

    		System.out.println("\nPress 1: Cash\t\t\t"+ df.format(cash)+ "% Discount");
			System.out.println("Press 2: 3 Months Installment\t"+ df.format(threeInstall)+"% Interest");
			System.out.println("Press 3: 6 Months Installment\t"+ df.format(sixInstall)+"% Interest");
			System.out.println("Press 4: 12 Months Installment\t"+ df.format(twelveInstall)+"% Interest");
			System.out.println();
            System.out.print("Enter Mode of Payment:\t\t");
            mode = scan.next().charAt(0);

    String mop;
    double modeDiscount = 0.0;
    double modeInterest = 0.0;
    int x = 0;
        switch(mode)
        {
            case '1':
                mop = "Cash";
                modeDiscount = cash / 100;
                x = 1;
                break;
            case '2':
                mop = "3 Months Installment";
                modeInterest = threeInstall / 100;
                x = 2;
                break;
            case '3':
                mop = "6 Months Installment";
                modeInterest = sixInstall / 100;
                x = 3;
                break;
            case '4':
                mop = "12 Months Installment";
                modeInterest = twelveInstall / 100;
                x = 4;
                break;
            default:
                mop = "Error";
                break;
            }

    double discount = price*modeDiscount;
    double interest = price*modeInterest;
    double total = 0.0;
    double monthlyAmor = 0.0;
    if(x==1){
        monthlyAmor = 0.0;
        total = price - discount;
    }
    else if(x==2){
        monthlyAmor = total / 3;
        total = price + interest;
    }
    else if(x==3){
        monthlyAmor = total / 6;
        total = price + interest;
    }
    else {
        monthlyAmor = total / 12;
        total = price + interest;
    }
    scan.close();
        
System.out.println("Mode of Payment: \t\t" + mop);
System.out.println("Item:\t\t\t\t" + product);
System.out.println("Price:\t\t\t\t$" + df.format(price) + " dollars");
System.out.println("Discount:\t\t\t$" + df.format(discount) + " dollars");
System.out.println("Interest:\t\t\t$" + df.format(interest) + " dollars");
System.out.println("Total Amount:\t\t\t$" + df.format(total) + " dollars");
System.out.println("Monthly Amortization:\t\t$" + df.format(monthlyAmor) + " dollars");
    }
}

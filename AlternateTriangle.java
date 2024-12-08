package fundamentalsOfProgramming;

import java.util.Scanner;

public class AlternateTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, num;
        char firstChar, secondChar;
        

        System.out.print("Enter First Character: ");
        firstChar = input.nextLine().charAt(0);

        System.out.print("Enter Second Character: ");
        secondChar = input.nextLine().charAt(0);

        System.out.print("Enter Size: ");
        num = input.nextInt();

        for (i = 1; i <= num; i++) {
            for (j = 2; j <= i; j++) {
            	if (i == 1) {
            		System.out.print("");
            	} else {
            		System.out.print("-");
            	}
            }
            if ((i % 2) >= 1) {
            	System.out.println(firstChar);
            } if (i % 2 == 0) {
                System.out.println(secondChar);
            }
        }
    }
}

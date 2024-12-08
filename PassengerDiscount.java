package fundamentalsOfProgramming;

import java.util.*;
import java.text.*;

public class PassengerDiscount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###.00 Pesos");

        char passengerType;
        char travelBusinessClass;

        System.out.print("Enter Discount for Ordinary Passenger: ");
        int discountOrdinary = input.nextInt();
        System.out.print("Business class additional Fare for Ordinary Passenger: ");
        double businessClassFareOrdinary = input.nextDouble();

        System.out.print("\nEnter Discount for Student Passenger: ");
        int discountStudent = input.nextInt();
        System.out.print("Business class additional Fare for Student Passenger: ");
        double businessClassFareStudent = input.nextDouble();

        System.out.print("\nEnter Discount for Senior Citizen Passenger: ");
        int discountSeniorCitizen = input.nextInt();
        System.out.print("Business class additional Fare for Senior Citizen Passenger: ");
        double businessClassFareSeniorCitizen = input.nextDouble();

        System.out.print("\nEnter fare: ");
        double fare = input.nextDouble();

        System.out.print("Passenger type [O,S,C]: ");
        passengerType = input.next().charAt(0);
        System.out.print("Travelling in business class [Y/N]: ");
        travelBusinessClass = input.next().charAt(0);

        double discount = 0;
        double businessClassCharge = 0;

        switch (passengerType) {
            case 'O':
            case 'o':
                discount = discountOrdinary;
                businessClassCharge = (travelBusinessClass == 'Y' || travelBusinessClass == 'y') ? businessClassFareOrdinary : 0;
                break;
            case 'S':
            case 's':
                discount = discountStudent;
                businessClassCharge = (travelBusinessClass == 'Y' || travelBusinessClass == 'y') ? businessClassFareStudent : 0;
                break;
            case 'C':
            case 'c':
                discount = discountSeniorCitizen;
                businessClassCharge = (travelBusinessClass == 'Y' || travelBusinessClass == 'y') ? businessClassFareSeniorCitizen : 0;
                break;
            default:
                System.out.println("Invalid passenger type.");
                System.exit(1);
        }

        double discountAmount = (fare * discount) / 100;
        double newFare = fare - discountAmount + businessClassCharge;

        System.out.println("\nDiscount: " + df.format(discountAmount));
        System.out.println("Business class charge: " + df.format(businessClassCharge));
        System.out.println("\nNew fare: " + df.format(newFare));
    }
}

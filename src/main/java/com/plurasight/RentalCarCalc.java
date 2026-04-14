package com.plurasight;

import java.util.Scanner;

public class RentalCarCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Constants
        double dailyRate = 29.99;
        double tollTagRate = 3.95;
        double gpsRate = 2.95;
        double roadsideRate = 3.95;

    // User input
        System.out.print("Enter Pickup date: ");
        String pickupDate = scanner.nextLine();

        System.out.print("Enter Number Of Rental Days;  ");
        int days = scanner.nextInt();
        scanner.nextLine(); // Buffer

        System.out.print("Add Electronic Toll Tag (yes/no)? ");
        String tollTag = scanner.nextLine();

        System.out.print("Add A GPS (yes/no)?  ");
        String gps = scanner.nextLine();

        System.out.print("Add RoadSide Assistance? (Yes/No)  ");
        String roadside = scanner.nextLine();
        System.out.print("Enter your age:  ");
        int age = scanner.nextInt();

    // Calculatoins
    double basicCosts = days * dailyRate;
    double optionsCost = 0;
        
    if (tollTag.equalsIgnoreCase("yes")) {
        optionsCost += days * tollTagRate;
        }
    if (roadside.equalsIgnoreCase("yes")) {
        optionsCost += days * roadsideRate;
    }
    if (gps.equalsIgnoreCase("yes")) {
        optionsCost += days * gpsRate;
    }
    int surcharge = 0;
    if (age < 25) {
        surcharge = (int) (basicCosts * 0.30);
    }
    double totalCost = basicCosts + optionsCost + surcharge;
    // Output
        System.out.println("\n-- Rental Summary ---");
        System.out.println("Pickup Date: " + pickupDate);

        System.out.printf("Basic rental cost: $%.2f%n", basicCosts);
        System.out.printf("Options cost: $%.2f%n", optionsCost);
        System.out.printf("Underage Surcharge: $%.2f%n", (double)surcharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);

        scanner.close();
    }
}

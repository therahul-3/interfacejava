package com.tnsif.day4;


import java.util.Scanner;

public class UserInterface {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the customer name:");
	        String customerName = scanner.nextLine();
	        System.out.println("Enter the phone number:");
	        String phoneNumber = scanner.nextLine();
	        System.out.println("Enter the street name:");
	        String streetName = scanner.nextLine();
	        System.out.println("Enter the bill amount:");
	        double billAmount = scanner.nextDouble();
	        System.out.println("Enter the distance:");
	        int distance = scanner.nextInt();

	        CustomerDetails customer = new CustomerDetails(customerName, phoneNumber, streetName, billAmount, distance);

	        // Display customer details
	        System.out.println("Customer name: " + customer.getCustomerName());
	        System.out.println("Phone number: " + customer.getPhoneNumber());
	        System.out.println("Street name: " + customer.getStreetName());

	        // Calculate and display bonus points
	        double bonusPoints = customer.calculateBonusPoints();
	        System.out.println("Bonus points: " + bonusPoints);

	        // Calculate and display delivery charges
	        double deliveryCharge = customer.deliveryCharge();
	        System.out.println("Delivery charge: " + deliveryCharge);

	        scanner.close();
	    }
	}


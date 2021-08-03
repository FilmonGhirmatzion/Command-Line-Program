package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */

public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the bill amount: ");
		String userBillAmount = input.nextLine();
		double billAmount = Double.parseDouble(userBillAmount);

		System.out.println("Enter the tender amount: ");
		String userTenderAmount = input.nextLine();
		double tenderAmount = Double.parseDouble(userTenderAmount);

		Double changeRequired = tenderAmount - billAmount;

		System.out.println("The change required is " + changeRequired);

	}

}

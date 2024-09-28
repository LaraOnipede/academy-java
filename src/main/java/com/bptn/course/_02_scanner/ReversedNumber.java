package com.bptn.course._02_scanner;

import java.util.Scanner;

public class ReversedNumber {

	public static void main(String[] args) {
		// create a scanner object
		Scanner scanner = new Scanner (System.in);
		
		//request an input from a user
		System.out.println("Enter a number to reverse: ");
		
		//Read the number inputed by user
		int number = scanner.nextInt();
		
		//Initialized thr reversed number to 0
		
		int reversedNumber = 0;
		//Use a while loop to reverse the number
		while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append the digit to reversed number
            number /= 10;  // Remove the last digit from the original number
        }
		
		//Print out reversed number 
		System.out.println("Reversed number: " + reversedNumber);
		
		//Close the scanner
		scanner.close();
		
		

	}

}

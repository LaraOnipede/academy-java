package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		//Create a new string
		//String is a class that comes with it's own predefined methods. with their unique functions
		//length()	 : returns the length of a string	
		String s = "Lara does hard things";
		
		// Find the length of the string and store it in a variable
		int stringLength = s.length();
		
		System.out.println("The length of s is " + stringLength);
		
		//substring() method to get part of the string
		
		String sub = s.substring(0, 5);
		
		System.out.println("The substring with start indeex 0 and end index 5: " + sub);
		
		String sub1 = s.substring(3);
		
		System.out.println("The substring with start index 3 " + sub1);
		
		//Convert all the letters of the string to lowercase
		String lowerCaseString = s.toLowerCase();
		
		System.out.println("The lowercase of the string is: " + lowerCaseString);
		
		String upperCaseString = s.toUpperCase();
		
		System.out.println("The uppercase of the string is: " + upperCaseString);
		
		
		int index = s.indexOf("Lara");
		
		System.out.println("the index of Lara is : "+ index);
		
		char c =  s.charAt(0);
		
		System.out.println("the character at index 0: "+ c);
		
		//Reverse the world using a for loop declaration
		
	}
}

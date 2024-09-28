package com.bptn.course.teamwork;

public class ClassRoom {

	public static void main(String[] args) {
		//syntax of an array dataType[] arrayName;
		
		// Array with variable name student that can store strings
		String[] students;
		// Specify the size of array students
		students = new String[6];
		
		//properties of an array. the array students will only be able to accommodate 6 strings
		
		//arrays are indexed beginning from 0
		students[0] = "Jessi";
		
		//print out student to see if Jessi have been added to the array
		System.out.println(students[0]);
		
		//Homogeneous data: an array can only hold data of one type
		//students[1] = 5; //This is going to throw an error showing that the array student cannot accept a number 
		
		//Mutability: Individual elements of an array can be changed or modified
		students[0] = "Lara";
		System.out.println(students[0]);
		
		

	}

}

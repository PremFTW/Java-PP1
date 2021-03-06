/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Homework 8 <br />
* Due: 10/26/2021 @ 8:00 AM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {
		
		int[] arr1 = inputArray(8); // Enter any input array size for testing
		int[] arr2 = inputArray(8); // Enter the same input array size for testing
		
		double average1 = average(arr1);
		
		//Prints the average of the elements in the first array.
		System.out.println("The average of the first array provided is " + average1 + ".");
		
		//Creates an array that holds the value of the sums from adding the two integer arrays.
		int[] resultingArray = add(arr1, arr2);
		
		//Prints the array with the sum of the two added integer arrays.
		displayArray(resultingArray);
		
}
	
	public static int[] inputArray(int size) {
			
		//Creates an array of size provided.
		int[] inputArr = new int [size];
		int num = 0;
			
		// Setting up scanner and asking the user to input values for elements
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + size + " integer values to add to the array");
		
		// Making sure the while loop ends in the set number of size
		while (num < size)
		{
			// Getting the numbers from the user and storing them
			inputArr[num] = input.nextInt();
			
			// Increasing this to end the loop and store the next score in the correct value
			num++;
		}
		
		// Returning the finished array
		return inputArr;
}
		
	public static double average(int[] list) {
		
		// Declaring variables that are needed
		int num = 0, sum = 0;
		double average = 0.0;
		
		while (num < list.length)
		{
			// Getting the sum
			sum += list[num];
			num++;
		}
		
		// Finding the average
		average = (double)sum/num;
		
		// Returning the average
		return average;
}
		
	public static int[] add(int[] list1, int[] list2) {
		
		// Declaring an array to store the addition
		int[] arr = new int [list1.length];
		// Variable to run with while loop and element
		int num = 0;
		
		// Making sure the while loop ends in the set number of size
		while (num < list1.length)
		{
			// Adding both arrays
			arr[num] = list1[num] + list2[num];
			
			// Increasing this to end the loop and store the next score in the correct value
			num++;
		}
		
		// Returning the addition
		return arr;
}
	public static void displayArray(int[] list) {

		// starting my statement
		System.out.print("The sum resulting array is [");

		// this prints the values in the loop besides the final one
		for (int i = 0; i < list.length - 1; i++) {
		System.out.print(list[i] + ", ");
		}

		// prints the final number and ending bracket and then goes to the next line
		System.out.println(list[list.length - 1] + "]");

		}

	/* My original display method grade scope had a problem with
	public static void displayArray(int[] list) {
		
		int num = 0;
		System.out.print("The sum resulting array is [");
		while(num < list.length)
		{
			if((num + 1) == list.length)
			{
				System.out.print(list[num] + "]");
			}
			else
			{
				System.out.print(list[num] + ", ");
			}
			num++;
		}
}
*/		
}
/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li and Atia Sultana <br />
* Description: This is the graded portion of lab2 <br />
* Due: 08/27/2021 <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

// Lets us use scanners
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		// Setting up a new scanner
		Scanner myInput = new Scanner(System.in);
		
		//Getting the input from console for num1
		System.out.print("Enter the value of num1: ");
		int num1 = myInput.nextInt();
		
		//Getting the input from console for num2
		System.out.print("Enter the value of num2: ");
		int num2 = myInput.nextInt();
		
		//Declaring temp
		int temp;
		
		// Checking if num1 is equal to num2
		if (num1 > num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// Printing the number in the correct order
		System.out.println("The sorted numbers are " + num1 + ", " + num2);
	}
}

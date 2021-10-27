/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li and Atia Sultana <br />
* Description: This is the first question of lab2 <br />
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

public class Lab2_q1 {

	public static void main(String[] args) {
		
		// Setting up a new scanner
		Scanner myInput = new Scanner(System.in);
		
		//Getting the input from console
		System.out.println("Enter the value of num1: ");
		int num = myInput.nextInt();
		
		// Checking if the number is greater than 3
		if (num > 3)
		{
			// Printing the number
			System.out.println("The number you entered = " + num);
		}
		else
		{
			// Not Printing the number
			System.out.println("You entered a number less than 3.");
		}
	}
}

/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab4 <br />
* Due: 09/17/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

// Allows us to use scanner
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		// Setup the scanner
		Scanner myInput = new Scanner(System.in);
		
		// Getting the input from the user
		System.out.println("Enter an integer input (ranging from 2 to 9): ");
		int num = myInput.nextInt();
		
		// The number for outer for loop
		int count;
		
		// The number that will be printed
		int lineNum = 1;
		
		/* Note: This program will run fine for pretty much any number, but I only did this because the lab
		 asked me to limit it to number between 2 and 9. If you want to try it simply removing the if-else statements.
		 If statement to make sure the number is between 2 and 9
		*/
		if ((num >= 2) && (num <= 9))
		{
			// The outer for loop to repeat the task over and over again
			for(count = num;count > 0; count--)
			{				
				// Printing the numbers
				for(int i = 1; lineNum <= count; i++)
				{
					System.out.print(lineNum);
					lineNum++;
				}
				
				// Resetting the number back
				lineNum = 1;
				
				// Creating a new line.
				System.out.println("");
			}
		}
		else
		{
			// The error message
			System.out.println("You must enter a number between 2 and 9.");
		}
		
	}

}

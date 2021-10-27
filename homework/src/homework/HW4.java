/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Homework 3 <br />
* Due: 09/21/2021 @ 8:00 AM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

// Allows us to use scanner
import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
		// Setup the scanner
		Scanner myInput = new Scanner(System.in);
		
		// Declaring variables
		int count1 = 1;
		int answer;
		
		while(count1 > 0)
		{
			// Asking the user if they want to practice
			System.out.println("Would you like to practice your multiplication tables? (Answer 'true' or 'false'.)");
			boolean practice = myInput.nextBoolean();
			
			// Declaring variables
			int lineNum = 1;
			int count2 = 10;
			
			if(practice == true)
			{
				// Asking the user what number multiplications they want to enter.
				System.out.println("Please enter a number from 1-10 to begin practicing.");
				int num = myInput.nextInt();
				while(count2 > 0)
				{
					// Asking for the answer
					System.out.println("What does " + num + " * " + lineNum + " equal?");
					answer = myInput.nextInt();
					
					//Checking if the answer is right
					if(answer == num * lineNum)
					{
						System.out.println("Correct!");
						count2--;
						lineNum++;
					}
					else 
					{
						System.out.println("Try again!");
					}
				}
				// This is to make sure they can run it again.
				count1++;
			}
			else
			{
				System.out.println("Goodbye.");
				// This is to exit the while loop.
				count1 = 0;
			}
		}
		
		

	}

}

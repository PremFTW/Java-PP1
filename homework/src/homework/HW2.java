/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Homework 2 <br />
* Due: 08/31/2021 @ 8:00 AM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/

package homework;

//Lets us use scanners
import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		//Setup the scanner
		Scanner myInput = new Scanner(System.in);
		
		//Getting input from console for number of days left
		System.out.print("How many days do you have left to do your assignments? ");
		int days = myInput.nextInt();
		
		//Getting input from console for number of assignments there are
		System.out.print("How many assignments do you have total? ");
		int assignments = myInput.nextInt();
		
		//Getting input from console for is it raining
		System.out.print("Is it raining? (true/false) ");
		boolean isRaining = myInput.nextBoolean();
		
		//Getting input from console for the temperature outside
		System.out.print("What is the temperature outside? ");
		float temperature = myInput.nextFloat();
		
		//Declaring do homework
		boolean doHomework;
		
		//Setting up conditions
		if((days < 5) || (assignments > 4) || (isRaining == true) || (temperature < 50.0))
		{
			doHomework = true;
			System.out.println("Should you speed up doing your work? " + doHomework);
		}
		else
		{
			doHomework = false;
			System.out.println("Should you speed up doing your work? " + doHomework);
		}
		
	}

}

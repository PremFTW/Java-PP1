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

// Lets us use scanner
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		//Setup scanner
		Scanner myInput = new Scanner(System.in);
		
		//Getting input from console for number
		System.out.print("Please Enter Integer: ");
		int num = myInput.nextInt();
		
		// Getting the remainder of the number
		double divCheck5 = num%5.0;
		double divCheck6 = num%6.0;
					
		//The main outputs
		if((divCheck5 == 0) && (divCheck6 == 0))
		{
			System.out.print(num + " is divisible by both 5 and 6.");
		}
		else if((divCheck5 == 0) && (divCheck6 != 0))
		{
			System.out.print(num + " is divisible by 5 but not 6.");
		}
		else if((divCheck5 != 0) && (divCheck6 == 0))
		{
			System.out.print(num + " is divisible by 6 but not 5.");
		}
		else if((divCheck5 != 0) && (divCheck6 != 0))
		{
			System.out.print(num + " is divisible by neither 5 nor 6.");
		}
		
	}

}

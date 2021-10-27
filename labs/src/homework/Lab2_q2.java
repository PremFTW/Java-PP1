/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li and Atia Sultana <br />
* Description: This is the second question of lab2 <br />
* Due: 08/27/2021 <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

// Lets us use scanner
import java.util.Scanner;

public class Lab2_q2 {

	public static void main(String[] args) {
		
		// Setting up a new scanner
		Scanner myInput = new Scanner(System.in);
				
		//Getting the input from console
		System.out.println("Enter the value of num1: ");
		int num1 = myInput.nextInt();
		
		System.out.println("Enter the value of num2: ");
		int num2 = myInput.nextInt();
		
		int temp;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 = " + num1 + " and num2 = " + num2);
	}

}

/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab 10 <br />
* Due: 11/11/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

public class Lab10 {

	public static void main(String[] args) {
        
		// Declaring the variables I need
		int count = 0, number, sum = 0;
		
		// Making sure the for loop only runs for the amount of commands		
		for (int i = 0; i < args.length ; i++) {
			// Convert the string to int
		    number = Integer.parseInt(args[i]);
		    // Summing the numbers
		    sum += number;
		    // knowing the count
		    count++;
		}
		
		// Printing the results
		System.out.println("You entered " + count + " numbers");
		System.out.println("The sum of these numbers is " + sum);
    }
}







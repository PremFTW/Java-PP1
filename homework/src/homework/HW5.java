/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Homework 3 <br />
* Due: 09/30/2021 @ 8:00 AM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;
//import brandon.math.Random;
//import brandon.math.Math;


public class HW5 {
	
	public static void main(String[] args) {
		
		// Finding mean
	    double meanValue = mean(99, 1000);

	    // Find standard deviation
	    double deviationValue = deviation(99, 1000);

	    // Display result
	    System.out.println("The mean is " + meanValue);
	    System.out.println("The standard deviation is " + deviationValue);

	}
	
	public static double mean (int boundary, int n)
	{
		// Variables used for this
		int number;
		double avg = 0, sum = 0;
		// Create numbers, find its sum, and its square sum
	    for (int i = 0; i < n; i++) {
	      // Generate a new random number
	      number = (int) (Math.random()*(boundary + 1));
	      // Add the number to sum
	      sum += number;
	    }
		
	    avg = (double)sum/n;
	    
		return avg;
	}
	
	public static double deviation (int boundary, int n)
	{
		// Variables used for this
		int number;
		double deviation = 0, sum = 0, squareSum = 0;
		
		// Create numbers, find its sum, and its square sum
		for (int i = 0; i < n; i++) {
			// Generate a new random number
			 number = (int) (Math.random()*(boundary + 1));
			// Add the number to sum
			sum += number;
			squareSum += Math.pow(number,2.0);
		}
		
		deviation = Math.sqrt((squareSum - sum * sum / n) / (n - 1));
		
		return deviation;
	}

}

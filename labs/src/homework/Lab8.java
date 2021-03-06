/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab 8 <br />
* Due: 10/22/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/

package homework;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		// Declaring int to store the size of the array
		int size = 0;
		
		// Declaring scanner
		Scanner input = new Scanner(System.in);
		
		// Getting the size from user
		System.out.println("Enter the size of the array: ");
		size = input.nextInt();
		
		// Declaring an array to store the scores entered.
		double[] scores = inputScores(size);
		
		// Displaying results
		System.out.println("The number of scores above average is: " + highScoreCount(scores));
		
}
		
	public static double[] inputScores(int size) {
		
		// Declaring storage
		double[] scores = new double[size];
		int num = 0;

		// Setting up scanner and asking the user to enter results
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter " + size + " scores in the array you want to make: \n");
		
		// Making sure the while loop ends in the set number of size
		while (num < size)
		{
			// Getting the scores from the user and storing them
			System.out.println("Please enter a score");
			scores[num] = input.nextDouble();
			
			if(scores[num] > 100)
			{
				System.out.println("Please enter a number that is less than or equal to 100");
			}
			else
			{
				// Increasing this to end the loop and store the next score in the correct value
				num++;
			}	
		}
		
		// Returning the result
		return scores;
}

		public static int highScoreCount(double[] scores) {
			
			int num = 0, sum = 0, count = 0;
			double average = 0.0;
			
			while (num < scores.length)
			{
				sum += scores[num];
				num++;
			}
			
			average = sum/num;
			num = 0;
			
			while (num < scores.length)
			{
				if(scores[num] > average)
				{
					count++;
				}
				num++;
			}
			
			return count;
		}
}
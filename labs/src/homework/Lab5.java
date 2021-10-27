/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab5 <br />
* Due: 09/24/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

public class Lab5 {

	public static void main(String[] args) {
		// Declaring variables
		int a = 4, b = -9, c = 7, d = 10;
		
		// Calling the method into the main function and printing the result
		int larger = max(a,b);
		System.out.println("The larger of a and b is " + larger);
		
		// Calling the method into the main function and printing the result
		int largestOfThree = max(a, b, c);
		System.out.println("The largest of a, b, and c is " + largestOfThree);
		
		// Calling the method into the main function and printing the result
		int largestOfFour = max(a, b, c, d);
		System.out.println("The largest of a, b, c, and d is " + largestOfFour);

	}
	
	// Checks for the largest of two numbers
	public static int max (int num1, int num2)
	{
		// x is used to store the largest number
		int x = 0;
		
		// Checking which is greater
		if (num1 > num2)
		{
			x = num1;
		}
		else
		{
			x = num2;
		}
		
		// Giving the result
		return x;
	}
	
	// Checks for the largest of three numbers
	public static int max (int num1, int num2, int num3)
	{
		// x is used to store the largest number
		int x = 0;
		
		// y is used to store the largest number from the first max method
		int y = max(num1,num2);
		
		// Checking which is greater
		if(y > num3)
		{
			x = y;
		}
		else
		{
			x = num3;
		}
		
		// Giving the result
		return x;
	}
	
	// Checks for the largest of four numbers
	public static int max (int num1, int num2, int num3, int num4)
	{
		// x stores the largest of the first three numbers
		int x = max(num1,num2,num3);
		
		// y stores the largest of all four numbers
		int y = max(x,num4);
		
		// Giving the result
		return y;
	}
}

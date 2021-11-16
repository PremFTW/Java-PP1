/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Homework 10 <br />
* Due: 11/16/2021 @ 8:00 AM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/

package homework;

// Declaring these to read, write, and use files
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//import brandon.math.Math;
//import brandon.math.Random;

// Declaring this to use random numbers
import java.util.Random;

public class HW10 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Part A Code
		// Declaring a file
		File file = new File("hw10.txt");
		
		// Checking if the file already exists
		if(file.exists())
		{
			System.out.println("File already exists.");
			return;
		}
		
		// Declared this to store the random number and later stored the multiplied result
		int num;
		
		// Creating a new random object
		Random r = new Random();
		
		// Creating a file for writing
		PrintWriter partA = new PrintWriter(file);
		
		// Writing 10 random numbers between 0 and 99 into the file
		for(int i = 0; i < 10; i++)
		{
			num = r.nextInt(99);
			partA.println(num);
		}
		
		partA.close();
		
		// Part B Code
		// Declaring a file
		File file2 = new File("hw10_scale.txt");
				
		// Checking if the file already exists
		if(file2.exists())
		{
			System.out.println("File already exists.");
			return;
		}
		
		// Creating a file
		PrintWriter partB = new PrintWriter(file2);
		
		// Declaring this to store the scanner input
		String read;
		
		// Opening a file for reading
		Scanner partAScan = new Scanner(file);
		
		for(int i = 0; i < 10; i++)
		{
			// Scanning the original file
			read = partAScan.next();
			num = Integer.parseInt(read);
			// Multiplying the numbers by 10
			num *= 10;
			// Writing into the new file
			partB.println(num);
		}
		
		// Closing the files
		partB.close();
		partAScan.close();
	}

}

/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab 9 pt 2 <br />
* Due: 10/29/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/

package homework;

public class Lab9 {

	public static void main(String[] args) {
				
		// Declaring the objects used for the points
		MyPoint p1 = new MyPoint(0.5, 1.2);
		// Leaving p2 and p3 blank to show the default constructor working and to show the set methods working later on
		MyPoint p2 = new MyPoint();
		MyPoint p3 = new MyPoint();
		MyPoint p4 = new MyPoint(6.6, 7.7);
		MyPoint p5 = new MyPoint(1.2, 2.1);
		MyPoint p6 = new MyPoint(12.0, 127.0);
		
		// Showing the set methods working for p2
		p2.setY(3.14);
		
		// Showing the set methods working for p3
		p3.setX(15.0);
		p3.setY(27.5);
		
		// Creating the array with all the points
		String [][] array = {
				{"(" + p1.getX() + ", " + p1.getY() + ")", "(" + p2.getX() + ", " + p2.getY() + ")", "(" + p3.getX() + ", " + p3.getY() + ")"},
				{"(" + p4.getX() + ", " + p4.getY() + ")", "(" + p5.getX() + ", " + p5.getY() + ")", "(" + p6.getX() + ", " + p6.getY() + ")"}
		};
				
		// This first for loop is for the number of rows
		for(int i = 0; i < array.length; i++)
		{
			// This second for loop is for the number of columns
			for (int j = 0; j < array[0].length; j++)
			{
				// Printing the results
				System.out.println("Array[" + i + "][" + j + "] = " + array[i][j]);
			}
		}
	}

}

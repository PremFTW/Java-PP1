/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab 6 p2 <br />
* Due: 10/08/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

public class Lab6RectangleTest {

	public static void main(String[] args) {
		
		//Declaring variables
		double height = 40.0;
		double width = 4.0;
		
		// Creating new object
		Rectangle r1 = new Rectangle(height, width);
		
		// Printing the original values
		System.out.println("The width before is " + width);
		System.out.println("The height before is " + height);
		
		// Changing the values
		height = 50.0;
		width = 5.0;
		
		// Changing the values in the object
		r1.changeRectangle(height, width);
		
		// Printing the new values
		System.out.println("The width after is " + width);
		System.out.println("The height after is " + height);
		
		// Printing the area
		System.out.println("The area is " + r1.getArea());
		
		// Printing the Perimeter
		System.out.println("The perimeter is " + r1.getPerimeter());
	}

}

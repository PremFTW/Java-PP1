/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab 7 p2 <br />
* Due: 10/15/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

public class Lab7TestCircle {

	public static void main(String[] args) {

		// Declaring two circle objects
		Circle c1 = new Circle();
		
		// I used different values here than what is in the lab so, I could show the set methods working
		Circle c2 = new Circle(2, 3, 7);
		
		// Call the set methods
		c2.setRadius(5.5);
		c2.newCenter(3.5, 4.2);
		
		// Printing Circle 1 radius, centerX, and centerY
		System.out.println("Circle 1's Radius: " + c1.getRadius());
		System.out.println("Circle 1's CenterX: " + c1.getCenterX());
		System.out.println("Circle 1's CenterY: " + c1.getCenterY());
		
		// Printing Circle 2 radius, centerX, and centerY
		System.out.println("Circle 2's Radius: " + c2.getRadius());
		System.out.println("Circle 2's CenterX: " + c2.getCenterX());
		System.out.println("Circle 2's CenterY: " + c2.getCenterY());
		
		// Printing distance between Circle 1 and 2
		System.out.println("Distance from Circle1 to Circle2: " + c1.distance(c2));
	}

}

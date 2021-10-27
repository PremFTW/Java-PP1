/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Homework 6 p2 <br />
* Due: 10/08/2021 @ 8:00 AM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

public class HW6CylinderTest {

	public static void main(String[] args) {
		
		// Declaring the Objects
		Cylinder c1 = new Cylinder();
		Cylinder c2 = new Cylinder(2.5, 12.3);
		Cylinder c3 = new Cylinder();
		
		// Updating the third object
		c3.changeCylinder(5.0, 6.5);
		
		// Print the default radius and length
		System.out.println("The radius of the first cylinder is: " + c1.getRadius() + " and the length is: " + c1.getLength());
		
		// Print the area of the second object
		System.out.println("The base area of the second cylinder is: " + c2.getArea());
		
		// Print the volume of the third object
		System.out.println("The volume of the third cylinder is: " + c3.getVolume());
		
		// Print the number objects that were created
		System.out.println("The amount of objects created is: " + Cylinder.getNumberOfObjects());
	}

}

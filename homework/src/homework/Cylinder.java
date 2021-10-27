/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Homework 6 p1 <br />
* Due: 10/08/2021 @ 8:00 AM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

public class Cylinder {
	
	// Declaring Variables
	private double radius;
	private double length;
	public static int numberOfObjects = 0;
	
	// Base Constructor
	public Cylinder()
	{
		// Default values
		radius = 1.0;
		length = 1.0;
		
		// Increasing the count
		numberOfObjects++;
	}
	
	// Custom Constructor
	public Cylinder(double newRadius, double newLength)
	{
		// Initializing Values with what the user wants
		this.length = newLength;
		this.radius = newRadius;
		
		// Increasing the count
		numberOfObjects++;
	}
	
	// Updating the radius and length
	public void changeCylinder(double newRadius, double newLength) 
	{
		// Updating the values
		this.radius = newRadius;
		this.length = newLength;
	}
	
	double getRadius()
	{
		return radius;
	}
	
	double getLength()
	{
		return length;
	}
	
	// Returning Area
	double getArea()
	{
		// I used Math.PI here instead of 3.14 and Math.pow instead of radius * radius.
		return Math.PI	* Math.pow(radius, 2.0);
	}
	
	// Returning Volume
	double getVolume()
	{
		// Since volume is just area * length, I did this
		return getArea() * length;
	}
	
	// Returning number of objects
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}

}

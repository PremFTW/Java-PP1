/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab 7 p1 <br />
* Due: 10/15/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

public class Circle {
	
	// The radius of this circle, and the x & y coordinates of the circle center
	private double radius, centerX, centerY;
	
	// Default circle object
	public Circle() 
	{
		this (1.0, 1.0, 1.0);
	}
	
	// Custom circle object
	public Circle(double newRadius, double newCenterX, double newCenterY) 
	{
		this.radius = newRadius;
		this.centerX = newCenterX;
		this.centerY = newCenterY;
	}
	
	// set methods for radius, centerX, centerY
	public void setRadius(double newRadius)
	{
		this.radius = newRadius;
	}
	public void newCenter(double newCenterX, double newCenterY)
	{
		this.centerX = newCenterX;
		this.centerY = newCenterY;
	}
	
	// get methods for radius, centerX, centerY
	double getRadius()
	{
		return radius;
	}
	double getCenterX()
	{
		return centerX;
	}
	double getCenterY()
	{
		return centerY;
	}
	
	// Method that gives the distance between two points
	public double distance(Circle c)
	{
		// Declaring Variables
		double d, x, y;
		
		// I decided to split up the calculations like this so its easier to read
		// x will be (x2 - x1)^2
		x = Math.pow((c.getCenterX() - centerX), 2.0);
		
		// y will be (y2 - y1)^2
		y = Math.pow((c.getCenterY() - centerY), 2.0);
		
		// final distance
		d = Math.sqrt(x + y);
		
		return d;
	}
}

/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab 9 pt 1 <br />
* Due: 10/29/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/

package homework;

public class MyPoint {

	// Variables that store the coordinates
	private double x;
	private double y;
	
	// Default Constructor sets the value of x & y to 0
	public MyPoint()
	{
		this.x = 0.0;
		this.y = 0.0;
	}
	
	// Custom Constructor lets the user set the values of x & y
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	// Lets the user set a new value for x
	public void setX(double newX)
	{
		this.x = newX;
	}
	
	// Lets the user set a new value for y
	public void setY(double newY)
	{
		this.y = newY;
	}
	
	// Gives the user the current value of x
	public double getX()
	{
		return x;
	}
	
	// Gives the user the current value of y
	public double getY()
	{
		return y;
	}

}

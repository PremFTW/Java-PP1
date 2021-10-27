/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Lab 6 p1 <br />
* Due: 10/08/2021 @ 4:20 PM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/
package homework;

public class Rectangle {

	private double height;
	private double width;
	
	public Rectangle()
	{
		height = 1.0;
		width = 1.0;
	}
	
	public Rectangle(double newHeight, double newWidth)
	{
		this.height = newHeight;
		this.width = newWidth;
	}
	
	public void changeRectangle(double newHeight, double newWidth)
	{
		this.height = newHeight;
		this.width = newWidth;
	}
	
	double getArea()
	{
		return height * width;
	}
	
	double getPerimeter()
	{
		return 2 * (height + width);
	}
	
}

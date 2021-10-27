package homework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		double radius;
		double length;
		double area;
		double volume;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input a value for radius: ");
		radius = input.nextDouble();
		
		System.out.print("Please input a value for length: ");
		length = input.nextDouble();
		
		area = radius * radius * PI;
		volume = area * length;
		
		System.out.print("The area of the cylinder is " + area + " units squared.");
		System.out.print(System.lineSeparator());
		System.out.print("The volume of the cylinder is " + volume + " units cubed.");
	}
}

package homework;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		
		double foot;
		double meter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the value of feet: ");
		foot = input.nextDouble();
		
		meter = 0.305 * foot;
		
		System.out.println(foot + " ft Converted to meters is " + meter + " m");
	}

}

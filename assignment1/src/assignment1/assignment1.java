package assignment1;

//Allows us to use scanner
import java.util.Scanner;

public class assignment1 {
	

	public static void main(String[] args) {
		
		// Setup the scanner
		Scanner myInput = new Scanner(System.in);
				
		// Declaring variables I need
		double averageRainfall;
		String lowestRainfallM;
		double lowestRainfall;
		double highestRainfallM;
		double highestRainfall;
		
		// Initializing Arrays
		int[] rainfall = new int[12];
		String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		// Getting data from the user
		for(int i = 0;i < 12;i++)
		{
			// Asking the user for data
			System.out.println("Please enter an integer for the rainfall data for" + month[i]+ " or enter x to stop");
			// Checking if the user entered X
			if(myInput.next() == "x")
			{
				// Stopping the program
				System.out.println("The program stopped");
				break;
			}
			else
			{
				// Adding the data
				rainfall[i] = myInput.nextInt();
			}
			
		}
		
		lowestRainfall = lowestRainfallAmount(rainfall);
		lowestRainfallM = lowestRainfallMonth(rainfall,month);
		System.out.println("The lowest rainfall recorded for any month was" + lowestRainfall + " inches");
		System.out.println("Name of the month with lowest rainfall recorded was" + lowestRainfallM + ".");
		
	}
	
	// Returns the lowest rainfall amount
	public static int lowestRainfallAmount(int[] arr1)
	{
		// Stores the lowest amount
		int low = arr1[0], count = 0;
		
		// Checking for the lowest
		while (count > arr1.length)
		{
			if(low > arr1[count])
			{
				low = arr1[count];
			}
		}
		
		// Returning the result
		return low;
	}
	
	// Returns the lowest rainfall month
	public static String lowestRainfallMonth(int[] arr1, String[] arr2)
	{
		// Stores the lowest amount
		int low = arr1[0], count = 0, index = 0;
				
		// Checking for the lowest
		while (count > arr1.length)
		{
			if(low > arr1[count])
			{
				low = arr1[count];
				index = count;
			}
		}
				
		// Returning the result
		return arr2[index];	
	}
	
	// Returns the highest rainfall amount
	public static int highestRainfallAmount()
	{
		return 0;
	}
	
	// Returns the highest rainfall month
	public static int highestRainfallMonth()
	{
		return 0;
	}
}

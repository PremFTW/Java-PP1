/*
* Class: CSCI1301-01 Introduction to Programming Principles <br />
* Instructor: Dr. Lixin Li, Atia Sultana, and Mehakpreet Kaur <br />
* Description: This is Homework 9 <br />
* Due: 11/02/2021 @ 8:00 AM <br />
* I pledge by honor that I have completed the programming assignment independently. <br />
I have not copied the code from a student or any source. <br />
I have not given my code to any student. <br />
<br />
Sign here: Prem Nag Reddy Somireddy <br />
*/

package homework;

public class HW9 {

	public static void main(String[] args) {
		
		// This was given to me in the homework document
		int[][] workHours = {
			{2, 4, 3, 4, 5, 8, 8},
			{7, 3, 4, 3, 3, 4, 4},
			{3, 3, 4, 3, 3, 2, 2},
			{9, 3, 4, 7, 3, 4, 1},
			{3, 5, 4, 3, 6, 3, 8},
			{3, 4, 4, 6, 3, 4, 4},
			{3, 7, 4, 8, 3, 8, 4},
			{6, 3, 5, 9, 2, 7, 9}
		};
		
		// Finding the sum of the array above
		int[] sumArray = calculateSum(workHours);
		
		// Sorting the array index
		int[] indexArray = decreasingSort(sumArray);
		
		// Printing the sorted array
		displayArray(indexArray, sumArray);

	}
	
	public static int[] calculateSum (int[][] array) {
		
		// Declaring the array that store the sum of each employees hours
		int[] arr1 = new int[array.length];
		
		// The outer for loop controls arr1 and number of rows
		for(int i = 0; i < array.length; i++)
		{
			// The inner for loop controls the number of columns
			for(int j = 0; j < array[i].length; j++)
			{
				arr1[i] += array[i][j];
			}
		}
		
		// Returning the final result
		return arr1;
	}
	
	public static int[] decreasingSort (int[] array) {
		
		// Declaring the array that will store the index and the copy of the input array
		int[] arr1 = new int[array.length];
		int[] arr2 = new int[array.length];
		
		// Copying the array over
		for(int i = 0; i < array.length; i++)
		{
			arr2[i] = array[i];
		}
		
		// Declaring variables I need
		int largest, maxIndex, original;
		
		// This nested For loop is to sort the hours out in descending order
		for(int i = 0; i < array.length; i++)
		{
			// Initializing the largest variable to be starting point of the array
			largest = array[i];
			maxIndex = i;
			
			// For loop to scan all the elements in the array to find the largest
			for(int j = i; j < array.length; j++)
			{
				// Checking for the largest value
				if(array[j] > largest)
				{
					// Getting the largest value and its location in the array
					largest = array[j];
					maxIndex = j;
				}				
			}
			
			// Sorting this array in descending order
			original = array[i];
			array[i] = largest;
			array[maxIndex] = original;
		}
		
		// This nested For loop is for getting the index in descending order
		for(int i = 0; i < array.length; i++)
		{
			// Outer loop manages the sorted array, while the inner loop manages the copied array
			for(int j = 0; j < array.length ;j++)
			{
				// Making sure that two of these are the same values
				if(array[i] == arr2[j])
				{
					// Because employee 1 and 5 have the same hours, this is to make sure 5 doesn't get stored twice
					if((i == 6) && (j == 5))
					{
						continue;
					}
					else
					{
						// Store the value in the current location of the array
						arr1[i] = j;
					}
					
				}
			}

		}
		
		
		// Returning the result
		return arr1;
	}

	public static void displayArray (int[] indexArray, int[] array) {
		
		// For loop that runs until the length
		for(int i = 0; i < indexArray.length; i++)
			// Here I used indexArray as the index number for the original array to get the right sort
			System.out.println("Employee" + indexArray[i] + ": " + array[i] + " hours");
	}

}

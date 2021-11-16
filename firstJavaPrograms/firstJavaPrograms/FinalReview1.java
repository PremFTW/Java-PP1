package firstJavaPrograms;

import java.util.Random;

public class FinalReview1 {

	public static void main(String[] args) {

		int[] x = createArray(100);
		int[] counts = countDigits(x);		
		
		displayArray(counts);

	}
	
	public static int[] createArray(int arraySize)
	{
		int num;
		Random r = new Random();
		int[] x = new int[arraySize];
		
		for(int i = 0; i < 100; i++)
		{
			num = r.nextInt(9);
			x[i] = num;
		}
		
		return x;
	}
	
	public static int[] countDigits(int[] array)
	{
		int[] x = new int[10];

		for(int i = 0; i < array.length; i++)
		{
			switch(array[i])
			{
			case 0: x[0] += 1;
			break;
			case 1: x[1] += 1;
			break;
			case 2: x[2] += 1;
			break;
			case 3: x[3] += 1;
			break;
			case 4: x[4] += 1;
			break;
			case 5: x[5] += 1;
			break;
			case 6: x[6] += 1;
			break;
			case 7: x[7] += 1;
			break;
			case 8: x[8] += 1;
			break;
			case 9: x[9] += 1;
			break;
			default:break;
			}
		}
		
		return x;
	}
	
	public static void displayArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Number of " + i + "'s = " + array[i]);
		}
	}

}

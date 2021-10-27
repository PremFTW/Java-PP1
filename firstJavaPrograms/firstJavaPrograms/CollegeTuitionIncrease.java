package firstJavaPrograms;

public class CollegeTuitionIncrease {

	public static void main(String[] args) {
		double tuition = 10000;
		int year = 0;
		
		while(tuition < 20000)
		{
			tuition = tuition + (tuition * 0.07);
			year++;
		}
		
		System.out.println("The tuition is doubled in " + year + " years.");

	}

}

import java.util.Scanner;

public class ComputeTaxWithSelectionStatement {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter filing status
    System.out.print(
      "(0-single filer, 1-married jointly,\n" +
      "2-married separately, 3-head of household)\n" +
      "Enter the filing status: ");
    int status = input.nextInt();

    // Prompt the user to enter taxable income
    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();

    // Compute tax
    double tax = 0;

    if (status == 0) { // Compute tax for single filers
      if (income <= 9325)
        tax = income * 0.10;
      else if (income <= 37950)
        tax = 9325 * 0.10 + (income - 9325) * 0.15;
      else if (income <= 91900)
        tax = tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
          (income - 37950) * 0.25;
      else if (income <= 191650)
        tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
          (91900 - 37950) * 0.25 + (income - 91900) * 0.28;
      else if (income <= 416700)
        tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
          (91900 - 37950) * 0.25 + (191650 - 91900) * 0.28 +
          (income - 191650) * 0.33;
      else if (income <= 418400)
        tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
          (91900 - 37950) * 0.25 + (191650 - 91900) * 0.28 +
          (416700 - 191650) * 0.33 + (income- 416700) * 0.35 ;
      else
        9325 * 0.10 + (37950 - 9325) * 0.15 +
          (91900 - 37950) * 0.25 + (191650 - 91900) * 0.28 +
          (416700 - 191650) * 0.33 + (418400 - 416700) * 0.35 + 
	  (income - 418400) * 0.396;
    }
    else if (status == 1) { // Compute tax for married file jointly
      // Left as exercise
    }
    else if (status == 2) { // Compute tax for married separately
      // Left as exercise
    }
    else if (status == 3) { // Compute tax for head of household
      // Left as exercise
    }
    else {
      System.out.println("Error: invalid status");
      System.exit(0);
    }

    // Display the result
    System.out.println("Tax is " + (int)(tax * 100) / 100.0);
  }
}

package MainPackage;

import java.util.Scanner;

public class tuition {
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the initial tuition cost.");
		double initialC = keyboard.nextDouble();
		//Rate increase based on university costs
		System.out.println("Please enter the percentage increase for tuition");
		double tRateIncrease = keyboard.nextDouble();
		System.out.println("Now enter the repayment APR");
		double repayAPR = keyboard.nextDouble();
		System.out.println("How long is your term");
		int term = keyboard.nextInt();
		//Calculate cost of tuition for 4 years from now
		double totalCost = 0;;
		for(int j = 0; j < term; j++){
			totalCost = initialC+(initialC*tRateIncrease)
					+(initialC*(Math.pow(tRateIncrease, 2))+(initialC*(Math.pow(tRateIncrease, 3))));
		}
		System.out.println("In 4 years from now, tuition will cost"+totalCost);
		int months = term*12;
		double costPerM = totalCost/months;
		System.out.println("You will have to pay,"+costPerM+" each month to pay off student loans");
	}
}

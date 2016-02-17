package MainPackage;
import java.util.Scanner;

public class RetirementFundCalculator {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int yearsToWork;
		double returnOnInvestment;
		int yearsRetired;
		double annualReturn=.02;
		double requiredIncome;
		double monthlySSI;
		
		System.out.println("How many years do you plan to work?");
		yearsToWork=input.nextInt();
		System.out.println("What is your expected average return on investment?");
		returnOnInvestment=input.nextDouble();
		System.out.println("How long do you want to draw money for?");
		yearsRetired=input.nextInt();
		System.out.println("What is your required income?");
		requiredIncome=input.nextDouble();
		System.out.println("What is your expected SSI income?");
		monthlySSI=input.nextDouble();

	}

}

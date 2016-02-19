package MainPackage;
import java.util.Scanner;
import java.lang.Math.*;
public class RetirementFundCalculator {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		double yearsToWork;
		double returnOnInvestment;
		double yearsRetired;
		double annualReturn;
		double requiredIncome;
		double annualAfterRetirement;
		double monthlySSI;
		double moneyNeeded;
		double monthlySaving;
		System.out.println("How many years do you plan to work?");
		yearsToWork=input.nextDouble();
		System.out.println("What is your expected average return on investment during this time?");
		returnOnInvestment=input.nextDouble();
		System.out.println("How many years will you be in retirement?");
		yearsRetired=input.nextDouble();
		System.out.println("What is your expected annual return during retirement?");
		annualReturn=input.nextDouble();
		System.out.println("What is your required income during retirement?");
		requiredIncome=input.nextDouble();
		System.out.println("What is your expected monthly Social Security Income?");
		monthlySSI=input.nextDouble();
		
		moneyNeeded = (requiredIncome-monthlySSI)*((1-(1/(Math.pow(1+(annualReturn/100)/12,yearsRetired*12 )))))/((annualReturn/100)/12);
	    monthlySaving = moneyNeeded*(((returnOnInvestment/100)/12)/((Math.pow(1+(returnOnInvestment/100)/12, yearsToWork*12))-1));
	    System.out.printf("Total money needed: %.2f \n",moneyNeeded);
	    System.out.printf("Monthly Payments: %.2f",monthlySaving);
	}

}

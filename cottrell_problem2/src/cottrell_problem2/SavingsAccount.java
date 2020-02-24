package cottrell_problem2;
/*
 * Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for all account holders. 
 * Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit. 
 * Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate 
 * divided by 12—this interest should be added to savingsBalance. Provide a static method modifyInterestRate that sets 
 * the annualInterestRate to a new value.
 */

public class SavingsAccount {

	//stores annual interest rate for all account holders
	private static double annualInterestRate = 0;
	private static double savingsBalance = 0;
	private static double monthlyInterestRate;
	
	
	
	public void calculateMonthlyInterest() {
		/*
		 * calculate monthly interest by multiplying savingsBalance by annualInterestRate divided by 12
		 * this interest should be added to savingsBalance
		 */
		
		double monthlyInterestRate = 0;
		
		//double savingsBalance;
		//double monthlyInterestRate;
		
		monthlyInterestRate = (savingsBalance * annualInterestRate) / 12;
		
		savingsBalance = savingsBalance + monthlyInterestRate;
		
		modifyInterestRate();
	        
	}

	public static void modifyInterestRate() {
		/*
		 * sets annualInterestRate to a new value
		 */
		
		annualInterestRate = monthlyInterestRate * 12;
		
		//return annualInterestRate();
	}
}

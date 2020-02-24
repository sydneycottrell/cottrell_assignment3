package cottrell_problem2;


/*
 * Write a program called SavingsAccountTest to test class SavingsAccount. 
 * Instantiate two SavingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. 
 * Set annualInterestRate to 4%, then calculate the monthly interest for each of 12 months and print the monthly balances for both savers. 
 * Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers.
 */

public class SavingsAccountTest {
	

	private static void main(String[] args) {
		
		double savingsBalance;
		
		//instantiate 2 savingsAccount objects
		SavingsAccount saver1 = new savingsBalance(2000);
        SavingsAccount saver2 = new savingsBalance(3000);
        
        //setting annual rate to 4% and 5% and calculating next 12 month interest
        saver1.modifyInterestRate(.04);
        saver1.calculateMonthlyInterest();
        
        saver2.modifyInterestRate(.04);
        saver2.calculateMonthlyInterest();
        
        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();
		
		System.out.println("New savings balance: " + savingsBalance);
	}

	
}

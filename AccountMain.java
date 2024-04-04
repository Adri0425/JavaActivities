package assignmentActivity2;

public class AccountMain {

	public static void main(String[] args) {
		
		Customer customerObj = new Customer("Juan", "Dela Cruz");
		
		System.out.println("------------------------------------------------\n");
		 //Instance of Savings Account
        Account savingsAcc = new Account(customerObj, "Savings");
        
        double savingsDep = 1000;
        double savingsWD = 500;
        savingsAcc.deposit(savingsDep);
        savingsAcc.withdraw(savingsWD);
        savingsAcc.display();
        
        System.out.println("------------------------------------------------\n");
        
        //Instance of Checking Account
        Account checkingAcc = new Account(customerObj, "Checking");
        
        double checkingDep = 500;
        double checkingWD = 600;
        checkingAcc.deposit(checkingDep);
        checkingAcc.withdraw(checkingWD);
        checkingAcc.display();
        
        System.out.println("------------------------------------------------");
	}

}

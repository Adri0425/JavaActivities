package assignmentActivity2;

public class Account {
	private String accountType;
	private double balance;
	private Customer customer;
	
	public Account(Customer customer, String accountType) {
		this.customer = customer;
		this.accountType = accountType;
	}
	

	public void setBalance (double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		System.out.format("Depositing... %.2f\n", amount);
		//TODO: Provide the implementation
		balance += amount;
        System.out.format("SUCCESSFUL TRANSACTION! \n");
        System.out.println("\n");
	}
	
	public void withdraw(double amount) {
		System.out.format("Please wait while withdrawing amount: %.2f\n", amount);
		//TODO: Provide the implementation
		if (balance >= amount) {
            balance -= amount;
            System.out.format("SUCCESSFUL TRANSACTION! \n");
            System.out.println("\n");
        } else {
            System.out.println("TRANSACTION DENIED! Insufficient Funds.");
            System.out.println("\n");
        }
	}
	
	public void display() {
		System.out.println("Customer Account Name: " + this.customer.getFirstName() + " " + this.customer.getLastName());
		System.out.format(this.accountType + " Account Balance: %.2f\n", this.balance);
		System.out.println("\n");
	}
}

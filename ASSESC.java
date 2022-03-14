public class ASSESCpublic class Assignment2Q3 {

	public static void main(String[] args) {
		
		Account account=new
				SavingsAccount("ravi", "4343433434", 30000, 5, 1000);
	
		
		Account account2=new 
			CurrentAccount("rajiv", "543545445", 500000, "AB1234", 50000);
		
	}
}
{

	public static void main(String[] args) {
		
		Account account=new
				SavingsAccount("ravi", "4343433434", 30000, 5, 1000);
	
		
		Account account2=new 
			CurrentAccount("rajiv", "543545445", 500000, "AB1234", 50000);
		
	}
}public class SavingsAccount extends Account {
	private double interest=5.0;
	private double maxWithdrawAmountLimit;
	private double minimumBalance;

	public SavingsAccount(String name, String accountNumber, double accountBalance, 
			double interest,double minimumBalance) {
		super(name, accountNumber, accountBalance);
		this.interest=interest;
		this.minimumBalance=minimumBalance;
		
		this.maxWithdrawAmountLimit=accountBalance-minimumBalance;
	}
	
	public double getBalance() {
		return getAccountBalance()*(100+interest)/100;
	}
	
	public void withdraw(double amount) {
		if(amount<=maxWithdrawAmountLimit) {
			setAccountBalance(getAccountBalance()-amount);
			System.out.println("amount "+ amount+" is withdrawn");
		}else
			System.out.println("You can not withdraw as min balance required ...");
	}

	@Override
	public String toString() {
		return super.toString()+ 
				" interest=" + interest + ","
				+ " maxWithdrawAmountLimit=" + maxWithdrawAmountLimit
				+ ", minimumBalance=" + minimumBalance + "]";
	}

	
	
}



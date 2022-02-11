package entities;

public class Account {
	
	private final int accountNumber;
	private String holderName;
	private double balance;
	
	public Account(int accountNumber, String holderName) {
		
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}
	
	
	
	public String getHolderName() {
		return holderName;
	}



	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}



	public double getBalance() {
		return balance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}

	
	public String toString() {
		return  "Account "+
				accountNumber+
				", Holder: "+
				holderName+
				", Balance: $ "+
				String.format("%.2f", balance);
	}


	public void deposit(double depositValue) {
		
		balance += depositValue;
		
	}
	
	public void withdrawal(double withdrawalValue) {
		
		balance = (balance - withdrawalValue) - 5.0;
	
	}
	
	

}

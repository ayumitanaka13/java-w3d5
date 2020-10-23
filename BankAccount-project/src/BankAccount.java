public class BankAccount {
	
	final double TAX = 0.05;
	private int accountNumber;
	private String customerName;
	private double balance;
	private int yearCreateAccount;
	private int monthCreatedAccount;
	
	//constructor
	
	public BankAccount(String customerName,double balance,
			int yearCreateAccount, int monthCreatedAccount) {
		
		setAccountNumber();
		setCustomerName(customerName);
		setBalance(balance);
		setYearCreatedAccount(yearCreateAccount);
		setMonthCreatedAccount(monthCreatedAccount);
	}
	

	//getters
	
	/*
	 *  @return accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/*
	 *  @return customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/*
	 *  @return balance
	 */
	public double getBalance() {
		return balance;
	}
	/*
	 *  @return yearCreateAccount
	 */
	public int getYearCreatedAccount() {
		return yearCreateAccount;
	}
	/*
	 *  @return monthCreatedAccount
	 *  1 retutn 01
	 *  10 returns 10
	 */
	public String getMonthCreatedAccount() {
		
		if (monthCreatedAccount < 10) {
			return "0" + monthCreatedAccount;
		} else {
			// to convert the data type of int to String we should use valueOf
			return String.valueOf(monthCreatedAccount);
		}
	}
	
	
	//setters never return value
	

	/*
	 *  Set accountNumber
	 */
	public void setAccountNumber() {
		// random number between 1000 to 10000
		// Math.random() * (Max-Min+1)) + Min		
		int randomNumber = (int)((Math.random()*9001)+1000);
		this.accountNumber = randomNumber;
	}
	/*
	 *  Set customerName
	 */
	public void setCustomerName(String customerName) {
		if(!customerName.isEmpty() || !customerName.equalsIgnoreCase(null)) {
			this.customerName = customerName;
		} else {
			this.customerName = "John";
		}
	}
	/*
	 *  Set balance
	 */
	public void setBalance(double balance) {
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}
	/*
	 *  Set yearCreateAccount
	 */
	public void setYearCreatedAccount(int yearCreateAccount) {
		if(yearCreateAccount < 1900) {
			this.yearCreateAccount = 1900;
		} else {
			this.yearCreateAccount = yearCreateAccount;
		}
	}
	/*
	 *  Set monthCreatedAccount
	 */
	public void setMonthCreatedAccount(int monthCreatedAccount) {
		if(monthCreatedAccount < 1 || monthCreatedAccount > 12) {
			this.monthCreatedAccount = 1;
		} else {
			this.monthCreatedAccount = monthCreatedAccount;
		}
	}
	
	//deposit(double money amount) --> money which customer wants to deposit should be more than zero
	
	/*
	 *  @param depositAmount
	 */
	public void deposit(double depositAmount) {
		if (depositAmount > 0) {
			System.out.println("\n$" + depositAmount + " deposit to the account : " + accountNumber);
			balance += depositAmount;
		} else {
			System.err.println("Deposit Amount shoould be more then zero.");
		}
	}
	
	//withdraw(double money amount) --> money which customer wants to withdraw should be less than his balance
	
	/*
	 *  @param withdrawAmount
	 */
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > 0 && withdrawAmount <= balance) {
			System.out.println("\n$" + withdrawAmount + " withdraws from the account : " + accountNumber);
			balance -= withdrawAmount;
		} else if (withdrawAmount < 0) {
			System.err.println("Withdraw amount should be more than zero.");
		} else if (withdrawAmount > balance) {
			System.err.println("Withdraw amount should be less than your balance.");
		}
	}

}
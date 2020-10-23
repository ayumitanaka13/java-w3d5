import java.util.Scanner;

public class Driver {
	
	public static void printAccountInformation(BankAccount tempAccount) {
		System.out.println("Account Number : " + tempAccount.getAccountNumber() +
			"\nFull Name : " + tempAccount.getCustomerName() +
			"\nBalance : $" + tempAccount.getBalance() +
			"\nCreated Date : " + tempAccount.getYearCreatedAccount() + "-" +
			tempAccount.getMonthCreatedAccount());
	}

	public static int findIndexOfAccounts(BankAccount[] accounts, String cName) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getCustomerName().equalsIgnoreCase(cName)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		BankAccount b1 = new BankAccount("John Doe", 500.0, 2019, 13);
		BankAccount b2 = new BankAccount("Jane Doe", 1000, 2020, 10);
		BankAccount b3 = new BankAccount("Ayumi Tanaka", 87.56, 2018, 2);
	
		BankAccount[] accounts = new BankAccount[3];
		accounts[0] = b1;
		accounts[1] = b2;
		accounts[2] = b3;
		
	

		System.out.println("Please enter your name :");
		String customerName = input.nextLine();
		
		int index = findIndexOfAccounts(accounts, customerName);
		
		if (index == -1) {
			System.err.println("We do not have" + customerName);
		} else {
			System.out.println("Please enter w for withdraw, or d for deposit");
			String s = input.nextLine();
			System.out.println("Please enter the amount");
			double amount = input.nextDouble();
			switch(s.toLowerCase()) {
				case "w":
					accounts[index].withdraw(amount);
					printAccountInformation(accounts[index]);
					break;
				case "d":
					accounts[index].deposit(amount);
					printAccountInformation(accounts[index]);
					break;
				default:
					System.out.println("wrong input");
			}
		}	
	}
}
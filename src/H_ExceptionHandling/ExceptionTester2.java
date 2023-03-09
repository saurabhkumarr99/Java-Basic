package H_ExceptionHandling;

import java.util.ArrayList;

class Account {

	private int accountNumber;
	private double balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}

class AccountList {

	ArrayList<Account> allAccounts = new ArrayList<Account>();

	public ArrayList<Account> getAllAccounts() {
		return allAccounts;
	}

}

class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String msg) {
		super(msg);
	}
}

class NegativeAmountException extends Exception {

	public NegativeAmountException(String msg) {
		super(msg);
	}
}

class InvalidAccountException extends Exception {

	public InvalidAccountException(String msg) {
		super(msg);
	}
}

class AccountManager {

	AccountList allAccountList = new AccountList();

	public void addAccount(Account ac) {
		allAccountList.getAllAccounts().add(ac);
	}

	public boolean checkAccount(int accountNo) {
		boolean check = false;
		for (Account account : allAccountList.getAllAccounts()) {
			if (account.getAccountNumber() == accountNo) {
				check = true;
				break;
			}
		}
		return check;
	}

	public double deposit(int accountNo, double amount) throws Exception {
		double balance = 0;
		if (!(checkAccount(accountNo))) {
			throw new InvalidAccountException("Account not exist");
			// throw new NullPointerException();
		} else if (amount < 0) {
			throw new NegativeAmountException("Amount is negative");
		} else {
			for (Account account : allAccountList.getAllAccounts()) {
				if (account.getAccountNumber() == accountNo) {
					account.setBalance(amount + account.getBalance());
					balance = account.getBalance();
				}
			}
		}

		return balance;
	}

	public double withdraw(int accountNo, double amount) throws Exception {
		double balance = 0;
		if (!(checkAccount(accountNo))) {
			throw new InvalidAccountException("Account not exist");
		} else if (amount < 0) {
			throw new NegativeAmountException("Amount is negative");
		} else {
			for (Account account : allAccountList.getAllAccounts()) {
				if (account.getAccountNumber() == accountNo) {
					if (amount > account.getBalance()) {
						throw new InsufficientFundsException("Insufficient amount");
					} else {
						account.setBalance(account.getBalance() - amount);
						balance = account.getBalance();
					}
				}
			}
		}
		return balance;
	}

	@Override
	public String toString() {
		return "AccountManager [allAccountList=" + allAccountList.getAllAccounts() + "]";
	}

	public void someMethod1() {
		throw new NullPointerException();
	}

	public void someMethod2() throws Exception {
		throw new NullPointerException();
	}

	public void someMethod3() throws Exception {
		throw new NegativeAmountException("message");
	}

}

public class ExceptionTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account1 = new Account(1, 1000);
		Account account2 = new Account(2, 2000);
		Account account3 = new Account(3, 3000);

		AccountManager accManager = new AccountManager();
		accManager.addAccount(account1);
		accManager.addAccount(account2);
		accManager.addAccount(account3);

		try {
			accManager.checkAccount(1);
			System.out.println(accManager);
			accManager.deposit(1, 100);
			System.out.println(accManager);
			accManager.withdraw(1, 200);
			System.out.println(accManager);

			System.out.println(accManager.checkAccount(4));
			// System.out.println(accManager.deposit(4, 100));
			System.out.println(accManager.deposit(3, 100));

			System.out.println(accManager.withdraw(4, 100));
			System.out.println(accManager.withdraw(3, -100));
			System.out.println(accManager.withdraw(3, 10000));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

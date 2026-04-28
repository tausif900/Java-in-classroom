package _5_Classes_Objects;

public class BankAccount {
	String accountHolder;
	int balance;

	public BankAccount() {
		System.out.println("Account Created");
	}

	BankAccount(String accountHolder, int balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void deposit(int amount) {
		this.balance = this.balance + amount;
		System.out.println(amount + " added");
	}

	public void withdraw(int amount) {
		this.balance = this.balance - amount;
		System.out.println(amount + " withdrawn");
	}

	public void checkBalance() {
		System.out.println("Balance " + this.balance);
	}
}

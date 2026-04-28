package _5_Classes_Objects;

public class BankData {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Tausif Ansari", 2000);
		BankAccount b2 = new BankAccount("Rabiya Ansari", 4000);
		new BankAccount();

		b1.deposit(1000);
		b1.checkBalance();
		b2.deposit(4000);
		b2.checkBalance();
		b1.withdraw(2000);
		b1.checkBalance();
	}
}

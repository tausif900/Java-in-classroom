package _6_Inheritance;

public class FreeLancer extends Employee {
	int visitPay;

	public FreeLancer(int visitPay) {
		super();
		this.visitPay = visitPay;
	}

	public FreeLancer(int id, String name, String joiningDate, int visitPay) {
		super(id, name, joiningDate);
		this.visitPay = visitPay;
	}

}

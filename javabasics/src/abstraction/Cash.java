package abstraction;

public class Cash implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment Paid by Cash");
	}

}

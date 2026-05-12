package abstractionAndInterface;

public class CreditCard implements Payment{

	@Override
	public void pay() {
		System.out.println("Payment done using CreditCard");
	}

}

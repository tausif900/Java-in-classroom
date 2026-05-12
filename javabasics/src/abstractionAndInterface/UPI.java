package abstractionAndInterface;

public class UPI implements Payment {

	@Override
	public void pay() {
		System.out.println("UPI Payment is done");
	}

}

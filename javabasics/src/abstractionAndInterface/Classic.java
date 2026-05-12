package abstractionAndInterface;

public class Classic extends Restaurant {

	@Override
	void menu() {
		System.out.println("Menu of Classic Restaurant");
	}

	@Override
	void placeOrder() {
		System.out.println("Order Placed");
	}

	void rules() {
		super.rules();
		System.out.println("Classic rules");
	}
}

package abstractionAndInterface;

public class FoodRestaurant extends Restaurant {

	@Override
	void menu() {
		System.out.println("Menu of FoodRestaurant");
	}

	@Override
	void placeOrder() {
		System.out.println("Order placed ");
	}
}

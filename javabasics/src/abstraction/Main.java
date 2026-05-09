package abstraction;

public class Main {
	public static void main(String[] args) {
		FoodRestaurant restaurant = new FoodRestaurant();
		restaurant.menu();
		restaurant.placeOrder();
		restaurant.rules();

		System.out.println("----------------------------");

		Classic c1 = new Classic();
		c1.menu();
		c1.placeOrder();
		c1.rules();

		System.out.println("----------------------------");

//		Anonymous inner type
//		Here we have created an object of Restaurant abstract class
		
		Restaurant arasa = new Restaurant() {

			@Override
			void placeOrder() {
				System.out.println("Order placed");
			}

			@Override
			void menu() {
				System.out.println("Menu of arasa");
			}

		};
		arasa.menu();
		arasa.placeOrder();
	}
}











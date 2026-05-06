package absatraction;

public abstract class Restaurant {
	abstract void menu();

	abstract void placeOrder();

	void rules() {
		System.out.println("Rules of the Restaurants");
	}
}

//4 pillers of OOPS - inheritance, encapsulation, polymorphism and Abstraction.

//Abstraction - hiding Implementation details and showing functionality to the users.

// A method without implmentation is called abstract method. 

// to write abstract method we use abstract keyword and the class should also be abstract then only we can create abstract method .

// if we declare any class as a abstract class, we can then create normal method also with the abstract method, but we cann't create abstract method in normal class.

//It acts as a blueprint for other classes. 

//we cann't create objects directly as we don't have code in the abstract class.We can create object by Anonymous inner type

// we have to override methods of abstract class when we inherit the parent abstract class in the child class class otherwise it shows error.
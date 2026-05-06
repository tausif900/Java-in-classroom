package absatraction;

public class Car extends Vehicle {

	@Override
	void startVehicle() {
		System.out.println("Car has started");
	}	
	
	@Override
	void stopVehicle() {
		System.out.println("Car has stopped");
	}

}

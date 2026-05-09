package abstraction;

public abstract class Vehicle {
	
	abstract void startVehicle();

	abstract void stopVehicle();
	
	void horn() {
		System.out.println("Beep beeppp......!!!!!!!!!!");
	}
}

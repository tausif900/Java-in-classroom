package absatraction;

public abstract class Vehicle {
	
	abstract void startVehicle();

	abstract void stopVehicle();
	
	void horn() {
		System.out.println("Beep beeppp......!!!!!!!!!!");
	}
}

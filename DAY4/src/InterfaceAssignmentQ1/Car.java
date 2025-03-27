package InterfaceAssignmentQ1;
import java.util.Scanner;

public class Car implements Vehicle {
	public Car() {
		super();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Started!!!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car Stopped!!!");
	}

	@Override
	public void getFuelLevel() {
		// TODO Auto-generated method stub
		System.out.println("Fuel Level is 100");
	}
	
	@Override
	public void getVehicleType() {
		// TODO Auto-generated method stub
	
	}

	public void serviceRequired() {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.getFuelLevel();
		c1.getVehicleType();
		c1.serviceRequired();
		Vehicle v1 = new Car();
		Vehicle.serviceRequired();
		v1.startWithLog();
	}
	

}

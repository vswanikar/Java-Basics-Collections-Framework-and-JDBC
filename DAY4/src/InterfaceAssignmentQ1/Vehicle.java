package InterfaceAssignmentQ1;
import java.util.*;
public interface Vehicle {
	void start();
	void stop();
	void getFuelLevel();
	default void  getVehicleType() {
		System.out.print("Unknown Vehicle");
	}
	public static void  serviceRequired() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is Service Required -- Eneter 1 else press 0");
		int i = sc.nextInt();
		if(i==0) {
			System.out.println("Service is NOT required");
		}
		else
			System.out.println("Service is required");
	}
		private void log(String message) {
			System.out.println(message);
	}
		default void startWithLog(){
			log("Vehicle Started!");
			//start();
	}	
}
	

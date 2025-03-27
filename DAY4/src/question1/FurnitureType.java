package question1;
import java.util.Scanner;
public enum FurnitureType {
	CHAIR, TABLE, BED;
	public static FurnitureType acceptData() {
		Scanner sc = new Scanner(System.in);
		String type =sc.nextLine();
		if(type.equalsIgnoreCase("chair")) {
			return CHAIR;
		}
		else if (type.equalsIgnoreCase("table")) {
			return TABLE;
		}	
		else 
			return BED;
	}
}
	



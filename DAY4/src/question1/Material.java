package question1;
import java.util.Scanner;
public enum Material {
	IRON , STEEL , WOODEN;
	public static Material acceptData() {
		Scanner sc = new Scanner(System.in);
		String material =sc.nextLine();
		if(material.equalsIgnoreCase("iron")) {
			return IRON;
		}
		else if (material.equalsIgnoreCase("steel")) {
			return STEEL;
		}	
		else 
			return WOODEN;
}


}

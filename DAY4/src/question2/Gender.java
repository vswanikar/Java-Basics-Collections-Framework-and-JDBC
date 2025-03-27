package question2;
import java.util.Scanner;
public enum Gender {
	MALE,FEMALE;
	public static Gender acceptData() {
		 Scanner in = new Scanner(System.in);
		 String gender = in.nextLine();
		 if(gender.equalsIgnoreCase("male")) {
			 return MALE;
		 }
		 else if(gender.equalsIgnoreCase("female")) {
			 return FEMALE;
		 

}
}
}
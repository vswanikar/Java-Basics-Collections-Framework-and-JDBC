package test;
import java.util.Scanner;
enum Gender {
	MALE,FEMALE;
	public static Gender acceptData() {
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		if(str.equalsIgnoreCase("male")) {
			System.out.print(str);
		}
			
		
	}

}

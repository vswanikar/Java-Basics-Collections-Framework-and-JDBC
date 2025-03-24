package Assignment;
import java.util.Scanner;

public class prog4 {
	public static void main(String a[]) {
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		String address = obj.nextLine();
		String phoneNo = obj.nextLine();
		System.out.println("Name : "+name + "\nAddress : " +address+ "\nphoneNo : " +phoneNo);
		obj.close();
	}

}

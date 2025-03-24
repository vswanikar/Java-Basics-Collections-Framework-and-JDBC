package Assignment;
import java.util.Scanner;
public class prog6 {
	public static void main(String a[]) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter num1 : ");
	int num1= obj.nextInt();
	System.out.println("Enter num2 : ");
	int num2= obj.nextInt();
	int product = num1*num2;
	System.out.println("Sum : " +product);
	
	obj.close();
	}

}

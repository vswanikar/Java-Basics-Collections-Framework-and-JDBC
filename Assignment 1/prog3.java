package Assignment;
import java.util.Scanner;

public class prog3 {
	public static void main(String a[]) {
		String name;
		int age;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = obj.nextLine();
		System.out.println("Enter age: ");
		age = obj.nextInt();
		System.out.println("Hello! My name is " +name+ " And I am " +age+  " years old.");
		
	}

}

package OOPS;
import java.util.Scanner;
public class Rectangle {
	private int  width;
	private int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int a) {
		width = a;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int a) {
		height = a;
	}
	public int getArea() {
		return  width*height;
	}
	public void getPerimeter() {
		return 2*(width + height);
		
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER Width: ");
		width  = sc.nextInt();
		System.out.println("ENTER Height: ");
		height  = sc.nextInt();
		sc.close();
	}
	public void showData() {
		System.out.println("Width "+width);
		System.out.println("height "+height);
		
	}
	public static void main(String args[]) {
		Rectangle rec1;
		rec1 = new Rectangle();
		rec1.setWidth(100);
		rec1.setHeight(200);
		rec1.showData();
		System.out.println("Area :"+rec1.getArea());
		Rectangle rec2 = new Rectangle();
		rec2.acceptData();
		rec2.showData();
		System.out.println("Area :"+rec2.getArea());
	}

}

package inheritance;
import java.util.Scanner;
public class Point {
	protected int x; //data hided so used :private
	protected int y;
	//constructors
	public Point() {//Point p = new Point();		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y= y;
	}
	public int  getX() {
		return x;// value fetching
	}
	public void  setX(int a) {
		  x = a;
	}
	public int  getY() {
		return y;
	}
	public void  setY(int a) {
		  y = a;
	}
	public void acceptData(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter X:");
		x = in.nextInt();
		System.out.println("Enter Y:");
		y = in.nextInt();
		
		//in.close();
		
	}
	public void showData() {
		System.out.println("X  :"+x);
		System.out.println("Y  :"+y);
	}
	public static void main(String args[]) {
		Point p;//decleration of object
		p = new Point(); // initialization 
		p.setX(10);
		p.setY(20);
		p.showData();
		Point p1 = new Point(); // dec and ini
		p1.acceptData();
		p1.showData();
		
	}

}

package OOPS;
import java.util.Scanner;
class  Point1 {
	
		protected int x; //data hided so used :private
		protected int y;
		//constructors
		public Point1() {//Point p = new Point();
			//System.out.println("Constructor called sucessfully!");
		}
		
		public Point1(int x, int y) {
			this.x = x;
			this.y= y;
			//System.out.println("Constructor called sucessfully!");
		}
		public int  getX() {
			return x;// value fetching
		}
		public void  setX(int x) {
			  this.x = x;
		}
		public int  getY() {
			return y;
		}
		public void  setY(int y) {
			  this.y = y ;
		}
		public void acceptData(){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter X:");
			x = in.nextInt();
			System.out.println("Enter Y:");
			y = in.nextInt();
			
			in.close();
			
		}
		public void showData() {
			System.out.println("X  :"+x);
			System.out.println("Y  :"+y);
		}
		public static void main(String args[]) {
			Point1 p;//decleration of object
			p = new Point1(); // initialization 
			//p.setX(10);
			//p.setY(20);
			p.showData();
			Point1 p1 = new Point1(); // dec and ini
			//p1.acceptData();
			p1.showData();
			
		}

}

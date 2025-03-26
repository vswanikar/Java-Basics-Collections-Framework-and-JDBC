package inheritance;
import java.util.Scanner;
class Rectangle extends Point {
	protected int height;
	protected int width;
	//constructor1
	public Rectangle () {
		super(10,10);
		height = 10;
		width = 15;
	}
	//constructor3
	public Rectangle(int x , int y , int height , int width) {
		super(x,y);
		height = 10;
		width = 15;
	}
	//constructor4
	public Rectangle(int height, int width) {
		super(10,20);
		this.height=height;
		this.width=width;
	
	}
	//constructor5
	public Rectangle(Point p) {
		super(p.getX(),p.getY());
		this.height=height;
		this.width= width;
		
	}
//	contructor6
	public Rectangle(Point p, int height, int width) {
		super(p.getX(),p.getY());
		this.height=height;
		this.width= width;
	}
	//GET and SET
	public int getHeight() {
		return height;

	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth( int width) {
		this.width=width;
	}
	public int getArea() {
		return height*width;
	}
	public int getPerimeter() {
		return(2*(width + height));
	}
	@Override
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter height of Rectangle: ");
		height = in.nextInt();
		System.out.print("Enter width of Retangle: ");
		width = in.nextInt();
		//in.close();
		}
	@Override
	public void showData() {
		super.showData();
		System.out.println("Height : "+height);
		System.out.println("Width : "+width);
	}
	public static void main(String args[]) {
		//creating obj1
		//Point p  = new Point();
		/*Rectangle r1 = new Rectangle(p, 100,200);
		r1.acceptData();
		r1.showData();
		System.out.println("Area of Reactangle: "+r1.getArea());
		System.out.println("Perimeter of Reactangle: "+r1.getPerimeter());
		*/
		Point p1 = new Point(1,2);
		Rectangle r2 = new Rectangle(p1,40,80);
		r2.showData();
		System.out.println("Area of Reactangle: "+r2.getArea());
		System.out.println("Perimeter of Reactangle: "+r2.getPerimeter());
		
		
	}
	
	
	
	

}

package OOPS;
import java.util.Scanner;
class Circle extends Point {
	protected float radius;
	/*public Circle() {
		x = 10 // redundancy
		y = 10
		radius = 10
	}*/
	public Circle() {
		super(10,10);// reusalbilty
		radius= 10;
	}
	public Circle(int x , int y, float radius) {
		super(x,y);
		this.radius= 10f;
	}
	public Circle(float radius) {
		super(10,20);
		this.radius= radius;
	}
	public Circle(int x , int y, float radius) {
		super(x,y);
		this.radius= radius;
	}
// reference data type as an argument-
	public Circle(Point p) {
		super(p.getX(),p.getY());
		this.radius=radius;
	}
	public Circle(Point p, float radius) {
		super(p.getX(),p.getY());
		this.radius=radius;
	}
	//get and set 
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius=radius;
	}
	public float getArea() {
		return (float)(Math.PI*Math.pow(radius, 2));
	}
	public float getCircumference() {
		return (float)(2*Math.PI*radius);
	}
	
	@Override 						//annotation Override
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		radius = sc.nextFloat();
		sc.close();
	}
	
	@Override
	public void showData() {
		super.showData();
		System.out.println("Radius: "+radius);
		
	}
	public Point getCenter() {
		int x = getX();
		int y = getY();
		Point p = new Point(x,y); // when we use reference ---> 'new' is used
		return p;
		//return new Point(getX(),getY());
	}
	public static void main(String args[]) {
	//	object1
		Circle c1 = new Circle(10,20,30f);
		c1.showData();
		
	//  object2	
		Point p = new Point(1,2);
		Circle c2 = new Circle(3f)
		c2.showData();
		
		Point p1 = c1 .getCentre()
	}
	
	
	
}

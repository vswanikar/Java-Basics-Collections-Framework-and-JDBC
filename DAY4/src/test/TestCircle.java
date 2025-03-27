package test;
import java.util.Scanner;
public class TestCircle {
	protected float radius;
	public static final float PI = 3.14f;
	public TestCircle() {
		
	}
	public TestCircle(float radius) {
		this.radius=radius;
	}
	public float getRadius() {
		return radius;
	}
	public void setradius(int radius) {
		this.radius=radius;
	}
	public final float getArea() {
		return (float)(PI*radius*radius);
	}
	public final float getCircumference() {
		return (float)(PI*radius*radius);

	}
	public final void main(String args[]) {
		TestCircle c1= new TestCircle();
		
	}
		
		
		
		
		
		
		
		
}

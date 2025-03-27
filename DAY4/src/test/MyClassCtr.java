package test;

//package OOPS;
import java.util.Scanner;
class MyClassCtr {
	protected int a;
	protected int b;
	protected static int ctr;
	public MyClassCtr() {
		ctr++;
	}
	public MyClassCtr(int a, int b) {
		ctr++;
		
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a=a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b=b;
	}
	public static int getCtr() {//as ctr(counter) is Static so we written static 
		return ctr;
	}
	public void accpetData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A: ");
		a=sc.nextInt();
		System.out.print("Enter B: ");
		b=sc.nextInt();
		sc.close();
	}
	public void showData() {
		System.out.print("A: "+a);
		System.out.print("A: "+b);
		//System.out.print("Counter :" +getCtr());
	}
	public static void main() {
		MyClassCtr c1= new MyClassCtr();
		if(getCtr()<0) {
			System.out.println("Too Less");
		}
		else if(getCtr()==0) {
			System.out.println("Will do");
			
		}
		else {
			System.out.println("Exceeding the Limits");}
		System.out.print("Counter :" +getCtr());
		
	}

}

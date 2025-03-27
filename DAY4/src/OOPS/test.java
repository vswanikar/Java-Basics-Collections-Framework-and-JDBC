package OOPS;

public class test {
	static {
		int a =10;
		System.out.println("A : "+a);
	}
	public static void main(String args[]) {
	
		int a =20;
		System.out.println("A: "+a);
	}
	static {//it is executed prior to main function
		int a =30;
		System.out.println("A: "+a);
	}
	

}

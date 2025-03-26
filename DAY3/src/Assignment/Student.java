package Assignment;
import java.util.Scanner;
public class Student {
	protected String name;
	protected String cls;
	protected String section;
	protected int marks1;
	protected int marks2;
	protected int marks3;
	protected int marks4;
	//Constructors 
	public Student() {
		
	}
	public Student(String name ,String cls, String section, int marks1, int marks2, int marks3, int marks4) {
		this.name= name;
		this.cls=cls;
		this.section=section;
		this.marks1= marks1;
		this.marks1= marks2;
		this.marks1= marks3;
		this.marks1= marks4;
	}
	public String getName() {
		return name;
	}
	public String getCls() {
		return cls;
	}
	public String getSection() {
		return section;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1= marks1;
	}
	public int getMarks2() {
		return marks1;
	}
	public void setMarks2(int marks2) {
		this.marks2= marks2;
	}
	public int getMarks3() {
		return marks2;
	}
	public void setMarks3(int marks3) {
		this.marks3= marks3;
	}
	public int getMarks4() {
		return marks4;
	}
	public void setMarks4(int marks4) {
		this.marks4= marks4;
	}
	public int getTotal() {
		return marks1+marks2+marks3+marks4;
	}
	public float getPercentage() {
		return (getTotal()/4);
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Student:  ");
		name = sc.nextLine();
		System.out.println("Enter Class:   ");
		cls = sc.nextLine();
		System.out.println("Enter Section:  ");
		section = sc.nextLine();
		System.out.println("Enter Subject 1 Marks:  ");
		marks1 = sc.nextInt();
		System.out.println("Enter Subject 2 Marks:  ");
		marks2 = sc.nextInt();
		System.out.println("Enter Subject 3 Marks:  ");
		marks3 = sc.nextInt();
		System.out.println("Enter Subject 4 Marks:  ");
		marks4 = sc.nextInt();
		sc.close();
	
	}
	public void showData() {
		System.out.println("Name of Student:  "+name);
		System.out.println("Class:   "+cls);
		System.out.println("Section:   "+section);
		System.out.println("Subject1 Marks:   "+marks1);
		System.out.println("Subject2 Marks:   "+marks2);
		System.out.println("Subject3 Marks:   "+marks3);
		System.out.println("Subject4 Marks:   "+marks4);
		
	}
	public static void main(String args[]) {
		Student s1 = new Student();
		/*s1.setMarks1(90);
		s1.setMarks2(70);
		s1.setMarks3(85);
		s1.setMarks4(100);
		*/
		s1.acceptData();
		s1.showData();
		System.out.println("Total :"+s1.getTotal());
		System.out.println("Percentage :"+s1.getPercentage());
		//Student s2 = new Student();
		//s2.acceptData();
		//s2.showData();
		
	}
	
}

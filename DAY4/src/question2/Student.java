package question2;
import java.util.Scanner;
public class Student {
	protected int enrollmentNo;
	protected String name;
	protected Gender gender;
	protected String classs;
	protected String section;
	protected House house;
	
	public Student() {
		
	}
	public Student(int enrollmentNo,String name,Gender gender,String classs,String section,House house) {
		this.enrollmentNo=enrollmentNo;
		this.name= name;
		this.gender=gender;
		this.classs=classs;
		this.section=section;
		this.house=house;
		
		
	}
	public int getEnrollmentNo() {
		return enrollmentNo;
	}
	public void setEnrollmentNo(int enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter enrollmentNo: ");
		enrollmentNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		name=sc.nextLine();
		System.out.println("Enter Gender: ");
		gender=Gender.acceptData();
		System.out.println("Enter Class: ");
		classs=sc.nextLine();
		System.out.println("Enter Section: ");
		section=sc.nextLine0();
		System.out.println("Enter enrollmentNo: ");
		enrollmentNo=sc.nextInt();
		
	
	
	}

}

package EmployeeProblem;
import java.util.Scanner;
class Employee {
	protected String name;
	protected String code;
	public Employee() {
		
	}
	public Employee (String name, String code) {
		this.name = name;
		this.name= name;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code= code;
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of Employee: ");
		name = sc.nextLine();
		System.out.print("Enter Code of Employee: ");
		code = sc.nextLine();
	}
	public void showData() {
		System.out.println("Name: "+name);
		System.out.println("Code: "+code);
	}
	public static void main(String args[]) {
		Employee e = new Employee();
		e.setName("Vedant");
		e.setCode("0012");
		e.showData();
		e.acceptData();
		e.showData();
	}
	

}

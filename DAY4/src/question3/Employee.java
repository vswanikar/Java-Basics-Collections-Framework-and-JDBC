package question3;
import java.util.*;
public class Employee implements EmpInterface {
	protected int code;
	protected String name;
	protected int basicPay;
	public Employee() {
		super ();
	}	
	public Employee(int code, String name, int basicPay) {
		super();
		this.code=code;
		this.name=name;
		this.basicPay=basicPay;
		
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	@Override
	public void ShowData() {
		// TODO Auto-generated method stub
		
	}
	

}

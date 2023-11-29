package day08_inheritance.ex02;

public class QuizEmployee {
	
	protected int enumber, phone ;
	protected String name, part ;
	
	public QuizEmployee() {
		
	}
	
	public QuizEmployee(int enumber, int phone, String name, String part) {
		this.enumber = enumber;
		this.phone = phone;
		this.name = name;
		this.part = part;
		System.out.println(name +" " + enumber + " " + part + " " + phone);
		
	}
	
	public int getEnumber() {
		return enumber;
	}
	public void setEnumber(int enumber) {
		this.enumber = enumber;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
}
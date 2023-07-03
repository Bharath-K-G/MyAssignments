package week3.day1;

public class Constructor1 {

	int x;
	String name;
	public Constructor1() {
		System.out.println("default constructor");
		x=2023;
		name="testleaf";
		System.out.println(x+ " " +name );
		
	}
	public Constructor1(int x, String name) {
		this();
		System.out.println("parameterized constructor");
		this.x=x;
		this.name=name;
		
		System.out.println("age is " +x+ " name : " +name+ " ");
	}
	public Constructor1(String companyname) {
		this(14,"TCS");
		System.out.println(companyname);
		
	}
	public void add() {
		System.out.println("add");
	}
public static void main(String[] args) {
	Constructor1 c1 = new Constructor1("testleaf");
}
}

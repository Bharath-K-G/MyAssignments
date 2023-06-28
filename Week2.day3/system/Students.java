package org.system;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("The student id is " +id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The sudent id and name are " +id + " and " +name);
		
	}
	public void getStudentInfo( String email, Long phonenumber) {
		System.out.println("The Student email and phonenumber are " +email+ " and " +phonenumber);
	}
	public static void main(String[] args) {
		Students S =new Students();
		S.getStudentInfo(3);
		S.getStudentInfo(3, "Bharath");
		S.getStudentInfo("XYZ@gmail.com", 9865354563l);
	}


}


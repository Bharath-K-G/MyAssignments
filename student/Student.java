package org.student;

import org.department.Department;

public class Student extends Department {

	//studentName(),studentDept(),studentId()
	public void studentName() {
		System.out.println("Bharath");
	}
	public void studentDept() {
		System.out.println("MCA");
	}
	public void studentId() {
		System.out.println("14");
	}
	public static void main(String[] args) {
		Student ST =new Student();
		ST.collegeName();
		ST.collegeCode();
		ST.CollegeRank();
		ST.deptName();
		ST.studentName();
		ST.studentDept();
		ST.studentId();
	}
	
}

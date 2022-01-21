package org.emp;

public class Employee {

	public void empID()
	{
	System.out.println("emp id is 12345");

	}
	public void empName() {
	System.out.println("Emp Name is Preethy");
	
	}
	
	public void empDOB() {
		
	System.out.println("12-Feb-89");
		
	}
	
	public static void main(String[] args) {
	
		Employee e = new Employee();
		
		e.empID();
		e.empName();
		e.empDOB();
	}
	
	
}

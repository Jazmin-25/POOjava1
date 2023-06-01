package org.generation.classes;

public class Employee extends Person {
	private String department;
	private double salary;
	public Employee(String name, int age, String email, String rfc, String address, String department, double salary) {
		super(name, age, email, rfc, address);
		this.department = department;
		this.salary = salary;
	}//constructor
	
	public double calculateSalary(int days) {
		double total = 0;
		total = (this.salary*days) *1.16;
		return total;
	}//calculateSalary
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary

	@Override
	public String toString() {
		return "Employee ["+getId()+ "department=" + department + ", salary=" + salary + ", getId()=" + getId() + ", toString()="
				+ super.toString() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getAge()="
				+ getAge() + ", getAddress()=" + getAddress() + ", getRfc()=" + getRfc() + "]";
	}
	
	//tostring
	
}//Class emplye

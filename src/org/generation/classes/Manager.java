package org.generation.classes;

public class Manager extends Employee {

	private int numberOfEmployees;
	private float percentage;
	
	
	public Manager(String name, int age, String email, String rfc, String address, String deparment, double salary,
			int numberOfEmployees, float percentage) {
		super(name, age, email, rfc, address, deparment, salary);
		this.numberOfEmployees = numberOfEmployees;
		this.percentage = percentage;
	}//constructor

	@Override
	public double calculateSalary(int days) {
	double total =0;
	total =((this.getSalary()*1.16))
	total =((this.getSalary()days)*1.16)(1+this.percentage);
		return total;
	}//calculateSalary

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}// getNumberOfEmployees


	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}// setNumberOfEmployees


	public float getPercentage() {
		return percentage;
	}//getPercentage


	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}// setPercentage

	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", percentage=" + percentage
				+ ", getNumberOfEmployees()=" + getNumberOfEmployees() + ", getPercentage()=" + getPercentage() + "]";
	}//tostring
	
	
}//class manager
/*
 * Matthew Homan
 * CMIS 242 7382
 * April 1, 2023
 * Discussion Week 3 Task
 * 
 */

public class FullTime extends Employee{

	//Initialize attributes
	private double salary;
	
	//Constructor
	public FullTime(String name, String employeeID, double salary) {
		super(name, employeeID);
		this.salary = salary;
	}
	
	//Getters and Setters
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//Display employee
	public void display() {
		System.out.println("\nFull-time Employee\n[Name = " + this.getName() + "\nEmployee ID = " + this.getEmployeeID() + "\nSalary = $" + salary + " per year]");
	}
	
}

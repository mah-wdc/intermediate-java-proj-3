/*
 * Matthew Homan
 * CMIS 242 7382
 * April 1, 2023
 * Discussion Week 3 Task
 * 
 */

public class PartTime extends Employee {

	// Initialize attributes
	private double hourlyWage;

	//Constructor
	public PartTime(String name, String employeeID, double salary) {
		super(name, employeeID);
		this.hourlyWage = salary;
	}

	//Getters and Setters
	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	//Display employee
	public void display() {
		System.out.println("\nPart-time Employee\n[Name = " + this.getName() + "\nEmployee ID = " + this.getEmployeeID()
				+ "\nHourly Wage = $" + hourlyWage + " per hour]");
	}

}

/*
 * Matthew Homan
 * CMIS 242 7382
 * April 1, 2023
 * Discussion Week 3 Task
 * 
 */

public class Employee {

	//Initialize attributes
	private String name;
	private String employeeID;
	
	//Constructor
	public Employee(String name, String employeeID) {
		this.name = name;
		this.employeeID = employeeID;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
}

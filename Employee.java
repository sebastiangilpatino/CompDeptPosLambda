package LmbdLab31;

import java.util.GregorianCalendar;

public class Employee {
	private Position position;
	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private GregorianCalendar birthDate;
	private String SSN;
	private double salary;

	public Employee(String name, int salary, Position position) {
		this.firstName = name;
		this.salary = salary;
		this.position = position;
	}

	public String getPositionName() {
		return position.getTitle();
	}

	public void print() {
		System.out.println("");
		System.out.print("   " + firstName + " ");
	}

	public double getSalary() {
		return salary;
	}
}

package LmbdLab31;

public class Position {
	private String title;
	private String description;
	private Employee employee;
	private Department department;

	public Position(String title, Department department) {
		this.title = title;
		this.department = department;
	}

	public void addEmployee(Employee emp) {
		if (emp.getPositionName().equals(title)) {
			employee = emp;
		} else {
			System.out.println("Employee does not match");
		}

	}

	public String getDepartmentName() {
		return department.getName();
	}

	public void print() {
		System.out.println("");
		System.out.print("  " + title + ": ");

		if (employee != null) {
			employee.print();
		}

		System.out.println("");
	}

	public String getTitle() {
		return title;
	}

	public double getSalary() {
		double sal = 0;

		if (employee != null) {
			sal += employee.getSalary();
		}

		return sal;
	}

}
package LmbdLab31;

import java.util.ArrayList;
import java.util.List;

public class Company {
	List<Department> departments;
	private String name;

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	public Company(String name) {
		departments = new ArrayList<Department>();
		this.name = name;
	}

	public void print() {
		System.out.println(name + ": ");
		departments.stream().forEach(d -> d.print());
	}

	public void addDepartment(Department dept) {
		if (dept.getNameCompany().equals(this.name)) {
			departments.add(dept);
		} else {
			System.out.println("the company does not match");
		}
	}

	public double getSalary() {

		return departments.stream().mapToDouble(Department::getSalary).sum();

	}
}

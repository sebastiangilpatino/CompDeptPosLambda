package LmbdLab31;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private String location;
	private List<Position> positions;
	private Company company;

	public Department(String name, Company company) {
		positions = new ArrayList<Position>();
		this.name = name;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public String getNameCompany() {
		return company.getName();
	}

	public void print() {
		System.out.println("");
		System.out.print(" " + name + ": ");

		positions.stream().forEach(p -> p.print());

	}

	public void addPosition(Position pos) {
		if (pos.getDepartmentName().equals(this.name)) {
			positions.add(pos);
		} else {
			System.out.println("Position does not match");
		}
	}

	public double getSalary() {
		return positions.stream().mapToDouble(Position::getSalary).sum();
	}

}

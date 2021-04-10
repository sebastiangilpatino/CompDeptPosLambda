package LmbdLab31;

public class Main {

	public static void main(String[] args) {

		Company companyX = new Company("X");

		Department departmentA = new Department("department A", companyX);
		Department departmentB = new Department("department B", companyX);

		Position marketingA = new Position("Marketing A", departmentA);
		Position salesA = new Position("Sales A", departmentA);
		Position managerA = new Position("Management A", departmentA);

		Position marketingB = new Position("Marketing B", departmentB);
		Position salesB = new Position("Sales B", departmentB);
		Position managerB = new Position("Management B", departmentB);

		Employee emp1 = new Employee("Joshep", 12000, managerB);
		Employee emp2 = new Employee("Jorge", 9000, managerA);
		Employee emp3 = new Employee("Maria", 8000, salesA);

		companyX.addDepartment(departmentA);
		companyX.addDepartment(departmentB);

		departmentA.addPosition(marketingA);
		departmentA.addPosition(salesA);
		departmentA.addPosition(managerA);

		departmentB.addPosition(marketingB);
		departmentB.addPosition(salesB);
		departmentB.addPosition(managerB);

		managerB.addEmployee(emp1);
		managerA.addEmployee(emp2);
		salesA.addEmployee(emp3);

		companyX.print();
		System.out.println("\nTotal salaries of employees are: " + companyX.getSalary());
	}

}

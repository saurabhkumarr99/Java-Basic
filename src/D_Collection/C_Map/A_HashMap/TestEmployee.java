package D_Collection.C_Map.A_HashMap;

import java.util.HashMap;

class Employee {

	int id;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",salary=" + salary + "]";
	}
}

class CollectionMap {

	HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	public HashMap<Integer, Employee> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(HashMap<Integer, Employee> employeeMap) {
		this.employeeMap = employeeMap;
	}

	public int addEmployee(Employee emp) {
		int res = 2;
		if (emp == null) {
			res = 1;
		} else {
			if (!(employeeMap.containsKey(emp.getId()))) {
				employeeMap.put(emp.getId(), emp);
				res = 0;
			}
		}
		return res;
	}

	public int removeEmployee(int employeeId) {
		int res = 2;
		if (employeeMap.keySet().size() == 0) {
			res = 1;
		} else {
			if (employeeMap.containsKey(employeeId)) {
				employeeMap.remove(employeeId);
				res = 0;
			}
		}
		return res;
	}

	public Employee findEmployee(int employeeId) {
		Employee employee = null;
		if (employeeMap.containsKey(employeeId)) {
			employee = employeeMap.get(employeeId);
		}
		return employee;
	}

	public HashMap<Integer, Employee> getEmployeeList() {
		HashMap<Integer, Employee> EmployeeList = null;
		if (employeeMap.keySet().size() >= 1) {
			EmployeeList = employeeMap;
		}
		return EmployeeList;
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionMap collectionMap = new CollectionMap();

		Employee employee1 = new Employee(1, "Employee1", 3000);
		Employee employee2 = new Employee(2, "Employee2", 2000);
		Employee employee3 = new Employee(3, "Employee3", 3000);
		Employee employee4 = new Employee(4, "Employee4", 5000);
		Employee employee5 = new Employee(5, "Employee5", 4000);

		// Add Employee
		System.out.println(collectionMap.addEmployee(employee1));
		System.out.println(collectionMap.addEmployee(employee2));
		System.out.println(collectionMap.addEmployee(employee3));
		System.out.println(collectionMap.addEmployee(employee4));
		System.out.println(collectionMap.addEmployee(employee5));

		// Add non duplicate Employee
		System.out.println(collectionMap.addEmployee(new Employee(6, "Test", 100)));
		System.out.println();

		// Add duplicate Employee
		System.out.println(collectionMap.addEmployee(employee5));
		System.out.println();

		// List of All Employee
		System.out.println(collectionMap.getEmployeeList());
		System.out.println();

        //Remove existing employee
		System.out.println(collectionMap.removeEmployee(5));
		//Remove not existing employee
		System.out.println(collectionMap.removeEmployee(7)); 
		System.out.println(collectionMap.getEmployeeList());
		System.out.println();
		
        //Find Employee
		System.out.println(collectionMap.findEmployee(3));
		System.out.println(collectionMap.findEmployee(5));

	}

}

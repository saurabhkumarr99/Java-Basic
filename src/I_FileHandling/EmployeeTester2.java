package I_FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class FileReadException extends Exception {

	public FileReadException() {
		super("Can not read");
	}

	public FileReadException(String msg) {
		super(msg);
	}
}

class Employee {

	private int employeeId;
	private String employeeName;
	private String designation;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String designation, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}

}

class EmployeeDetails {

	ArrayList<Employee> employeeList = new ArrayList<Employee>();

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public ArrayList<Employee> readEmployeeDetails(String fileName) throws FileReadException {

		try {
			File f = new File(fileName);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(";");
				int id = Integer.valueOf(data[0]);
				String name = data[1];
				String designation = data[2];
				Double salary = Double.valueOf(data[3]);
				Employee employee = new Employee(id, name, designation, salary);
				employeeList.add(employee);
			}

			br.close();
			fr.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			// ioe.printStackTrace();
			throw new FileReadException("Can not read file");
		}

		return employeeList;
	}
}

public class EmployeeTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails empDetails = new EmployeeDetails();

		try {
			ArrayList<Employee> allEmployees = empDetails.readEmployeeDetails(
					"C:\\Users\\localadmin\\eclipse-workspace\\NPCI_Assignments\\EmployeeData.txt");

			for (Employee employee : allEmployees) {
				System.out.println(employee);
			}
		} catch (FileReadException fre) {
			// TODO: handle exception
			System.out.println(fre);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}

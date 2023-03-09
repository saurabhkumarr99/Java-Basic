package C_NonPrimitiveDataType.C_Class;

class Employee {

	private int id;
	private String firstName;
	private String lastName;
	public String address;

	static int count = 1000;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String address) {
		super();
		this.id = count;
		count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public int getId() {
		return id;
	}

	public void deposit(double money) {
		System.out.println("Money " + money + " credited to " + this.getFullName() + " successfully");
	}

}

class PartTimeEmployee extends Employee {

	private int hoursWorked;
	private int amountPerHour;

	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(String firstName, String lastName, String address, int hoursWorked, int amountPerHour) {
		super(firstName, lastName, address);
		this.hoursWorked = hoursWorked;
		this.amountPerHour = amountPerHour;

	}

	public double computeSal() {
		return (this.hoursWorked * this.amountPerHour);
	}

	public void showDetails() {
		System.out.println("ID :" + this.getId() + "\nName: " + this.getFullName() + "\nAddress : " + this.address
				+ "\nEmployee type : Part Time\n" + "Total hours worked : " + this.hoursWorked + "\nToatal Sary : "
				+ this.computeSal());
	}

}

class FullTimeEmployee extends Employee {

	private double basic;
	private double bonus;

	public FullTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTimeEmployee(String firstName, String lastName, String address, double basic, double bonus) {
		super(firstName, lastName, address);
		this.basic = basic;
		this.bonus = bonus;
	}

	public double computeSal() {
		return (this.basic + this.bonus);
	}

	public void showDetails() {
		System.out.println("ID :" + this.getId() + "\nName: " + this.getFullName() + "\nAddress : " + this.address
				+ "\nEmployee type : Full Time" + "\nToatal Sary : " + this.computeSal());
	}

}

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FullTimeEmployee Empl1 = new FullTimeEmployee("Employee1_fname", "Employee1_lname", "Employee1_Address",
				15000.00, 3500.00);
		PartTimeEmployee Empl2 = new PartTimeEmployee("Employee2_fname", "Employee2_lname", "Employee2_Address", 25,
				500);

		Empl1.showDetails();
		Empl1.deposit(18500.00);
		System.out.println();
		Empl2.showDetails();
		Empl2.deposit(12500.00);
	}

}

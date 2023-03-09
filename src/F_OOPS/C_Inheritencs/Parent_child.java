package F_OOPS.C_Inheritencs;

class Parent {

	private String firstName;
	private String lastName;
	private String address;

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Parent [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

}

class Child1 extends Parent {

	private int income;

	public Child1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child1(String firstName, String lastName, String address, int income) {
		super(firstName, lastName, address);
		this.income = income;
		// TODO Auto-generated constructor stub
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Child1 [income=" + getIncome() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}

class Child2 extends Parent {

	private String car;

	public Child2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child2(String firstName, String lastName, String address, String car) {
		super(firstName, lastName, address);
		this.car = car;
		// TODO Auto-generated constructor stub
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Child2 [car=" + car + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}

public class Parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent[] parent1 = new Parent[5];

		parent1[0] = new Parent("pf1", "pl1", "padr");
		parent1[1] = new Child1("c1f1", "c1l1", "c1adr", 5000);
		// System.out.println(parent1[1].getIncome());
		System.out.println(parent1[1].getFirstName());
		parent1[2] = new Child2("c2f1", "c2l1", "c2adr", "Car1");
		parent1[3] = new Child1("c1f1", "c1l1", "c1adr", 5000);
		parent1[4] = new Child2("c1f1", "c1l1", "c1adr", "Car2");

		for (Parent parent : parent1) {
			System.out.println(parent.toString());
		}

		// Parent p5=new Child1("c1f1", "c1l1", "c1adr");
	}

}

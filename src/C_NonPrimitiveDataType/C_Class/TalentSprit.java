package C_NonPrimitiveDataType.C_Class;

public class TalentSprit {

	private double basePay;
	private int hoursWorked;

	public TalentSprit() {

	}

	public TalentSprit(double basePay, int hoursWorked) {

		this.basePay = basePay;
		this.hoursWorked = hoursWorked;
	}

	public void computeSalary() {
		if (basePay < 8.00 || hoursWorked > 60) {
			System.out.println("Error");
		} else {
			if (hoursWorked < 40) {
				System.out.println("Total pay = " + (hoursWorked * basePay));
			}else {
				System.out.println("Total pay = " +((40 * basePay)+(hoursWorked-40)*basePay*1.5));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TalentSprit Employee1=new TalentSprit(7.5,35);
		TalentSprit Employee2=new TalentSprit(8.2,47);
		TalentSprit Employee3=new TalentSprit(10,3);
		
		Employee1.computeSalary();
		Employee2.computeSalary();
		Employee3.computeSalary();
	}

}

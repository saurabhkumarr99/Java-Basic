package C_NonPrimitiveDataType.C_Class.StudentGrades;

public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Student1 = new Student("student1", 30, 40, 50);
		Student Student2 = new Student("student2", 70, 70, 70);
		Student Student3 = new Student("student3", 55, 55, 55);
		Student Student4 = new Student("student4", 45, 45, 45);
		//System.out.println(Student1);

		Result result1 = new Result();
		System.out.println(result1.resultCalculator(Student1));
		System.out.println(result1.resultCalculator(Student2));
		System.out.println(result1.resultCalculator(Student3));
		System.out.println(result1.resultCalculator(Student4));
	}

}

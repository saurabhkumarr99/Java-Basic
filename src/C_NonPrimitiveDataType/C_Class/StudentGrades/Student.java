package C_NonPrimitiveDataType.C_Class.StudentGrades;

import java.util.concurrent.CountDownLatch;

public class Student {
	private int id;
	private String name;
	private double marks1, marks2, marks3;

	static int count = 1;

	public Student() {

	}

	public Student(String name, double marks1, double marks2, double marks3) {

		this.id = count;
		count++;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
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

	public double getMarks1() {
		return marks1;
	}

	public void setMarks1(double marks1) {
		this.marks1 = marks1;
	}

	public double getMarks2() {
		return marks2;
	}

	public void setMarks2(double marks2) {
		this.marks2 = marks2;
	}

	public double getMarks3() {
		return marks3;
	}

	public void setMarks3(double marks3) {
		this.marks3 = marks3;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3="
				+ marks3 + "]";
	}

}

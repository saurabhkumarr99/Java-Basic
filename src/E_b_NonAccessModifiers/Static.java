package E_b_NonAccessModifiers;

class SampleClass {
	static int num = 1;

	public static void method1() {
		System.out.println("Static method of SampleClass is called.");
	}

	public static int getNum() {
		return num;
	}
}

public class Static {

	public static void main(String[] args) {
		SampleClass.method1();

		int n1 = SampleClass.num;
		System.out.println(n1);

		int n2 = SampleClass.getNum();
		System.out.println(n2);

		int n3 = SampleClass.getNum();
		printNum(n3);

		System.out.println("**********************************************S");
		
		SampleClass2.method1();

		int n1_2 = SampleClass2.num;
		System.out.println(n1_2);

		int n2_2 = SampleClass2.getNum();
		System.out.println(n2_2);

		int n3_2 = SampleClass2.getNum();
		printNum(n3_2);

	}

	public static void printNum(int n) {
		System.out.println(n);
	}

}

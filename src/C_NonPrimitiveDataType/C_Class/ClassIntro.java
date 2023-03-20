package C_NonPrimitiveDataType.C_Class;

class c2{
	
	public void m1() {
		System.out.println("Method1 of c2 called");
	}
	
	public void m2() {
		System.out.println("Method2 of c2 called");
	}
	
	public int  m3() {
		System.out.println("Method3 of c2 called returning 1");
		return 1;
	}
	
	int x=m3();
	
	public void m4() {
		System.out.println("Method4 of c2 called");
		System.out.println("X= "+x);
	}
	
	//m1();
	
	public static void m5() {
		System.out.println("Static Method5 of c2 called");
	}
}

public class ClassIntro {
	
	static void method1() {
		System.out.println("Method1 called");
	}
	
	static void method2() {
		System.out.println("Method2 called");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method called..");
		method1();
		method2();
		
		/**********************************************************************************/
		
		c2.m5();
		
		c2 c2=new c2();
		c2.m1();
		c2.m2();
		c2.m4();
		
		
	}
}

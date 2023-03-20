package F_OOPS.C_Inheritencs;

class parent1 {

	public void method1() {
		System.out.println("Public method1 of parent called.");
	}

	public void method2() {
		System.out.println("Public method2 of parent called.");
	}

	private void method3() {
		System.out.println("Private method3 of parent called.");
	}

	final void method4() {
		System.out.println("Final method4 of parent is called.");
	}

}

class child extends parent1 {

	public void method2() {
		System.out.println("Public method2 of parent is override and called by child.");
	}

//	public void method4() {
//		System.out.println("Final method can not be override");
//	}

	public void method5() {
		System.out.println("Public method5 of child  called.");
	}
}

public class Example1 {
	
	public static void main(String[] args) {
		
		System.out.println("********************************************************************");
		System.out.println("Parent object");
		
		parent1 parent1=new parent1();
		parent1.method1();
		parent1.method2();
		//parent1.method3();
		parent1.method4();
		
		System.out.println("********************************************************************");
		System.out.println("Child object");
		
		child child =new child();
		child.method1();
		child.method2();
		//child.method3();
		child.method4();
		child.method5();
		
		System.out.println("********************************************************************");
		System.out.println("Parent object from child");
		
		parent1 parent2 =new child();
		parent2.method1();
		parent2.method2();
		//parent2.method3();
		parent2.method4();
	    //parent2.method5();
	}

}

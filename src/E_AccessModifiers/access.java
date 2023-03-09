package E_AccessModifiers;

class A {
	private int c = 1;
	final int e = 1;
	public int d = 1;
	public int f = 1;

	public final void show1() {
		// e=2;
		System.out.println("Final method is inherited by child class ");
	}

	public void show() {
		System.out.println("value of private c of class A is " + c);
		System.out.println("value of public d of class A is " + d);
		System.out.println("value of public final e of class A is " + e);
		System.out.println("value of public f of class A is " + f);
		f = 3;
		System.out.println("value of public c,d ,f of class A is changed " + f);
	}
}

final class C {

}
//class c1 extends C{}

class B extends A {
	int c = 2;
	int d = 2;

	// super.c=2;
	// super.d=2;
//   public void show1(){
//
//    }
	public void show() {
		System.out.println("value of public c of class B is " + c);
		System.out.println("value of public d of class B is " + d);
		// System.out.println("value of private c of class A is "+super.c);
		System.out.println("value of public d of class A is " + super.d);
		System.out.println("value of public final e of class A is " + e);
		System.out.println("value of public f of class A is " + f);
	}

	public void B_method() {
		System.out.println("This method melongs to B");
	}
}

public class access {
	public static void main(String[] args) {
		final int s = 1;
		// s=2;
		A a1 = new A();
		a1.show();
		a1.show1();
		System.out.println();
		a1.d = 3;
		// System.out.println(a1.c);
		System.out.println(a1.e);
		// a1.e=3;

		A a2 = new B();
		a2.show();
		a2.show1();
		// a2.B_method();
		System.out.println();

		B b1 = new B();
		b1.show();
		b1.show1();
		b1.B_method();

		C c = new C();
		System.out.println(c);
	}
}

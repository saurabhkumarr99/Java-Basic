package F_OOPS.B_Abstarction;

interface AdvancedArithmetic {
	public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}

public class InterfaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator myCalculator = new MyCalculator();
		int res = myCalculator.divisorSum(6);
		System.out.println(res);
	}
}

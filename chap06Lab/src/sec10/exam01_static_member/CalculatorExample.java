package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);

		Calculator myCalc = new Calculator();
		int result3 = myCalc.minus(10, 5);

		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result3= " + result3);
	}

}

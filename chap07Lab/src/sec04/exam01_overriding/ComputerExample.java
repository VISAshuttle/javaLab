package sec04.exam01_overriding;

public class ComputerExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		Computer myCom = new Computer();
		
		double result1 = myCalc.areaCircle(5);
		System.out.println(result1);
		
		double result2 = myCom.areaCircle(5);
		System.out.println(result2);
	}

}

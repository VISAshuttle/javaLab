package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
//		int y = 0;
//		int z = x / y;
//		System.out.println(z);
		
		double y = 0.0;
		double z = x / y;
		double t = x % y;
		
		if (Double.isInfinite(z) || Double.isNaN(t)) {
			System.out.println("값 산출 불가");
		}
		else {
			System.out.println(z);
			System.out.println(t);
		}
	}
	
}

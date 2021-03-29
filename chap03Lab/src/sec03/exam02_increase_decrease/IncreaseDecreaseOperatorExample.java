package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 1, y = 1, z;
		int result1, result2;
		
		result1 = ++x + 10;	System.out.println("result1: " + result1);
		result2 = y++ + 10;	System.out.println("result2: " + result2);
		
		z = x++;				System.out.println("z=" + z);
	}

}

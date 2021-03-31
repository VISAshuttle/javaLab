package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		// Math,random(): 0.0보다 크고 1.0보다 작은 임이의 실수값 반환
		int dice;
		for (int i = 0; i < 10; i++) {
			dice = (int) (Math.random() * 6) + 1;
			System.out.println("주사위 눈: " + dice);
		}
	}

}

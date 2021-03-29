package sec04.exam01_arithmetic;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1; // 0.1의 근사값을 저장
		int number = 7;
		
		double result = apple - number*pieceUnit; // 근사값으로 계산을 하므로 결과에 오차가 생김
		System.out.println(result); // 0.29999999999999993
	}

}

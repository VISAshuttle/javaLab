package exam0405;

public class SumAvg {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (i == 100)
				avg = (double) sum / i;
		}
		
		System.out.println("1~100 합계: " + sum);
		System.out.println("평균: " + avg);
	}

}
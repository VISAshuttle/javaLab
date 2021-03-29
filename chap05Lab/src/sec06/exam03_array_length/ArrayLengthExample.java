package sec06.exam03_array_length;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < scores.length; i++)
			sum += scores[i];
		avg = (double) sum / scores.length;

		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + avg);
	}

}

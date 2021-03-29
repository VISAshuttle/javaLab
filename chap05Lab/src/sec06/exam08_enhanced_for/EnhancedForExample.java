package sec06.exam08_enhanced_for;

public class EnhancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores)
			sum += score;
		System.out.println("sum = " + sum);

		sum = 0;
		for (int i = 0; i < scores.length; i++)
			sum += scores[i];
		System.out.println("sum = " + sum);
	}

}

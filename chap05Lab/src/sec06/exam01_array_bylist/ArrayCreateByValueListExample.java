package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]= " + scores[i]);
			sum += scores[i];
		}
		
		System.out.println("sum: " + sum);
	}

}

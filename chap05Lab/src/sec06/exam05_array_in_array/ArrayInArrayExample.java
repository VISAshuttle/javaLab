package sec06.exam05_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for (int depth1 = 0; depth1 < mathScores.length; depth1++) {
			for (int depth2 = 0; depth2 < mathScores[depth1].length; depth2++) {
				System.out.printf("mathScores[%d][%d] = %d\n",
								 depth1, depth2, mathScores[depth1][depth2]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int depth1 = 0; depth1 < englishScores.length; depth1++) {
			for (int depth2 = 0; depth2 < englishScores[depth1].length; depth2++) {
				System.out.printf("englishScores[%d][%d] = %d\n",
								 depth1, depth2, englishScores[depth1][depth2]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };
		for (int depth1 = 0; depth1 < javaScores.length; depth1++) {
			for (int depth2 = 0; depth2 < javaScores[depth1].length; depth2++) {
				System.out.printf("javaScores[%d][%d] = %d\n",
								 depth1, depth2, javaScores[depth1][depth2]);
			}
		}
		System.out.println();
	}

}

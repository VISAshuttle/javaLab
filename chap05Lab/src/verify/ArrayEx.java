package verify;

public class ArrayEx {

	public static void main(String[] args) {
		int[][] resultArray = new int[8][9];

		for (int i1 = 0; i1 < 8; i1++) {
			System.out.printf("[%d단]\n", i1 + 2);
			for (int i2 = 0; i2 < 9; i2++) {
				resultArray[i1][i2] = (i1 + 2) * (i2 + 1);
				System.out.printf("%d×%d=%2d\n", i1 + 2, i2 + 1, resultArray[i1][i2]);
			}
			System.out.println("======");
		}

		System.out.printf("\n***** 향상된 for문을 이용 *****\n\n");
		int i1 = 2;
		int column;
		for (int[] i2 : resultArray) {
			System.out.println("[" + i1 + "단]");

			column = 1;
			for (int resultNum : i2)
				System.out.printf("%d×%d=%2d\n", i1, column++, resultNum);

			System.out.println();
			i1++;
		}
	}

}
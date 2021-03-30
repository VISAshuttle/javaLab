package lotto_generator;

import java.util.Arrays;

public class Lotto {

	private static final int QTY_PER_LINE = 6;
	private static final int NUMBER_MAX = 45;
	
	private Lotto() {}

	private static int getNumber() {
		int number = (int) (Math.random() * NUMBER_MAX) + 1;
		return number;
	}
	
	private static int[] getLine() {
		int[] line = new int[QTY_PER_LINE];
		
		boolean isDuplicate;
		for (int i1 = 0; i1 < line.length; i1++) {
			do {
				isDuplicate = false;
				int number = getNumber();
				for (int i2 = 0; i2 < i1; i2++) {
					if (number == line[i2]) {
						isDuplicate = true;
						break;
					}
				}
				if (!isDuplicate)	line[i1] = number;
			} while (isDuplicate);
		}
		
//		sortLine(line);
		Arrays.sort(line);
		return line;
	}

	public static int[][] getBunch(int lineQty) {
		if (lineQty < 1)		return null;
		
		int[][] bunch = new int[lineQty][QTY_PER_LINE];
		for (int i = 0; i < lineQty; i++)
			bunch[i] = getLine();
		
		return bunch;
	}

	// 원래는 sort 기능을 직접 구현하였으나, 표준 라이브러리로 대체하였음
//	private static void sortLine(int[] line) {
//		if (line == null)	return;
//		
//		for (int fixed = line.length; (fixed-1) > 0; fixed--) {
//			for (int i = 0; (i+1) < fixed; i++) {
//				if (line[i] > line[i+1]) {
//					int temp = line[i];
//					line[i] = line[i+1];
//					line[i+1] = temp;
//				}
//			}
//		}
//	}
	
}

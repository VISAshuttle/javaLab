package lotto_generator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lotto {

	private static final int QTY_PER_LINE = 6;
	private static final int NUMBER_MAX = 45;
	
	private Lotto() {}

	private static int getNumber() {
		int number = (int) (Math.random() * NUMBER_MAX) + 1;
		return number;
	}
	
	private static int[] getLine() {
		Set<Integer> hashSet = new HashSet<Integer>();
		while (hashSet.size() != QTY_PER_LINE)
			hashSet.add(getNumber());
		
		int[] line = hashSet.stream().mapToInt(Number::intValue).toArray();
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
	
	public static void printLotto(int[][] bunch) {
		if (bunch == null)	return;
		
		System.out.println("=======================");
		int lineNo = 0;
		for (int[] line : bunch) {
			for (int number : line) {
				System.out.printf("%-2d  ", number);
			}
			System.out.println();
			if (++lineNo % 5 == 0 && lineNo != bunch.length)
				System.out.println("-----------------------");
		}
		System.out.println("=======================");
	}
}
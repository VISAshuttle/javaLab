package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = { { 1, 2 }, { 3, 4 } };
		
		// shallow clone
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
		cloned1[1][1] = 8;
		System.out.println("2차 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
		
		System.out.print("original: ");
		for (int[] a : original)
			for (int b : a)
				System.out.print(b);
		System.out.println();
		System.out.print("cloned: ");
		for (int[] a : cloned1)
			for (int b : a)
				System.out.print(b);
		System.out.println();
		
		// shallow clone
		int[][] cloned2 = {{},{}};
		System.arraycopy(original, 0, cloned2, 0, original.length);
		System.out.println("배열 번지 비교: " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));
		cloned2[1][1] = 8;
		System.out.println("2차 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));
		
		System.out.print("original: ");
		for (int[] a : original)
			for (int b : a)
				System.out.print(b);
		System.out.println();
		System.out.print("cloned: ");
		for (int[] a : cloned2)
			for (int b : a)
				System.out.print(b);
		System.out.println();
	}

}

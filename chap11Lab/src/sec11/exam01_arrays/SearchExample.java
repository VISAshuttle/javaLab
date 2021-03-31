package sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		int[] scores = { 50, 60, 70 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 60);
		System.out.println("찾는 인덱스: " + index);
	}

}

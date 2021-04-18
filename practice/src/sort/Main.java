package sort;

import java.util.List;

import custom.RandomGenerator;

public class Main {

	public static void main(String[] args) {
		RandomGenerator rg = new RandomGenerator();
		List<Integer> sampleList = rg.getRandomIntegerList(50, 10);

		QuickSort qs = new QuickSort();
		List<Integer> sortedList = qs.quickSort(sampleList);

		rg.printIntegerCollection(sortedList);
	}

}

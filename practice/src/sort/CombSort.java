package sort;

import java.util.List;

import custom.RandomGenerator;

public class CombSort {

	public static void main(String[] args) {
		RandomGenerator rand_gen = new RandomGenerator();
		List<Integer> unsorted = rand_gen.getRandomIntegerList(100);
		rand_gen.printIntegerCollection(unsorted);
	}

}

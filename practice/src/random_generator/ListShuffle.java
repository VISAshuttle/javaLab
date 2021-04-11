package random_generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListShuffle extends Container{

	public static final int RAND_MAX = 10000;

	public static void main(String[] args) {
//		long stopwatchStart = System.currentTimeMillis();
		
		List<Integer> list = Arrays.stream(
									IntStream.range(1, RAND_MAX + 1).toArray()
									).boxed().collect(Collectors.toList());
		Random rand = new Random();
		for (int i1 = 0; i1 < list.size(); i1++) {
			int i2 = rand.nextInt(RAND_MAX);
			Collections.swap(list, i1, i2);
		}
		
//		long stopwatchElapsed = System.currentTimeMillis() - stopwatchStart;
		
		printIntegerCollection(list);
		
//		System.out.println("\n\n" + "Elapsed Time: " + stopwatchElapsed + "ms");
	}

}

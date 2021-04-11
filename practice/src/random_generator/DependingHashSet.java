package random_generator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DependingHashSet extends Container{

	public static final int RAND_MAX = 10000;
	
	public static void main(String[] args) {
//		long stopwatchStart = System.currentTimeMillis();
		
		Set<Integer> hashSet = new HashSet<Integer>();
		Random rand = new Random();
		while (hashSet.size() != RAND_MAX)
			hashSet.add(rand.nextInt(RAND_MAX) + 1);
		
//		long stopwatchElapsed = System.currentTimeMillis() - stopwatchStart;
		
		printIntegerCollection(hashSet);
		
//		System.out.println("\n\n" + "Elapsed Time: " + stopwatchElapsed + "ms");
	}

}

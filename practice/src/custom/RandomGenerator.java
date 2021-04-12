package custom;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomGenerator {
	
	public void printIntegerCollection(Collection<Integer> c) {
		Iterator<Integer> iter = c.iterator();
		int i = 0;
		while (iter.hasNext()) {
			if (i != 0 && i % 10 == 0)
				System.out.println();
			System.out.print(iter.next() + "\t");
			i++;
		}
		System.out.println();
	}

	public List<Integer> getRandomIntegerList(int RAND_MAX) {
		List<Integer> list = Arrays.stream(
									IntStream.range(1, RAND_MAX + 1).toArray()
									).boxed().collect(Collectors.toList());
		Random rand = new Random();
		for (int i1 = 0; i1 < list.size(); i1++) {
			int i2 = rand.nextInt(RAND_MAX);
			Collections.swap(list, i1, i2);
		}
		return list;
	}
	
	public Set<Integer> getRandomIntegerSet(int RAND_MAX) {
		Set<Integer> set = new HashSet<Integer>();
		Random rand = new Random();
		while (set.size() != RAND_MAX)
			set.add(rand.nextInt(RAND_MAX) + 1);
		return set;
	}

}

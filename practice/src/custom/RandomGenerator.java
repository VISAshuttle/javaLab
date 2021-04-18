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
		if (c == null)	return;
		
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

	public List<Integer> getRandomIntegerList(int range) {
		int size = range;
		return getRandomIntegerList(range, size);
	}
	
	public List<Integer> getRandomIntegerList(int range, int size) {
		List<Integer> list = Arrays.stream(
									IntStream.range(1, range + 1).toArray()
									).boxed().collect(Collectors.toList());
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			int j = rand.nextInt(range);
			Collections.swap(list, i, j);
		}
		return list.subList(0, size);
	}
	
	public Set<Integer> getRandomIntegerSet(int range) {
		int size = range;
		return getRandomIntegerSet(range, size);
	}
	
	public Set<Integer> getRandomIntegerSet(int range, int size) {
		Set<Integer> set = new HashSet<Integer>();
		Random rand = new Random();
		while (set.size() != size)
			set.add(rand.nextInt(range) + 1);
		return set;
	}

}

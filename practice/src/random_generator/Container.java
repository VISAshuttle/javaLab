package random_generator;

import java.util.Collection;
import java.util.Iterator;

public class Container {
	
	protected static void printIntegerCollection(Collection<Integer> c) {
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
	
}

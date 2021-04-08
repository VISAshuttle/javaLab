package verify01;

import java.util.TreeSet;
import java.util.Random;
import java.util.Set;

public class LottoUsingSet {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();
		Random r = new Random();

		while (s.size() != 6)
			s.add(r.nextInt(45) + 1);
		System.out.println(s);
	}

}

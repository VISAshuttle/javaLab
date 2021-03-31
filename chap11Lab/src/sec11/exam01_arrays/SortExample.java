package sec11.exam01_arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 96, 87 };
		Arrays.sort(scores);
		for (int a : scores)
			System.out.print(a + " ");
		System.out.println();

		String[] names = { "최씨", "이씨", "김씨", "박씨" };
		Arrays.sort(names);
		for (String a : names)
			System.out.print(a + " ");
		System.out.println();

		Member m1 = new Member("홍씨");
		Member m2 = new Member("변씨");
		Member m3 = new Member("김씨");
		Member m4 = new Member("권씨");
		Member[] members = { m1, m2, m3, m4 };
		
		// cannot be cast to java.lang.Comparable
		// 사용자 정의 클래스에 Arrays.sort() 메소드를 사용하기 위해선
		// Comparable 인터페이스를 구현해야 함
		Arrays.sort(members); 
		for (Member m : members)
			System.out.print(m.name + " ");
		System.out.println();

	}

}

package sec11.exam01_arrays;

public class Member implements Comparable<Member> {
	String name;
	
	Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		return this.name.compareTo(o.name);
	}
	
}

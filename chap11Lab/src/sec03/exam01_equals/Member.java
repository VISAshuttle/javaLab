package sec03.exam01_equals;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		if (this.id.equals(member.id))
			return true;
		else
			return false;
	}
	
}

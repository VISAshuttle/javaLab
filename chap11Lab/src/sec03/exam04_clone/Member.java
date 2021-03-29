package sec03.exam04_clone;

// java.lang.Object.clone() 메소드를 사용하여 객체를 복제하려면
// 그 객체는 Cloneable 인터페이스를 구현하고 있어야 한다.
public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); // deep clone
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}

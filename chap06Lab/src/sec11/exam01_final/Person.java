package sec11.exam01_final;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn; // this.ssn은 final 필드이나, 생성자를 통해 객체를 최초 생성할 때 1회만 값 변경 허용
		this.name = name;
	}
}

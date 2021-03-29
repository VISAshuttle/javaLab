package sec03.exam04_clone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("id", "홍길동", "qwerty", 20, true);
		
		Member cloned = original.getMember();
		cloned.password = "QWERTY";
		
		System.out.println("[복제된 객체의 필드값]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println(cloned.adult ? "성인" : "미성년자");
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println(original.adult ? "성인" : "미성년자");
		
	}

}

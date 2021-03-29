package sec03.exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) { // 필드의 값이 같더라도 서로 다른 객체이기 때문
			System.out.println("obj1 = obj2");
		} else {
			System.out.println("obj1 <> obj2");
		}
	}

}

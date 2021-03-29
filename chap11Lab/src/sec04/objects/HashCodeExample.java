package sec04.objects;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		// 재정의한 hashCode() 메소드 사용
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
	static class Student {
		int s_no;
		String name;
		
		Student(int s_no, String name) {
			this.s_no = s_no;
			this.name = name;
		}

		// java.lang.Object.hashCode(): 객체의 주소값으로 해시코드 생성
		@Override
		public int hashCode() {
			// java.util.Objects.hash(): 매개변수를 이용하여 해시코드 생성
			return Objects.hash(s_no, name);
		}
		// 객체의 주소값이 아닌 필드값을 이용해 비교하기 때문에 Deep Compare 개념으로 사용가능
	}

}

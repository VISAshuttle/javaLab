package sec03.exam01_parent_constructor_call;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "010101-1010101", 24601);
		System.out.printf("이름: %s, 주민번호: %s, 학번: %d\n",
						student.name, student.ssn, student.studentNo);
	}

}

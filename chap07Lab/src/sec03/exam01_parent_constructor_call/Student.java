package sec03.exam01_parent_constructor_call;

public class Student extends People {
	public int studentNo;
	
	// Implicit super constructor People() is undefined. Must explicitly invoke another constructor
	// 자식 클래스의 생성자가 호출되기 전에 부모 클래스의 생성자가 먼저 호출되기 때문에,
	// 부모 클래스의 기본 생성자가 없을 경우 명시적으로 호출해주어야 함
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); 
		this.studentNo = studentNo;
	}
}

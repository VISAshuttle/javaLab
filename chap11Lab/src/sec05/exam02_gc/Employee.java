package sec05.exam02_gc;

public class Employee {
	public int e_no;
	
	public Employee(int e_no) {
		this.e_no = e_no;
		System.out.println("Employee(" + e_no + ") 생성됨");
	}
	
	@Override
	public void finalize() {
		System.out.println("Employee(" + e_no + ") 삭제됨");
	}
}
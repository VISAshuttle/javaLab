package sec05.exam02_gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.println("emp가 최종적으로 참조하는 사원번호: " + emp.e_no);
		System.gc(); // Garbage Collector 강제 실행
	}

}

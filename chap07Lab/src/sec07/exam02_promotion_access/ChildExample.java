package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		Parent parent = child; // 자식->부모 자동 형변환
		parent.method1();
		parent.method2();
//		parent.method3();	  // 참조 영역 축소 (method3()은 부모 클래스에 없음)
		
		System.out.println(parent.toString());
	}

}

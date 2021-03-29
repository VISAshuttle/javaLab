package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 자식->부모 자동 형변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// 참조영역의 축소
//		parent.field2 = "data2";
//		parent.method3();
		
		// 강제 형변환(casting)
		// (이전에 업캐스팅된 적이 있던)부모 -> 자식 (이 경우 다운캐스팅)
		Child child = (Child) parent; // 참조영역의 확대
		child.field2 = "data2";
		child.method3();
		
		Parent parent2 = new Parent();
		Child child2 = (Child) parent2;
	}

}

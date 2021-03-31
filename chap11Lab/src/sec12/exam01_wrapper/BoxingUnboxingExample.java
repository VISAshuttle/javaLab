package sec12.exam01_wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		// boxing: 기본형(스택) → 참조형(힙)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// unboxing: 참조형(힙) → 기본형(스택)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.printf("%d %d %d\n", value1, value2, value3);
	}

}

package sec06.exam02_field_default_value;

public class FieldInitValueExample {

	public static void main(String[] args) {
		// 기본 생성자를 호출하여 객체를 생성한 후, 그 인스턴스의 주소값을 반환
		FieldInitValue fiv = new FieldInitValue();

		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);

	}

}

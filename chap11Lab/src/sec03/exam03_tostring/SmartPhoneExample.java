package sec03.exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "Android 11");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		
		String str1 = new String("홍길동");
		System.out.println(str1.toString()); // String 클래스는 toString()을 재정의함
	}

}

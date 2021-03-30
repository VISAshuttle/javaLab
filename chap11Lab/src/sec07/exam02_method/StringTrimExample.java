package sec07.exam02_method;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = "123 ";
		String tel2 = "456   ";
		String tel3 = "         789         ";
		
		// trim(): 문자열 앞뒤의 공백을 제거한 새로운 객체를 반환
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}

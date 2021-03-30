package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향 프로그래밍 언어로, 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr); // replace() 메소드는 원본 객체를 수정하지 않고
		System.out.println(newStr); // 새로운 문자열 객체를 반환한다.
	}

}

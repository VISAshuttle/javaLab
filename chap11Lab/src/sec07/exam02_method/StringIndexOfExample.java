package sec07.exam02_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String findStr = "자바";
		if (subject.indexOf(findStr) != -1) {
			System.out.println(findStr + "와 관련된 책입니다.");
		} else {
			System.out.println(findStr + "와 관련없는 책입니다.");
		}
	}

}

package sec07.exam02_method;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "721121-1234567";
		
		String firstNum = ssn.substring(0, 6);
		String secondNum = ssn.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
	}

}

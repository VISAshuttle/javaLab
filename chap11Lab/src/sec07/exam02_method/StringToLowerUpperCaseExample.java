package sec07.exam02_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
//		String original = "Java Programming";
//		String lowerCase = original.toLowerCase();
//		String upperCase = original.toUpperCase();
//		
//		System.out.println(lowerCase);
//		System.out.println(upperCase);
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2)); // equalsIgnoreCase(): 대소문자 구분X
		
		String str3 = str1.toLowerCase();
		String str4 = str2.toLowerCase();
		System.out.println(str3.equals(str4)); // true
	}

}

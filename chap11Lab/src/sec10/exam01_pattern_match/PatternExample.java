package sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void isMatches(boolean flag) {
		if (flag)
			System.out.println("정규식과 일치합니다.");
		else
			System.out.println("정규식과 일치하지 않습니다.");
	}
	
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// (02|010) : 02 혹은 010
		// \d : 한 개의 숫자
		// {n} : 정확히 n개
		// {n,} : 최소 n개 이상
		// {n,m} : n ~ m개
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		isMatches(result);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
//		data = "angel@naver.co.kr";
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		isMatches(result);
		
	}

}

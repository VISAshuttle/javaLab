package verify;

import java.util.Scanner;

public class JuminCheck01 {

	// 주민번호 타당성 검사하는 메소드
	public boolean juminCheck(String jumin) {
		char[] chArr = jumin.toCharArray();
		int[] intArr = new int[chArr.length];
		int[] verifyArr = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		
		int sum = 0;
		boolean isValid = false;

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = chArr[i] - '0';
			if (!(0 <= intArr[i] && intArr[i] <= 9))		break;
			
			if (i != intArr.length - 1) {
				sum += intArr[i] * verifyArr[i];
			} else {
				int check = intArr[i];
				int rest = sum % 11;
				int result = 11 - rest;
				if (result >= 10)	result %= 10;
				isValid = (check == result);
			}
		}

		return isValid;
	}

	public static void main(String[] args) {
		JuminCheck01 jc = new JuminCheck01();
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호 앞자리를 입력하세요:  ");
		String jumin1 = sc.next();
		System.out.print("주민번호 뒷자리를 입력하세요:  ");
		String jumin2 = sc.next();

		if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리는 6자리 입력");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리는 7자리 입력");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("잘못된 주민번호입니다.");
		} else {
			System.out.println("올바른 주민번호입니다");
		}
	}

}

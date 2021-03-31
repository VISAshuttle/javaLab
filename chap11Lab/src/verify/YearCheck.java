package verify;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		int year = sc.nextInt();

		GregorianCalendar cal = new GregorianCalendar();
		if (cal.isLeapYear(year))
			System.out.println(year + "년은 윤년");
		else
			System.out.println(year + "년은 평년");
	}

}
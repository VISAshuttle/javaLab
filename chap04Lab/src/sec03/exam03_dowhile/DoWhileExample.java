package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputString;
		do {
			System.out.print("메시지를 입력하세요(q 입력시 종료): ");
			inputString = scanner.nextLine();
			System.out.println("입력된 메시지: " + inputString);
		} while (!inputString.equals("q") && !inputString.equals("Q"));
		
		System.out.println("\n프로그램 종료");
		scanner.close();
	}

}

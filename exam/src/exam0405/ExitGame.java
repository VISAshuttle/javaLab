package exam0405;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		int input = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			try {
				System.out.print("정수를 입력하세요:  ");
				input = sc.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("[올바른 정수를 입력해주세요!!]");
				i--; continue;
			} finally {
				sc.nextLine();
			}

			sum += input;
			System.out.println("입력 : " + input + ", 합 : " + sum);
			if (sum >= 100) {
				System.out.println("프로그램 종료!");
				break;
			}
		}

		sc.close();
	}

}
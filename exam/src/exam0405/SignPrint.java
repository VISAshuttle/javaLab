package exam0405;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		double num = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요:  ");
			try {
				num = sc.nextDouble();
			} catch (InputMismatchException ime) {
				System.out.println("[올바른 숫자를 입력하세요!!]\n");
				continue;
			} finally {
				sc.nextLine();
			}
			break;
		}
		
		String result = num > 0 ? "양수" : num == 0 ? "0" : "음수" ;
		System.out.println(result);

		sc.close();
	}

}
package verify;

import java.util.Scanner;

public class DoWhileExample1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randNum = (int) (Math.random() * 100) + 1;
		int cnt = 0, inputNum = 0;
		do {
			if (cnt++ % 5 == 0) 	System.out.println("=============================================\n"
												 + "숫자의 범위는 1 이상 100 이하의 자연수입니다.\n"
												 + "=============================================");
			System.out.print("숫자를 입력해보세요: ");	inputNum = scanner.nextInt();
			if (inputNum > randNum)		System.out.println(inputNum + "보단 작습니다.");
			else	 if (inputNum < randNum)	System.out.println(inputNum + "보단 큽니다.");
		} while (inputNum != randNum);
		
		System.out.println("\n" + cnt + "번만에 맞췄습니다.");
		scanner.close();
	}

}
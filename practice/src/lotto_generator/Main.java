package lotto_generator;

import java.util.Scanner;

public class Main {

	public static void printLotto(int[][] bunch) {
		System.out.println("=======================");
		int lineNo = 0;
		for (int[] line : bunch) {
			for (int number : line) {
				System.out.printf("%-2d  ", number);
			}
			System.out.println();
			if (++lineNo % 5 == 0 && lineNo != bunch.length)
				System.out.println("-----------------------");
		}
		System.out.println("=======================");
	}
	
	public static void main(String[] args) {
		int lineQty;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("로또번호를 몇 줄 생성할까요?:  ");
		lineQty = sc.nextInt();
		
		int[][] bunch = Lotto.getBunch(lineQty);
		printLotto(bunch);
		
		sc.close();
	}

}

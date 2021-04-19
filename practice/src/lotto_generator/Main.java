package lotto_generator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("로또번호를 몇 줄 생성할까요?:  ");
		int lineQty = sc.nextInt();
		
		int[][] bunch = Lotto.getBunch(lineQty);
		Lotto.printLotto(bunch);
		
		sc.close();
	}

}

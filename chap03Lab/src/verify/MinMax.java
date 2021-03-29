package verify;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		System.out.println("3개의 정수를 입력하세요.");
		int n1, n2, n3, max, min;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
		min = (n1 < n2) ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
		sc.close();
	}

}
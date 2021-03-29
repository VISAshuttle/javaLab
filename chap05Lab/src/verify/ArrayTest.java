package verify;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int[] input = new int[5];
		int max = 0, min = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요.(공백으로 구분)");
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if (i == 0)
				max = min = input[i];
			else	 {
				if (input[i] > max)	max = input[i];
				if (input[i] < min)	min = input[i];
			}
		}
		
		System.out.print("Array: ");
		for (int i = 0; i < input.length; i++)
			System.out.print(input[i] + " ");
		System.out.println();
		System.out.printf("max: %d\n" + "min: %d\n", max, min);
		
		sc.close();
	}

}
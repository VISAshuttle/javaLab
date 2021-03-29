package verify;

public class Gugudan_printf {

	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; dan++)
			System.out.print(" [" + dan + "단]" + "\t");
		System.out.println();
		
		for (int multiplier = 1; multiplier <= 9; multiplier++) {
			for (int multiplicand = 2; multiplicand <= 9; multiplicand++)
				System.out.printf("%d×%d=%2d\t", multiplicand, multiplier, multiplicand * multiplier);
			System.out.println();
		}

	}

}
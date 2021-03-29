package verify;

public class Gugudan {

	public static void main(String[] args) {
		
		for (int multiplier = 0; multiplier <= 9; multiplier++) {
			for (int multiplicand = 2; multiplicand <= 9; multiplicand++) {
				if (multiplier == 0) {
					System.out.print("[" + multiplicand + "단]" + "\t");
				} else {
					System.out.print(multiplicand + "×" + multiplier + "=" + multiplicand * multiplier + "\t");
				}
			}
			System.out.println();
		}
		
	}

}
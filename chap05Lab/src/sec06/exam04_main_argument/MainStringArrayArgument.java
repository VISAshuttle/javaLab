package sec06.exam04_main_argument;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("매개변수 2개가 필요합니다.");
			System.exit(0);
		}

		String strNum1 = args[0];
		String strNum2 = args[1];

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);
	}

}

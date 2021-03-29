package sec02.exam02_switch;

public class SwitchcharExample {

	public static void main(String[] args) {
		char grade = 'C';
		
		switch (grade) {
			case 'A':
				System.out.println("A등급 회원");
				break;
			case 'B':
				System.out.println("B등급 회원");
				break;
			case 'C':
				System.out.println("C등급 회원");
				break;
			case 'D':
				System.out.println("D등급 회원");
				break;
			default:
				System.out.println("비회원");
		}
	}

}

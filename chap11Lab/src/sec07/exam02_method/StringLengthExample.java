package sec07.exam02_method;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		int length = ssn.length();
		if (length == 14 && ssn.indexOf("-") != -1) {
			System.out.println("�ֹε�Ϲ�ȣ �����Դϴ�.");
		} else {
			System.out.println("�ֹε�Ϲ�ȣ ������ �ƴմϴ�.");
		}
	}

}

package sec07.exam02_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";

		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		String findStr = "�ڹ�";
		if (subject.indexOf(findStr) != -1) {
			System.out.println(findStr + "�� ���õ� å�Դϴ�.");
		} else {
			System.out.println(findStr + "�� ���þ��� å�Դϴ�.");
		}
	}

}

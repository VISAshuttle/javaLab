package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü���� ���α׷��� ����, ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr); // replace() �޼ҵ�� ���� ��ü�� �������� �ʰ�
		System.out.println(newStr); // ���ο� ���ڿ� ��ü�� ��ȯ�Ѵ�.
	}

}

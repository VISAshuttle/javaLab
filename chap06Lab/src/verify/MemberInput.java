package verify;

import java.util.Scanner;

public class MemberInput {

	private static void fillInfo(Scanner scanner, MemberInfo01 member) {
		System.out.print("이름 입력: ");
		member.setName(scanner.nextLine());
		
		System.out.print("나이 입력: ");
		member.setAge(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("이메일 입력: ");
		member.setEmail(scanner.nextLine());
		
		System.out.print("주소 입력: ");
		member.setAddress(scanner.nextLine());		
	}
	
	public static void main(String[] args) {
		MemberInfo01[] members = new MemberInfo01[5];
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < members.length; i++) {
			MemberInfo01 member = members[i] = new MemberInfo01();
			fillInfo(scanner, member);
			System.out.println(i+1 + "번째 회원의 정보가 등록되었습니다.");
			
			System.out.println();
			System.out.print("그만 등록하시려면 Q를 입력하시고, 계속 등록하시려면 아무 키나 입력하십시오:  ");
			String userResponse = scanner.nextLine();
			if (userResponse.equals(""))		userResponse = "y";
			
			char task = userResponse.charAt(0);
			if (task == 'q' || task == 'Q')	break;
			else								continue;
		}
		
		System.out.println();
		for (MemberInfo01 member : members) {
			if (member != null)
				member.printInfo();
		}
	}

}
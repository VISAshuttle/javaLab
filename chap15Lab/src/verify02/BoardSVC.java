package verify02;

import java.util.ArrayList;
import java.util.Scanner;

// DAO(Data Access Object) Ŭ����

public class BoardSVC {
	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}

	// �� �Է� ó�� �޼ҵ�
	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��ǿ� ���� �ۼ��մϴ�.");
		System.out.print("�ۼ���: ");
		String register = sc.next();
		System.out.print("�̸���: ");
		String email = sc.next();
		System.out.print("��й�ȣ: ");
		String passwd = sc.next();
		System.out.print("����: ");
		String subject = sc.next();
		System.out.print("�۳���: ");
		String content = sc.next();
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		addArticle(boardVO);
	}

	// �� �ۼ�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// �۸�� ���
	public void listArticles(Scanner sc) {
		if (boardList.size() > 0)
			for (BoardVO b : boardList)
				System.out.println(b.toString());
		else
			System.out.println("��ϵ� ���� �����ϴ�.");
	}

	// �� ����
	public void removeArticle(Scanner sc) {
		if (boardList.size() == 0) {
			System.out.println("������ ���� �����ϴ�.");
			return;
		}
		
		System.out.println("������ ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("�ۼ���: ");
		String register = sc.next();
		System.out.print("��й�ȣ: ");
		String passwd = sc.next();
	
		int delCnt = 0;
		for (int i = 0; i < boardList.size(); i++)
			if (boardList.get(i).getRegister().equals(register)	&&
				boardList.get(i).getPasswd().equals(passwd))
			{	boardList.remove(i--); delCnt++;	}
		
		if (delCnt > 0)
			System.out.println(delCnt + "���� ���� �����Ǿ����ϴ�.");
		else
			System.out.println("�ش� �ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
	}
}
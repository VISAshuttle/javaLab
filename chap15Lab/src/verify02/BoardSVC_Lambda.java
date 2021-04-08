package verify02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.*;

// DAO(Data Access Object) Ŭ����

public class BoardSVC_Lambda {
	ArrayList<BoardVO> boardList;

	public BoardSVC_Lambda() {
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
		if (boardList.size() == 0)
		{	System.out.println("������ ���� �����ϴ�."); return;	}
		
		System.out.println("������ ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("�ۼ���: ");
		String register = sc.next();
		System.out.print("��й�ȣ: ");
		String passwd = sc.next();
	
		// ����Ʈ���� ���ǿ� �´� ���� ã�� ��� �ε�����, ã�� ���� ��� -1�� ��ȯ
		ToIntBiFunction<String, String> indexFinder = (reg, pwd) -> {
			int value = -1;
			for (int i = 0; i < boardList.size(); i++)
				if (boardList.get(i).getRegister().equals(reg) &&
					boardList.get(i).getPasswd().equals(pwd))
				{	value = i; break;	}
			return value;
		};
		IntConsumer indexRemover = i -> boardList.remove(i);
		
		int index = 0, delCnt = 0;
		while ((index = indexFinder.applyAsInt(register, passwd)) != -1) {
			indexRemover.accept(index);
			delCnt++;
		}
		if (delCnt > 0)
			System.out.println(delCnt + "���� ���� �����Ǿ����ϴ�.");
		else
			System.out.println("�ش� �ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
	}
}

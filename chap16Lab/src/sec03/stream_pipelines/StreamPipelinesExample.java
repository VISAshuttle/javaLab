package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("�質��", Member.FEMALE, 20),
				new Member("�ſ��", Member.MALE, 45),
				new Member("�ڼ���", Member.FEMALE, 27)
		);
		
		double ageAvg =   list.stream()				// ��Ʈ���� �����Ͽ�
			.filter(m -> m.getSex()==Member.MALE)	// ���͸� �����ϰ�
			.mapToInt(Member :: getAge)				// getAge() ��ȯ������
			.average()								// ����� ���ϰ�
			.getAsDouble();							// double������ ��ȯ
		
		System.out.println("���� ��� ����: " + ageAvg);
	}
}



package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27)
		);
		
		double ageAvg =   list.stream()				// 스트림을 생성하여
			.filter(m -> m.getSex()==Member.MALE)	// 필터를 적용하고
			.mapToInt(Member :: getAge)				// getAge() 반환값으로
			.average()								// 평균을 구하고
			.getAsDouble();							// double형으로 변환
		
		System.out.println("남자 평균 나이: " + ageAvg);
	}
}



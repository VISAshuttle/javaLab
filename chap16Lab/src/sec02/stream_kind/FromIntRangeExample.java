package sec02.stream_kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;
	
	public static void method(int a) {
		sum += a;
	}
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1,  100);
//		stream.forEach(a -> sum += a);
		stream.forEach(FromIntRangeExample :: method); // 메소드 참조 방식으로 구현해봤음
		System.out.println("총합: " + sum);
	}
}

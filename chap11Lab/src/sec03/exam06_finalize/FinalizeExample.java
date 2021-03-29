package sec03.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		
		for (int i = 0; i <= 50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc(); // Garbage Collector 강제로 실행
		}
	}

}

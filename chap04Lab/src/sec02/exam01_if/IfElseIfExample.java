package sec02.exam01_if;

public class IfElseIfExample {

	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("점수 100~90 구간");
		}
		else if (score >= 80) {
			System.out.println("점수 80~89 구간");
		}
		else if (score >= 70) {
			System.out.println("점수 70~79 구간");			
		}
		else {
			System.out.println("점수 70미만");
		}
	}

}

package verify;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[][] score = { { 85, 60, 70 },
						 { 90, 95, 80 },
						 { 75, 80, 100 },
						 { 80, 70, 95 },
						 { 100, 65, 80 }
		};
		int[] subjectTotal = new int[3]; // 과목별 총점 저장
		int[] studentTotal = new int[5]; // 학생별 총점 저장
		String[] subjectName = { "국어", "영어", "수학" };
		String[] studentName = { "1번학생", "2번학생", "3번학생", "4번학생", "5번학생" };
		
		System.out.printf("[과목별 총점 구하기]\n");
		int subjectIndex;
		for (int[] depth1 : score) {
			subjectIndex = 0;
			for (int depth2 : depth1) {
				subjectTotal[subjectIndex++] += depth2;
			}
		}
		
//		int i = 0;
//		for (int num : subjectTotal) {
//			System.out.println(subjectName[i] + " 총점: " + num);
//			i++;
//		}
		
		for (int i = 0; i < subjectName.length; i++)
			System.out.printf("%s 총점: %d점\n", subjectName[i], subjectTotal[i]);
		
		System.out.println();
		
		System.out.printf("[학생별 총점 구하기]\n");
		int studentIndex = 0;
		for (int[] depth1 : score) {
			for (int depth2 : depth1) {
				studentTotal[studentIndex] += depth2;
			}
			studentIndex++;
		}
		
//		int i = 0;
//		for (int num : studentTotal) {
//			System.out.println(studentName[i] + " 총점: " + num);
//			i++;
//		}
		
		for (int i = 0; i < studentName.length; i++)
			System.out.printf("%s 총점: %d점\n", studentName[i], studentTotal[i]);
		
		System.out.println();

	}

}

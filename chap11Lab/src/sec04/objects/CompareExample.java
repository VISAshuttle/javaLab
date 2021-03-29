package sec04.objects;

import java.util.Comparator;
import java.util.Objects;

class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result;
		result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println("result: " + result);
		
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println("result: " + result);
	}
	
	// 정적 멤버 클래스
	static class Student {
		int s_no;
		
		Student(int s_no) {
			this.s_no = s_no;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {
		@Override
		public int compare(Student a, Student b) {
			return Integer.compare(a.s_no, b.s_no);
		}
	}

}

package sec04.exam01_hashmap;

public class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (this.sno == student.sno) && (this.name.equals(student.name));
		} else {
			return false;
		}
	}

	public int hashCode() {
		return sno + name.hashCode();
	}
}

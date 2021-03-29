package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("010101-0101010", "강감찬");
		
		System.out.printf("nation:\t%s\n"
				+ "ssn:\t%s\n"
				+ "name:\t%s\n",
				p1.nation, p1.ssn, p1.name);
		
//		p1.nation = "USA"; // The final field Person.nation cannot be assigned
//		p1.ssn = "111111-1111111"; // The final field Person.ssn cannot be assigned
		p1.name = "을지문덕";
	}

}

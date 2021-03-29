package verify;

public class MemberInfo01 {

	private String name;
	private int age;
	private String email;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printInfo() {
		System.out.println("[" + getName() + " 회원님의 정보]");
		System.out.println("나이: " + getAge() + "세");
		System.out.println("이메일: " + getEmail());
		System.out.println("주소: " + getAddress());
		System.out.println();
	}

}
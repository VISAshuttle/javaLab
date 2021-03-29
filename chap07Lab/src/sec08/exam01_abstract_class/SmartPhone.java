package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	

}

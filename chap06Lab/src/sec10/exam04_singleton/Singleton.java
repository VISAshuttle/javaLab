package sec10.exam04_singleton;

// 싱글톤 패턴
public class Singleton {
	// 생성자를 private 접근제한자로 설정하여, 외부 클래스에서 객체를 생성하지 못하도록 함
	private Singleton() {
		
	}
	
	// 자기 자신 타입의 필드에 객체를 생성하여 대입시키고, private static으로 설정
	private static Singleton singleton = new Singleton();
	
	// 자기 자신 객체가 할당된 필드를 반환하는 getInstance() 메소드 정의
	public static Singleton getInstance() {
		return singleton;
	}
}

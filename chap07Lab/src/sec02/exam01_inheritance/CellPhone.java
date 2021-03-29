package sec02.exam01_inheritance;

public class CellPhone {
	String model;
	String color;

	void powerOn() {
		System.out.println("전원ON");
	}

	void powerOff() {
		System.out.println("전원OFF");
	}

	void ring() {
		System.out.println("♪♪♪전화왔다♪♪♪");
	}

	void sendVoice(String message) {
		System.out.println("본인: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}

package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone phone1 = new DmbCellPhone("SKY IM-100", "Silver", 11);
		
		System.out.println("모델: " + phone1.model);
		System.out.println("색상: " + phone1.color);
		phone1.turnOnDmb();
		phone1.changeChannelDmb(23);
		
		phone1.powerOn();
		phone1.ring();
		phone1.sendVoice("여보시요");
		phone1.receiveVoice("네 누구세요");
		phone1.sendVoice("돈 잠 빌려주소");
		phone1.hangUp();
	}

}

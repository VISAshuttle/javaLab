package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("ch." + channel + " DMB 수신 시작.");
	}
	
	void changeChannelDmb(int channel) {
		System.out.print("ch." + this.channel);
		this.channel = channel;
		System.out.println(" -> ch." + this.channel);
	}
}

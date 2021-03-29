package sec08.exam02_return;

public class Car {
	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean gasState() {
		if (gas == 0) {
			System.out.println("가스가 오링남...");
			return false;
		} else {
			System.out.println("가스가 남아있네요.");
			return true;
		}
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.printf("달립니다... (가스잔량: %d)\n", --gas);
			} else {
				System.out.println("가스 오링... 멈춥니다.");
				return;
			}
		}
	}
}

package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 남은 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("[경고] " + location + " HankookTire 펑크남");
			return false;
		}
	}
}

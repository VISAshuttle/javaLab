package sec03.exam02_hashcode;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			return (this.number == compareKey.number) ? true : false;
		}
		else {
			return false;
		}
	}
}
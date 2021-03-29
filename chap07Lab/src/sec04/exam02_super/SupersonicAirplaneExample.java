package sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane concorde = new SupersonicAirplane();
		
		concorde.takeOff();
		concorde.fly();
		concorde.flyMode = SupersonicAirplane.SUPERSONIC;
		concorde.fly();
		concorde.flyMode = SupersonicAirplane.NORMAL;
		concorde.fly();
		concorde.land();
	}

}

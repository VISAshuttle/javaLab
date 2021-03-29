package sec11.exam02_static_final;

public class Earth {
	// 상수(constant)
	static final double EARTH_RADIUS = 6371;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * Math.pow(EARTH_RADIUS, 2);
	}
}

package sec10.exam02_static_block;

public class Television {
	static String company = "GoldStar";
	static String panel = "CRT";
	static String info;
	
	static {
		info = company + "-" + panel;
	}
}

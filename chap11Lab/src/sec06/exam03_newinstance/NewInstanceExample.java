package sec06.exam03_newinstance;

public class NewInstanceExample {
	
	public static void main(String[] args) {
		try {
//			Class clazz = Class.forName("sec06.exam03_newinstance.SendAction");
			Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
//			Class clazz = Class.forName(args[0]);
			Action act = (Action) clazz.newInstance(); // SendAction 구현객체 생성
			act.execute();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
}

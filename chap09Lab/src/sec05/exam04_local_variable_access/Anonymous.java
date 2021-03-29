package sec05.exam04_local_variable_access;

public class Anonymous {
	private int field;
	
	public void method(int arg1, int arg2) {
		int var1 = 0, var2 = 0;
		
		this.field = 10;
		
		// 익명 객체에서 사용하는 변수는 final이어야 한다.
		// Local variable XXX defined in an enclosing scope must be final or effectively final
//		arg1 = 20;
//		var1 = 20;
		
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
			
		};
	}
}	

package sec05.exam04_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제명: " + osName);
		System.out.println("유저명: " + userName);
		System.out.println("유저 홈디렉토리: " + userHome);
		System.out.println("===============================");
		
		// map 자료구조: { Key : Value }
		// 예: Properties { String : String }
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("key: \t[" + key + "]");
			System.out.println("value: \t" + value);
			System.out.println();
		}
	}

}

package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		String[] splited = str.split(",");
		for (String element : splited) {
			System.out.println(element);
		}

		System.out.println();

		StringTokenizer strTkn = new StringTokenizer(str, ",");
		while (strTkn.hasMoreTokens()) {
			System.out.println(strTkn.nextToken());
		}
	}

}

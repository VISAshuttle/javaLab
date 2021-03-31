package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] original = {'J','A','V','A'};
		
		// 방법1: Arrays.copyOf()
		char[] arr1 = Arrays.copyOf(original, original.length);
		System.out.println(arr1);
		
		// 방법2: Arrays.copyOfRange()
		char[] arr2 = Arrays.copyOfRange(original, 1, 3);
		System.out.println(arr2);
		
		// 방법3: System.arraycopy()
		char[] arr3 = new char[original.length];
		System.arraycopy(original, 0, arr3, 0, original.length);
		for (int i = 0; i < arr3.length; i++)
			System.out.println("arr3[" + i + "] = " + arr3[i]);
	}

}

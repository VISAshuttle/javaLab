package sec06.exam02_array_bynew;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int arraySize = 3;
		int[] arr1 = new int[arraySize];
		for (int i = 0; i < arr1.length; i++)
			System.out.printf("arr1[%d]=%d\n", i, arr1[i]);
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < arr1.length; i++)
			System.out.printf("arr1[%d]=%d\n", i, arr1[i]);
		
		System.out.println();
		
		String[] arr2 = new String[arraySize];
		for (int i = 0; i < arr2.length; i++)
			System.out.printf("arr2[%s]=%s\n", i, arr2[i]);
		arr2[0] = "1월";
		arr2[1] = "2월";
		arr2[2] = "3월";
		for (int i = 0; i < arr2.length; i++)
			System.out.printf("arr2[%s]=%s\n", i, arr2[i]);
	}

}

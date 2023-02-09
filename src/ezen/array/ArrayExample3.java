package ezen.array;

/**
 * 배열 선언, 생성, 사용하기
 * 
 * @author 김현아
 */
public class ArrayExample3 {

	public static void main(String[] args) {
		int[] array = { 99, 78, 90, 100, 75 };
		
		int[] copyArray = ArrayUtil.copyArray(array, 5);
		for (int i = 0; i < copyArray.length; i++) {
			System.out.print(copyArray[i]+ "\t");
		}
		
		System.out.println();
		
		ArrayUtil.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ "\t");
		}
	}
	
}

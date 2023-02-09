package ezen.array;

/**
 * 배열과 관련된 공통 기능 정의
 * 
 * @author 김현아 2022. 12. 29.
 */
public class ArrayUtil {

	// 배열 복사
	public static int[] copyArray(int[] srcArray, int increament) {
		int[] copidArray = new int[srcArray.length + increament];
		for (int i = 0; i < srcArray.length; i++) {
			copidArray[i] = srcArray[i];
		}
		return copidArray;
	}

	// 배열 정렬
	public static void sort(int[] srcArray) {
		for (int i = 0; i < srcArray.length; i++) {
			for (int j = 0; j < srcArray.length - 1; j++) {
				int temp = 0;
				if (srcArray[j] > srcArray[j + 1]) {
					temp = srcArray[j];
					srcArray[j] = srcArray[j + 1];
					srcArray[j + 1] = temp;
				}
			}

		}

	}

}

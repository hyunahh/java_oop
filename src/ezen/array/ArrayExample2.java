package ezen.array;

/**
 * 배열 선언, 생성, 사용하기
 * 
 * @author 김현아
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		int[] array = { 99, 78, 90, 100, 75 };

		// 배열 복사
		int[] array2 = new int[10];

		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "\t");
		}

		System.out.println();

		// misson: 오름차순 정렬
		// 구현하세요
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				int temp = 0;
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}

package ezen.array;

/**
 * 다차원 배열 선언, 생성, 사용하기
 * 
 * @author 김현아
 */
public class ArrayExample5 {

	public static void main(String[] args) {
//		int[][] array;
//		array = new int[2][5];
//		array[0][0] = 88;
//		array[0][1] = 98;
//		array[0][2] = 75;
//		array[0][3] = 100;
//		array[0][4] = 100;
//		array[1][0] = 50;
//		array[1][4] = 100;

//		int[][] array = new int[][] {
//									{ 88, 98, 75, 100, 100 }, 
//									{ 50, 60, 70, 80, 90 } 
//									};		
		int[][] array = { { 88, 98, 75, 100, 100 }, { 50, 60, 70, 80, 90 } };

		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "반 성적");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0) {
					sum1 += array[i][j];
				} else {
					sum2 += array[i][j];
				}
			}
		}
		double avg1 = (double) sum1 / array[0].length;
		double avg2 = (double) sum2 / array[1].length;
		double totalAvg = (double) (sum1 + sum2) / (array[0].length + array[0].length);

		System.out.println("총점: " + sum1 + ",평균:" + avg1);
		System.out.println("총점: " + sum2 + ",평균:" + avg2);
		System.out.println("전체총점:" + (sum1 + sum2) + ",평균:" + totalAvg);
	}
}

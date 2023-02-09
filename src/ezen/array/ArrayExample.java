package ezen.array;

/**
 * 배열 선언, 생성, 사용하기
 * 
 * @author 김현아
 */
public class ArrayExample {

	public static void main(String[] args) {
		int score1, score2, score3, score4, score5;
		score1 = 95;
		score2 = 88;
		score3 = 100;
		score4 = 75;
		score5 = 98;

		int sum = score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;

		int average = sum / 5;

		System.out.println("평균: " + average);

		// 배열 선언
//		int[] scores;
//		int scores[];
		// 배열 생성
//		scores = new int[5];
		// 배열 요소 접근
//		scores[0] = 95;
//		scores[1] = 88;
//		scores[2] = 90;
//		scores[3] = 100;
//		scores[4] = 75;

		// 선언, 생성, 초기화 동시에
//		int[] scores = new int[] {95, 88, 90, 100, 75};
		int[] scores = { 95, 88, 90, 100, 75 };
		System.out.println(scores.length);
		sum = 0;
		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
			sum += scores[i];
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + sum / 5);

	}

}

package ezen.array;

/**
 * 배열 선언, 생성, 사용하기
 * 
 * @author 김현아
 */
public class ArrayExample4 {

	public static void main(String[] args) {
		// 6개의 로또번호 임의 생성 및 배열에 저장
		int[] lottos = new int[6];

		for (int i = 0; i < lottos.length; i++) {
			int random = (int) (Math.random() * 45) + 1; // 0.0 <= value <1.0
			lottos[i] = random;

			// for문을 통해 중복체크
			for (int j = 0; j < i; j++) {
				if (lottos[j] == lottos[i]) {
					i--;
				}
			}
		}

		ArrayUtil.sort(lottos);
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + "\t");
		}
	}

}

package ezen.array;

/**
 * 명령행 인자 처리하기
 * @author 김현아
 * 2023. 1. 3.
 * java MyApplication some1.txt some2.txt
 */
public class MyApplication {

	public static void main(String[] args) {
		String fileName1, fileName2 = null;
		if(args.length!=2) {
			System.out.println("Usage: java MyApplication <전달인자1> <전달인자2>");
			return;
		}
		
		fileName1 =  args[0];
		fileName2 =  args[1];
		System.out.println("전달된 파일이름:" + fileName1);
		System.out.println("전달된 파일이름:" + fileName2);

	}

}

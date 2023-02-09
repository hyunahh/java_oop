package ezen.array;

import java.util.Scanner;

import oop.Account;

/**
 * @author 김현아
 * @date 2023. 1. 2. 배열을 이용한 은행 계좌 목록 관리
 */
public class ArrayExample7 {

	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		int index = 0;

		// 계좌 개설
		Account account1 = new Account("1111-2222", "김현아", 1111, 100000);

		// 배열에 계좌 등록
		accounts[index++] = account1;
		accounts[index++] = new Account("2222-3333", "홍길동", 1111, 10000); // 바로 생성
		accounts[index++] = new Account("3333-4444", "김철수", 1111, 10000);

		// 등록된 모든 계좌정보 출력
		for (int i = 0; i < index; i++) {
			Account acc = accounts[i];
			System.out.println(acc.toString());
		}
		System.out.println("-----------계좌 검색 테스트-----------");
		
		// 계좌번호로 계좌 검색
//		String searchNum = "1111-2222";
		String searchNum = null;
		
		System.out.println("검색하고자 하는 계좌번호: ");
		Scanner scanner = new Scanner(System.in);
		searchNum = scanner.nextLine();
		
		for (int i = 0; i < index; i++) {
			String number = accounts[i].getAccountNumber();
//			if (searchNum == number) { //==는 주소값비교 
			if (searchNum.equals(number)) { 
				System.out.println(accounts[i].toString());
			} 
		}
	}

}

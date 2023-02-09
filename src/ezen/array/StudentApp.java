package ezen.array;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {

		String name = null;
		int[] jumsu = new int[4];
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력: ");
		name = scanner.nextLine();

		System.out.println("점수 입력: ");
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = scanner.nextInt();
		}

		Student student = new Student(name, jumsu);
		System.out.println("이름: " + student.getName());
		System.out.println("총점: " + student.getSum());
		System.out.println("평균: " + student.getAvg());
	}

}

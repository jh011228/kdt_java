package review;

import java.util.Scanner;

public class Day05_2 {
	public static void main(String[] args) {
		// nextInt 사용 금지
		// 만나이, 내년나이 계산기
//				1) 입력클래스 import
//				2) 이름 : 출력
//				3) 이름 입력
//				4) 나이 : 출력
//				5) 나이 입력
//				)+ 나이 int로 강제형변환
//				)+ 나이 계산 변수 생성
//				6) 내년 나이 출력
//				7) 만 나이 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		String age = sc.next();
		int ageReal = Integer.parseInt(age);
		int ageM = ageReal - 1;
		int ageN = ageReal + 1;
		System.out.println(name + "님의 내년 나이는 " + ageN + "살입니다.");
		System.out.println("만 나이는 " + ageM + "살입니다.");
		sc.close();
	}
}

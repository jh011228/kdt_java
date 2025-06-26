package review;

import java.util.Scanner;

public class Day05_1 {// 클래스 중괄호 시작 영역
	public static void main(String[] args) {// main 중괄호 시작 영역
//	1) 입력클래스 import
//	2) 물건 값 출력
//	3) 물건 값 입력
//	4) 지불금액 출력
//	5) 지불금액 입력
//	)+ 거스름돈 계산 변수 생성
//	6) 거스름돈 출력
//	7) 1000원 거스름돈 출력
//	8) 500원 거스름돈 출력
//	9) 100원 거스름돈 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값 : ");
		int price = sc.nextInt();
		System.out.print("지불금액 : ");
		int pay = sc.nextInt();
		int change = pay - price;
		int changeH = change / 1000;
		int changeF = change % 1000 / 500;
		int changeO = change % 1000 % 500 / 100;
		System.out.println("거스름돈은 " + change + "원입니다.");
		System.out.println("1000원 : " + changeH + "개");
		System.out.println("500원 : " + changeF + "개");
		System.out.println("100원 : " + changeO + "개");
		sc.close();
	}// main 중괄호 끝 영역
}// 클래스 중괄호 끝 영역

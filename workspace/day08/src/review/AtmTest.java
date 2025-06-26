package review;

import java.util.Scanner;

public class AtmTest {
	public static void main(String[] args) {
//6. ATM 메뉴에서 입금, 출금, 잔액조회 하기
//[조건]
//초기 잔액은 10000원
//메뉴 선택에 따라 작업 수행
//종료 시 프로그램 종료
//숫자(번호)로 입력받기
//
//그 외의 번호 입력시 다시 선택하세요 출력 후 메뉴 보이기
//해당 번호 선택시 메세지만 출력
		// 1) 입력 클래스 import
		// 2) 정수형 변수 choice, 정수형 상수 MONEY, 문자열 메시지 변수
		// 3) 반복문(while문 true)
		// 3-1) 입력메시지 출력
		// 3-2) choice 입력메소드 nextInt()
		// 4) switch문
		// 4-1) case 1
		// 4-1-1) 잔액조회 출력
		// 4-1-2) break;
		// 4-2) case 2
		// 4-2-1) 입금 출력
		// 4-3) case 3
		// 4-3-1) 출금 출력
		// 4-4) case 4
		// 4-4-1) 종료 출력
		// 4-4-2) sc.close();
		// 4-4-2) return;
		// 4-5) default:
		// 4-5-1) 다시선택 출력
		// 4-5-2) break;
		int deposit =0, withdraw = 0;
		int money = 10000;
		String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요 : " + "\n1. 잔액 조회" + "\n2. 입금" + "\n3. 출금" + "\n4. 종료" + "\n선택 : ";
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.print(msg);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("잔액 조회합니다 현재 잔액은 " + money + "원입니다");
				break;
			case 2:
				System.out.println("얼마를 입금하시겠습니까?");
				deposit = sc.nextInt();
				if(deposit>0) {
					money +=deposit;
					System.out.println("입금합니다");					
				}
				else {
					System.out.println("0원 혹은 -는 입금 불가입니다.");
				}
				break;
			case 3:
				System.out.println("얼마를 출금하시겠습니까? 현재 잔액 : "+money );
				withdraw = sc.nextInt();
				if(money-withdraw<0) {
					System.out.println("잔액이 부족합니다");
				}
				else {
					money -= withdraw;
					System.out.println("출금합니다");					
				}
				break;
			case 4:
				System.out.println("종료합니다");
				sc.close();
				return;

			default:
				System.out.println("다시 선택하세요");
				break;
			}
		} while (choice != 4);

	}

}

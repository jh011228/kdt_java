package homework07;

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
		int money = 10000;
		String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요 : " + "\n1. 잔액 조회" + "\n2. 입금" + "\n3. 출금" + "\n4. 종료" + "\n선택 : ";
		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.print(msg);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("잔액 조회합니다 현재 잔액은 " + money + "원입니다");
				continue;
			case 2:
				System.out.println("입금합니다");
				continue;
			case 3:
				System.out.println("출금합니다");
				continue;
			case 4:
				System.out.println("종료합니다");
				break;

			default:
				System.out.println("다시 선택하세요");
				continue;
			}
			break;
		}
		sc.close();

	}

}

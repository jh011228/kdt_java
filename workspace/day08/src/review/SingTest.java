package review;

import java.util.Scanner;

public class SingTest {
	public static void main(String[] args) {
//while, 곡당 가격, 0 입력시 프로그램 종료 입력받은 값으로 부를 수 있는 곡 수와 잔돈 출력
		// 7번 SingTest
//		보너스 : 5곡당 1곡 보너스 (예: 5곡 → 6곡, 10곡 → 12곡)
		// 1) 입력클래스 import
		Scanner sc = new Scanner(System.in);
		final int PRICE_DRINK = 100;
		int money = 0, song = 0, change = 0, drinkSong = 0, drinkChange = 0, bonus = 0;
		System.out.print("곡 당 가격 입력 : ");
		int price = sc.nextInt();
		while (true) {
			// 3) 입력 메시지 출력
			System.out.print("금액 입력(0 입력시 종료) : ");
			// 4) 금액입력 = 금액 입력 nextInt()
			money = sc.nextInt();
			if (money == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(money<price){
				System.out.println("금액이 곡 보다 부족합니다 다시 입력을 시작합니다");
				continue;
			}
			// 5) 노래곡수 = 금액 / 상수1
			song = money / price;
			// 6) 잔돈 = 금액 % 상수1
			change = money % price;
			drinkSong = song - 1;
			System.out.println(song + "곡을 부를 수 있으며 잔돈은 " + change + "원입니다.");
			// +) if 음료금액보다 잔액이 크거나 같을 경우
			if (change >= PRICE_DRINK) {
				System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원 입니다.\n", song, change - PRICE_DRINK);
			}
			else if (song > 0 && (money - (drinkSong * price)) >= PRICE_DRINK) {
				// 10) 음료마실경우 잔돈 = 금액 - (음료마실경우노래곡수 * 노래가격 + 음료금액)
				drinkChange = money - (drinkSong * price + PRICE_DRINK);
				System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원입니다\n", drinkSong, drinkChange);
				
			}
			else {
				System.out.println("금액이 부족합니다.");
			}
			System.out.print("음료를 구매하시겠습니까? (YES/NO) : ");
			String yon = sc.next();
			if (yon.equals("YES")) {
				System.out.println("음료를 구매하셨습니다.");
			}
			else {
				System.out.println("음료를 구매하지 않았습니다.");
			}
			
		}

	}
}

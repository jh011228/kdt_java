package gameTask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 캐릭터를 선택하게 하고 1. 마법사, 2. 전사, 3.로그
//		선택한 캐릭터로 반복적으로 메뉴 실행 -> while
//		1. 기본공격, 2. 스킬공격, 3.특수공격, 4.종료
		Wizard wizard = new Wizard();
		Warrior warrior = new Warrior();
		int attack;
		System.out.println("캐릭터를 선택하세요 : 1. 마법사, 2. 전사, 3.로그");
		int job = sc.nextInt();
//		Rogue rogue = new Rogue();
		while (true) {
			switch (job) {
			case 1:
				System.out.println("1. 기본공격, 2. 스킬공격, 3.특수공격, 4.종료");
				attack = sc.nextInt();
				if (attack == 4) {
					System.out.println("종료합니다");
					return;
				}
				switch (attack) {
				case 1:
					wizard.normalAttack();
					continue;
				case 2:
					wizard.skillAttack();
					continue;
				case 3:
					wizard.specialAttack();
					continue;
				case 4:
					continue;
				default:
					System.out.println("잘못된 입력입니다 다시 돌아갑니다");
					continue;
				}
			case 2:
				if (warrior.hp <= 0) {
					warrior.revive();
				}
				System.out.println("1. 기본공격, 2. 스킬공격, 3.특수공격, 4.종료");
				attack = sc.nextInt();
				if (attack == 4) {
					System.out.println("종료합니다");
					return;
				}
				switch (attack) {
				case 1:
					warrior.normalAttack();
					continue;
				case 2:
					warrior.skillAttack();
					continue;
				case 3:
					warrior.specialAttack();
					continue;
				case 4:
					continue;
				default:
					System.out.println("잘못된 입력입니다 다시 돌아갑니다");
					continue;
				}

			default:
				throw new IllegalArgumentException("Unexpected value: " + job);
			}

		}
	}
}

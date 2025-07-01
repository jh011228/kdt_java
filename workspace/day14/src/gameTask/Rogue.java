package gameTask;

import java.util.Random;

public class Rogue extends Character {
	// 로그, 20 , 20 , 3, 20 , 0 전달
	// normalAttack 오버라이딩 : mp 3 소모, 부족하면 실패
	// 정수형 배열 필드 이용
	int[] randomDmg = { 20, 30, 40, 50, 60, 70, 80, 90, 100 };

	public Rogue() {
		super("로그", 20, 20, 3, 20, 0);
	}

	@Override
	public void normalAttack() {
		if (mp < 3) {
			System.out.println("mp가 부족합니다");
			return;
		}
		mp -= 3;
		super.normalAttack();
	}

//	skillAttack 오버라이딩 : mp 2 소모 + hp 5 소모, 부족하면 실패

	@Override
	public void skillAttack() {
		System.out.println(name + "이(가) 스킬공격을 실행했습니다.");
		System.out.println("적에게 " + skillDmg + " 만큼 피해를 입혔습니다.");
		if (mp > 2 && hp > 5) {
			System.out.println("mp가 2, hp가 5 감소했습니다.");
			mp -= 2;
			hp -= 5;
		} else {
			System.out.println("실패했습니다");
		}
//		showStatus();
	}

//	specialAttack() 오버라이딩 : 20~100사이의 무작위 피해량 출력(Random 사용)
	@Override
	public void specialAttack() {
		Random r = new Random();
		int rd = r.nextInt(9);
		System.out.println(name + "이(가) 특수공격을 실행했습니다.");
		specialDmg = randomDmg[rd];
		System.out.println("적에게 " + randomDmg[rd] + "만큼 피해를 입혔습니다");
//		showStatus();
	}

}

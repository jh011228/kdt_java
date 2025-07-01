package gameTask;

public class Warrior extends Character {

	// 전사 , 30 , 10, 5, 15, 100 전달
	// skillAttack 오버라이딩 : mp 가 3보다 부족하면 실패, 아니면 mp 3 소모
	// specialAttack 오버라이딩 : 피해출력 + 체력 10 감소 + 부활 검사
	// onlyWarrior 메소드 : 전사만 사용할 수 있는 고유 행동입니다 출력

	public Warrior() {
		super("전사", 30, 10, 5, 15, 100);
	}

	@Override
	public void skillAttack() {
		if (mp < 3) {
			System.out.println("mp가 부족합니다.");
			return;
		}
		System.out.println(name + "이(가) 스킬공격을 실행했습니다.");
		System.out.println("적에게 " + skillDmg + " 만큼 피해를 입혔습니다.");
		System.out.println("mp가 3 감소했습니다.");
		mp -=3;
//		showStatus();
	}

	@Override
	public void specialAttack() {
		System.out.println(name + "이(가) 특수공격을 실행했습니다");
		System.out.println("적에게 " + specialDmg + " 만큼 피해를 입혔습니다.");
		System.out.println("체력이 10 감소했습니다.");
		hp -= 10;
		if(hp<=0) {
			revive();
		}
//		showStatus();
	}
}

package gameTask;

public class Monster extends Character {

	public Monster(String name, int maxHp, int maxMp, int nomalDmg, int skillDmg, int specialDmg) {
		super(name, maxHp, maxMp, nomalDmg, skillDmg, specialDmg);
	}

	// 메소드 - 몬스터 일반공격, 몬스터 스킬공격, 몬스터 스페셜공격
	@Override
	public void normalAttack() {
		showStatus();
		System.err.println(name + "이(가) 기본공격을 실행했습니다.");
		System.err.println("나에게 " + nomalDmg + " 만큼 피해를 입혔습니다.");
	}

	@Override
	public void skillAttack() {
//		showStatus();
		System.err.println(name + "이(가) 스킬공격을 실행했습니다.");
		System.err.println("나에게 " + skillDmg + " 만큼 피해를 입혔습니다.");
		System.err.println("mp가 1 감소했습니다.");
		mp -= 1;
	}

	@Override
	public void specialAttack() {
//		showStatus();
		System.err.println(name + "이(가) 특수공격을 실행했습니다.");
		System.err.println("나에게 " +specialDmg + " 만큼 피해를 입혔습니다.");
	}

	@Override
	public void showStatus() {
		System.err.println("--- "+name+" 상태 ---");
		System.err.println("Hp : " + hp + "/" + maxHp);
		System.err.println("Mp : " + mp + "/" + maxMp);
	}

}

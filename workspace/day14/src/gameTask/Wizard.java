package gameTask;

public class Wizard extends Character{
	//노말어택 오버라이딩 : 체력 2 감소후 공격 실행
//		스킬어택 오버라이딩 mp가 부족하면 출력 후 실패
//	specialAttack 오버라이딩 : 마법사는 특수공격이 없습니다 출력
	public Wizard() {
		super("마법사", 15, 30, 1, 30, 0);
	}

	@Override
	public void normalAttack() {
		  if(hp>0) {
			  hp -=2;
			  super.normalAttack();			  
		  }
		  else {
			  revive();
		  }
		 }

	@Override
	public void skillAttack() {
		if(mp<=0) {
			System.out.println("mp가 부족합니다.");
			showStatus();
			return;
		}
		super.skillAttack();
	}

	@Override
	public void specialAttack() {
		 System.out.println(name+"는 특수공격이 정의되어 있지 않습니다.");
	}
	
	
}

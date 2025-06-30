package gameTask;

public class Rogue extends Character {
	//로그, 20 , 20 , 3, 20 , 0 전달
	//normalAttack 오버라이딩 : mp 3 소모, 부족하면 실패
//	skillAttack 오버라이딩 : mp 2 소모 + hp 5 소모, 부족하면 실패
//	specialAttack() 오버라이딩 : 20~100사이의 무작위 피해량 출력(Random 사용)
	//정수형 배열 필드 이용
	int[] randomDmg = {20,30,40,50,60,70,80,90,100};

	public Rogue() {
		super("로그", 20, 20, 3, 20, 0);
	}

	@Override
	public void normalAttack() {
		if(mp<3) {
			System.out.println("mp가 부족합니다");
			return;
		}
		mp -= -3;
		super.normalAttack();
	}

	
	@Override
	public void skillAttack() {
		super.skillAttack();
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		super.specialAttack();
	}
	
}

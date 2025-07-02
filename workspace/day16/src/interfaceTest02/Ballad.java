package interfaceTest02;

public class Ballad implements Music {
	// 발라드 클래스
	// "발라드 모드"를 출력하는 mode 구현
	// "오직 발라드만 실행" 출력하는 onlyBallard 메소드 만들기
	@Override
	public void mode() {
		System.out.println("발라드 모드");
	}
	void onlyBallard() {
		System.out.println("오직 발라드만 실행");
	}

}

package interfaceTest02;

public class Main {
	public static void main(String[] args) {
		//Music 인터페이스를 만들고 각 메소드를 호출하기
		
		//음악 재생 프로그램
		//부모는 Music 인터페이스
		//구현되지 않은 mode 메소드 만들기
		
		//자식 클래스 Ballad, Hiphop, Rock 클래스
		//발라드 클래스
		// "발라드 모드"를 출력하는 mode 구현
		// "오직 발라드만 실행" 출력하는 onlyBallard 메소드 만들기
		
		//힙합 클래스
		// "힙합 모드"를 출력하는 mode 구현
		// "오직 힙합만 실행" 출력하는 onlyHiphop 메소드 만들기
	
		//락 클래스
		// "락 모드"를 출력하는 mode 구현
		// "오직 락만 실행" 출력하는 onlyRock 메소드 만들기
		
		//참조변수를 따로 만들지 않고
		//매개변수의 다형성을 활용하여 모든 클래스 타입의 메소드 호출하기
		
		check(new Ballad());
		check(new Hiphop());
		check(new Rock());
		
		
	}
	
	// check 메소드 static 메소드, 매개변수 o 	리턴값 x
	static void check(Music m) {
		if(m instanceof Ballad) {
			m.mode();
			((Ballad)m).onlyBallard();
		}else if(m instanceof Hiphop){
			m.mode();
			((Hiphop)m).onlyHiphop();;
		}else if(m instanceof Rock) {
			m.mode();
			((Rock)m).onlyRock();
		}
	}
	
	
}

package review;

public class Animal {
	//필드
	String name;//동물이름
	int age;//동물나이
	String species;//동물 종
	//메소드
//	동물이 먹이를 먹는 메소드, 매개변수 1개
	// => 동물이름이 00을 먹습니다.
	
	// 동물이름이 잠을 잡니다 출력하는 메소드
	
	// 동물 생일 축하 메소드
	// => 동물이름의 나이를 축하합니다 출력
	// 1) 리턴타입 => void
	// 2) 메소드명 =>eatFood
	// 3) 매개변수 => String feed
	// 4) 실행할문장 =>System.out.println(name+"가 "+feed+"를 먹습니다.");
	void eatFeed(String feed) {
		System.out.println(name+"가 "+feed+"를 먹습니다.");
	}
	// 1) 리턴타입 => void
	// 2) 메소드명 =>sleep
	// 3) 매개변수 => x
	// 4) 실행할문장 =>System.out.println(name+"가 잠을 잡니다.");
	void sleep() {
		System.out.println(name+"가 잠을 잡니다.");
	}
	// 1) 리턴타입 => void
	// 2) 메소드명 =>hbd
	// 3) 매개변수 => x
	// 4) 실행할문장 =>System.out.println(name+"의 "+age+"를 축하합니다.");
	void hbd() {
		System.out.println(name+"의 "+age+"살 생일을 축하합니다.");
	}
}

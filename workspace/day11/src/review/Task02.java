package review;

public class Task02 {
	public static void main(String[] args) {
	
		Animal animal = new Animal();
		animal.name="소";
		animal.age=8;
		animal.species="한우";
//		동물이 먹이를 먹는 메소드, 매개변수 1개
		animal.eatFeed("사료");
		// 동물이름이 잠을 잡니다 출력하는 메소드
		animal.sleep();
		// 동물 생일 축하 메소드
		animal.hbd();
		
	}
}

package anoymousTest;
//2번 : 익명클래스 이용한 객체화
public class AnimalMain {
	public static void main(String[] args) {
			
			Animal cat = new Animal() {
				
				@Override
				public void speak() {
					System.out.println("야옹");
				}//내부 클래스의 메소드 중괄호 끝
			}; // 내부클래스 중괄호 끝
			System.out.println(cat);
			//anoymousTest.AnimalMain$1@2ff4acd0
			//		패키지명.	클래스명 $ 내부클래스 1 익명클래스
//			cat.speak();
			
			Animal dog = new Animal() {
				
				@Override
				public void speak() {
					System.out.println("멍멍");
				}//내부 클래스의 메소드 중괄호 끝
			};// 내부클래스 중괄호 끝
			System.out.println(dog); //anoymousTest.AnimalMain$2@5caf905d
			
			
			cat.speak();
			dog.speak();
		
	}//메인 끝
}

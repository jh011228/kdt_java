package inheritaneTest02;
//2번 : 상속 기초(Animal 클래스를 상속받는 Cat 클래스)
public class Cat extends Animal {
	//고양이 고유 메소드
	void meow() {
		System.out.println(this.name+" 이/가 야옹하고 웁니다");
	}
}

package review;

public class Teacher extends Person {

	public Teacher(String name) {
		super(name);
	}
//	Teacher 클래스
//	필드 : x
//	메소드 : teach()
//	   이름이 가르칩니다 출력
//	메소드 오버라이딩 : 저는 선생님입니다 출력
	void teach() {
		System.out.println(getName()+"이 가르칩니다");
	}
	@Override
	void introduce() {
		System.out.println("저는 선생님입니다");
	}
	
}

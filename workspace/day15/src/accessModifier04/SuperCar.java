package accessModifier04;

public class SuperCar extends Car {

	//오버라이딩
	@Override
	void speedUp() {
		System.out.println(getSpeed());
		setSpeed(getSpeed()+20); // private 필드의 접근은 항상 getter와 setter를 통해 처리
		System.out.println("슈퍼카가 가속합니다 : "+getSpeed());
	}
	
}

package homework15;

public class Employee extends Person {

	public Employee(String name) {
		super(name);
	}
//	Employee 클래스
//	필드 : x
//	메소드 : work() 
//	   업무를 처리중입니다 출력
//	메소드 오버라이딩 : 저의 이름은 이고 회사원입니다 출력
	void work() {
		System.out.println("업무를 처리중입니다");
	}
	@Override
	void introduce() {
		System.out.println("저의 이름은 "+this.getName()+"이고 회사원입니다");
	}
	
}

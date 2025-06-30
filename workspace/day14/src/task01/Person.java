package task01;
//필드 : 이름, 나이
//생성자  
//	기본생성자(이름없음, 0) 전달
//	매개변수가 2개 있는 생성자
//		Person 생성자 호출 출력
//메소드
//	introduce 메소드 : 이름, 나이 출력 메소드
//	sleep 메소드 : 이름은 몇시에 잠을 잡니다 출력 메소드
//서브 클래스 : Student
public class Person {
	//필드
	String name;
	int age;
	//생성자
	public Person() {
		this("이름없음",0);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person 생성자 호출");
	}
	void introduce() {
		System.out.println("이름 : "+this.name+", 나이 : "+this.age);
	}
	void sleep(int time) {
		System.out.println(this.name+"은/는 "+time+"시에 잠을 잡니다");
	}
}

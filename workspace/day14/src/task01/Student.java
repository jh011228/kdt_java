package task01;
//필드 : 학번, 전공
//생성자
//	기본생성자(이름없음, 0, 값없음, 전공없음) 전달
//	매개변수가 4개 있는 생성자
//		student 생성자 호출 출력
//부모클래스의 introduce 메소드 오버라이딩
//	부모 메소드 호출
//	학번과 전공도 출력하는 메소드
//	
public class Student extends Person{
	String studentId;
	String major;
	public Student() {
		this("이름없음",0,"값없음","전공없음");
	}
	public Student(String name, int age, String studentId, String major) {
		super(name,age);
		this.studentId = studentId;
		this.major = major;
		System.out.println("Student 생성자 호출");
	}
	@Override
	void introduce() {
		super.introduce();
		System.out.println("학번 : "+studentId+", 전공 : "+major);
	}
	
	
	
}

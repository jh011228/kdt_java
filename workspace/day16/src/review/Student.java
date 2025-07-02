package review;

public class Student extends Person {
//	Student 클래스
//	필드 : boolean stu
//	생성자 : 매개변수 stu도 포함
//	메소드 : study()   
//	   이름이 공부합니다 출력
//	메소드 오버라이딩 : 이름은 학생입니다 출력
	private boolean stu;
	
	
	public boolean isStu() {
		return stu;
	}


	public void setStu(boolean stu) {
		this.stu = stu;
	}


	public Student(String name, boolean stu) {
		super(name);
		this.stu = stu;
	}
	
	@Override
	void introduce() {
		System.out.println(this.getName()+"은 학생입니다");
	}


	void study() {
		System.out.println(this.getName()+"이 공부합니다");
	}
}

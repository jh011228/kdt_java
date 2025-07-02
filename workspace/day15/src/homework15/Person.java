package homework15;

public class Person {
//	부모클래스 : Person
//	공통메소드 : introduce()   자식클래스에서는 오버라이딩
//	모든 필드는 private
//	생성자는 이름을 갖고 있는 생성자
//
//	Person 클래스
//	필드 : 이름, 나이, 생년월일(8자리)
//	메소드 : introduce() 이름, 나이입니다 출력
	private String name;
	private int age;
	private String birth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		if(birth.length()==8) {
			return birth;			
		}
		return null;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Person(String name) {
		this.name = name;
	}

	void introduce() {
		System.out.println(name + ", " + age + "살입니다");
	}
}

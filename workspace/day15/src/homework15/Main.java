package homework15;

public class Main {
	public static void main(String[] args) {

//Main 클래스
//static 메소드(printInfo())
//   객체 타입에 따라 다운 캐스팅하여 전용 메소드 실행 => 만든 메소드 다 찍어봐야함
		//사람
		System.out.println("=============방법1=============");
		Person person = new Person("사람");
		person.setAge(15);
		Main.printInfo(person);
//		System.out.println(person);
		//학생					
		person = new Student("학생", true);
		person.setAge(18);
//		System.out.println(person);
		Main.printInfo(person);
		((Student)person).study();
//		System.out.println(person);
		//선생님
		person = new Teacher("선생님");
//		System.out.println(person);
		Main.printInfo(person);
		((Teacher)person).teach();
		//회사원
		person = new Employee("회사원");
//		System.out.println(person);
		Main.printInfo(person);
		((Employee)person).work();
		System.out.println("=================방법2==================");
		Person person2 = new Person("그냥사람");
		printWho(person2);
		person2 = new Student("학생2", true);
		printWho(person2);
		person2 = new Teacher("선생님2");
		printWho(person2);
		person2 = new Employee("회사원2");
		printWho(person2);
	}
	static void printInfo(Person person) {
		person.introduce();
	}
	static void printWho(Person person) {
		if(person instanceof Student) {
			((Student)person).study();
		}else if(person instanceof Teacher){
			((Teacher)person).teach();
		}else if(person instanceof Employee) {
			((Employee)person).work();
		}
		else {
			System.out.println("그냥 사람입니다");
		}
	}
	
}

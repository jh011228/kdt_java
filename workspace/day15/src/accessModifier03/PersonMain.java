package accessModifier03;
//2번 : private 접근제한자
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("짱구");
		p1.setAge(5);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		p1.printInfo();
	}
}

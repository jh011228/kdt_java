package innerTest;


//25번 : 내부클래스
public class InnerMain {
	public static void main(String[] args) {
		//외부 클래스의 객체 생성
		Outer outer = new Outer();
//		System.out.println("외부 클래스의 참조값 : "+outer);
//		System.out.println("외부 클래스의 데이터값 : "+outer.var1);
////		System.out.println("외부 클래스의 데이터값 : "+outer.var2); //외부 클래스의 객체로는 내부 클래스 멤버 실행 불가
		
		//내부 클래스의 객체 생성
		//내부 클래스는 외부 클래스의 인스턴스를 통해 생성해야한다
//		Inner inner = new Inner();
		Outer.Inner inner = outer.new Inner();
//		Outer.Inner inner2 =new Outer().new Inner();
		System.out.println(inner);
		
	}
}

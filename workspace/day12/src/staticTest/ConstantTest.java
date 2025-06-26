package staticTest;
//2번 : 클래스 상수와 인스턴스 상수
public class ConstantTest {
	//필드
	//클래스 내부에서 상수 선언
	final double PI = 3.1415926539; //인스턴스 상수
	//heap 영역, 객체 생성 시 초기화, 객체마다 독립적(값이 같아도 독립적), 특정 개체마다 고유한 상수를 정의할 때 사용
	
	static final int MAX_LENGHT = 100; //클래스 상수(스태틱 상수)
	//method 영역, 클래스 로드 시 초기화, 모든 객체가 공유, 클래스 전체에서 공통으로 사용하는 상수
	
	
	//메소드	
	public static void main(String[] args) {
		ConstantTest ct = new ConstantTest();
		System.out.println(ct.PI);
		System.out.println(ConstantTest.MAX_LENGHT);
		System.out.println(new ConstantTest().PI);
	}
	
}

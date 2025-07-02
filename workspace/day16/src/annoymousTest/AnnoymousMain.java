package annoymousTest;
//29번 : 익명 클래스 - 메인 클래스
public class AnnoymousMain {
	public static void main(String[] args) {
		InterA a = new InterA() {
			@Override
			public void printText() {
				System.out.println("인터페이스를 익명클래스에서 오버라이딩");
			}
		};
		a.printText();
		
		InterA aa = new InterA() {
			@Override
			public void printText() {
				System.out.println("익명클래스에서 오버라이딩");
				System.out.println("수업끝");
			}
		};
		System.out.println(aa);
		aa.printText();
	}
}

package classBasic2;
//12번 : Rectangle 클래스 main
public class RectangleMain {
	public static void main(String[] args) {
		
		
		//객체화
		//클래스자료형 객체명 = new 생성자();
		Rectangle r1 = new Rectangle();
		System.out.println(r1);//classBasic2.Rectangle@279f2327
	
		//객체명.필드명 = 값;
		r1.height = 20;
		r1.width = 10;
		
		//넓이 메소드 호출
		System.out.println("넓이는 : "+r1.getArea());
		//둘레 메소드 호출
		System.out.print("높이는 : ");
		r1.getPerimeter();
	
	}
}

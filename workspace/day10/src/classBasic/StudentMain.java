package classBasic;
//10-2번 : Student 클래스의 객체를 만들 클래스
public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student();
		System.out.println(st2);
		
		//객체명.필드명 = 값;
		st1.name = "홍길동";
		st1.kor = 100;
		st1.eng = 100;
		st1.math =100;
		//매개변수 x 리턴값 o => syso(객체명.메소드명());
		System.out.println(st1.getTotal());
		st1.avg = st1.getTotal()/3d;
//		System.out.println(st1.name);
//		System.out.println(st1.kor);
//		System.out.println(st1.eng);
//		System.out.println(st1.math);
		System.out.println("평균점수 : "+st1.avg);
//		System.out.println(st2.name);
//		st1.avg = (st1.kor+st1.eng+st1.math)/3d;
//		System.out.printf("%.1f",st1.avg);
		
		
		st2.name = "짱구";
		st2.kor = 100;
		st2.eng = 50;
		st2.math =77;
		st2.avg = st2.getTotal()/3d;
		
		System.out.printf("%s님의 평균점수는 %.1f점 입니다.",st2.name,st2.avg);
		
	}
}

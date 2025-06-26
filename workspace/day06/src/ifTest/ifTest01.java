package ifTest;
//9번 : 조건문(if문)
public class ifTest01 {//클래스 시작
	public static void main(String[] args) {//main 시작
		
		System.out.println("출력 시작");
		
		int number =1;
		if(number==10) {//if 문시작
//			System.out.println("if문의 조건식이 true 입니다");
//			System.out.println("숫자는 " + number + "입니다.");
			number += 10;
			System.out.println(number);
		}//if 문종료
		
		System.out.println("출력 끝");
	}//main 종료
}//클래스종료

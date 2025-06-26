package ifTest;
//12 : if ~ else if ~ else 문
public class ifTest03 {
	public static void main(String[] args) {
		
		System.out.println("출력 시작");
		
		int num =5;
		if(num>0) {
			System.out.println("양수입니다");
		}
		else if(num<0) {
			System.out.println("음수입니다");
		}
		else {
			System.out.println("0입니다");
		}
		
		if(num>5) {
			System.out.println("5보다 큽니다");
		}
		else if(num>3) {
			System.out.println("3보다 큽니다");
		}
		else {
			System.out.println(num);
		}
		System.out.println("출력 끝");
	}
}

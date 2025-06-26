package ifTest;

import java.util.Scanner;

//11번: if~ else 문 실습1
public class ifTask01 {
	public static void main(String[] args) {
		//사용자한테 숫자 입력받아 짝수인지 홀수인지 출력
		 //1) 입력클래스 import
	      //2) 입력 메시지 출력
	      //3) 변수 입력메소드사용(nextInt())
	      //5) 출력(if~else 로 )      
	      //+) sc.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number= sc.nextInt();
		if(number%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		//삼항연산자
		System.out.println(number % 2 != 1 ? "짝수" : "홀수" );
		sc.close();
	}
}

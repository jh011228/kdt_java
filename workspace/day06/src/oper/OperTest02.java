package oper;

import java.util.Scanner;

//5번 : 삼항연산자
public class OperTest02 {
	public static void main(String[] args) {
		// 조건식 ? 참일때의 값 : 거짓일떄의 값;
		// 조건식은 반드시 boolean 결과를 반환해야 한다(true, false)
		// 삼항 연산자는 값을 반환하므로 변수에 저장하거나 바로 출력 가능
		
//		System.out.println(true ? "참" : "거짓");
//		System.out.println(false ? "참" : "거짓");
//		
//		System.out.println(10 > 5 ? "10이 더 크다" : "5가 더 크다");
//		System.out.println(10 > 5 && 10 == 5 ? "true" : "false");
//		
//		int number =1 < 2 ? 1 : -1;
//		System.out.println(number);
//		
	      //정수 2개를 입력받아서 큰 수 구하기
	      //입력클래스 import
	      //입력 메시지 출력
	      //정수형 변수 2개 선언
	      //문자열 변수 1개 선언, 삼항연산자 대입
	      //출력
	      //sc.close()
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("비교할 두 숫자를 입력하세요");
	      int num1 = sc.nextInt();
	      int num2 = sc.nextInt();
	      String result = num1 < num2 ? num2 + "가 큽니다" : num2 + "가 크지 않습니다";
	      System.out.println(num1 + "과 " + num2 + "비교 결과는 " + result);
	      sc.close();
	}

}

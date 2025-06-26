package scanner;

import java.util.Scanner;

//10번 : 입력 클래스, 입력 메소드 실습2
public class ScannerTask02 {
	public static void main(String[] args) {
		
		//1. 줄 단위로 입력받아 출력(입력은 반드시 3번 , 출력 1번)
		//1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in);
		//2) 입력 클래스 import
		//ctrl + shift + o
		
		//3) 문자열 변수 선언, 입력메소드 사용
		String input1 = sc.next();
		String input2 = sc.next();
		String input3 = sc.next();
		//4) 변수 출력
		System.out.println(input1+"\n"+input2+"\n"+input3);
		// 줄 정리
		sc.nextLine();
		//5) 문자열 변수 선언, 입력메소드 사용
		String name = sc.nextLine();
		String age = sc.next();
		//줄 
		sc.nextLine();
		//6) 문자열 변수 선언, 입력메소드 사용
		String hobby = sc.nextLine();
		//7) 문자열 값을 정수형으로 형 변환하여 변수 선언
		int realAge = Integer.parseInt(age);
		//8) 결과 출력
		System.out.printf("%s은 %d살이고 취미는 %s입니다\n",name,realAge,hobby);
		System.out.printf("%s은 2026년에 %d살입니다",name,realAge+1);
		sc.close();
	}
}

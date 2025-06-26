package review;

import java.util.Scanner;

//3 복습문제
public class Review01 {

	public static void main(String[] args) {
		//입력받은 숫자 1~10까지 숫자인 경우에만 제곱 나머지는 잘못입력했습니다 출력
		//1) 입력클래스 import
	    //2) 정수형 변수 1개 선언
	    //3) 입력 메시지 출력 1개
	    //4) 변수 입력메소드사용(nextInt())
		//if 문 생성
		//1보다크거나 같고10보다 작거나 같으면 제곱하고 나머지는 잘못입력했습니다 출력
		//if 조건식 1 <= 변수 && 변수 <= 10, 0 < 변수 && 변수 < 11
	    //5) 출력(2개)      
	    //+) sc.close();
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");//숫자 입력 : 출력
//		int number = sc.nextInt();//number 변수에 정수형으로 입력메소드 사용
//		if(number>=1 && number <=10) { //만약 number 1보다 크거나 같고,10보다 작거나 같으면 
//			System.out.println(number*number);//number 제곱 출력
//		}
//		else {//윗내용이 전부 아니면
//			System.out.println("잘못 입력했습니다");//잘못입력했습니다 출력
//		}
		
		//문자열 비교 는 equals() 메소드로
		System.out.print("문자열 1 입력 : ");
		String data1 = sc.nextLine();//data1 문자열에 입력메소드 사용
		System.out.print("문자열 2 입력 : ");
		String data2 = sc.nextLine();//data2 문자열에 입력메소드 사용
//		System.out.println(data1 == data2);//data1과 data2가 같은 지 확인해서 true/false 출력
		System.out.println(data1.equals(data2));// data1과 data2가 같은 지 확인해서 true/false 출력
		if(data1.equals(data2)) {//data1과 data2가 같으면
			System.out.println("두 문자열은 같습니다");//두 문자열은 같습니다 출력
		}
		else {//윗내용이 전부 아니면
			System.out.println("두 문자열은 같지 않습니다");//두 문자열은 같지 않습니다 출력
		}
		sc.close();
	}

}

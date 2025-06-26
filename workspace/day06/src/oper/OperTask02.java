package oper;

import java.util.Scanner;

//6번 : 삼항연산자 실습1
public class OperTask02 {
   public static void main(String[] args) {

      // 1. 두 수를 입력받아 비교
      // 크다, 작다, 같다가 각각 상황에 맞게 출력되도록 로직 구성
      // 1) 입력클래스 import
      // 2) 입력 메시지 출력
      // 3) 변수 선언, 입력메소드 사용
      // 4) 입력메시지 출력
      // 5) 변수 선언, 입력메소드 사용
      // 6) 삼항연산자 사용하여 출력 => 크다/작다/같다가 출력되어야함
//      조건식 ? 참일때의 값 : 거짓일때의 값
//      조건식1 ? 참일 때의 값 : 조건식2 ? 참일때의 값 : 거짓일 때의 값
      Scanner sc = new Scanner(System.in);
      System.out.println("크기 비교할 숫자 1 입력 : ");
      int num1 = sc.nextInt();
      System.out.println("크기 비교할 숫자 2 입력 : ");
      int num2 = sc.nextInt();
      String result = num1 > num2 ? "큰 수 : " + num1 : (num1 == num2) ? "같은 수" : "큰 수 : " + num2;
      System.out.println(result);

      System.out.println(num1 > num2 ? "큰 수 : " + num1 : (num1 == num2) ? "같은 수" : "큰 수 : " + num2);

      // 2. 한 개의 정수를 입력받아서 짝수인지 아닌지 출력하기
      // 짝수입니다 or 짝수가 아닙니다로 출력할 것

      // 1) 입력 메시지 출력
      // 2) 정수형 변수 1개(입력메소드), 문자열변수 1개(삼항연산자, 산술연산자, 관계연산자)
      // 3) 출력
      System.out.println("숫자 1개 입력 : ");
      int number = sc.nextInt();
      String result1 = (number % 2 == 0) ? "짝수입니다" : "짝수가 아닙니다";
      System.out.println("입력한 숫자 " + number + "는 " + result1);
      sc.close();

   }
}

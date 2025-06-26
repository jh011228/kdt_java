package scanner;

import java.util.Scanner;

//11번 : 두 정수를 입력받아 합을 출력하기(next() 메소드를 사용하기)
public class ScannerTask03 {
   public static void main(String[] args) {
      
      //두 정수를 변수에 저장 후 합을 출력하기
      //1) 정수형 변수 2개 선언
      //2) 출력
//      int num1 = 10, num2 = 20;
//      System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
      
      //두 정수를 입력받은 후 합을 출력하기
      //1) 입력클래스 import
      Scanner sc = new Scanner(System.in);
      //2) 문자열 변수(메시지) 2개, 정수형 변수 3개(입력변수2, 결과변수1)
      String msg1 = "정수1 입력 : ", msg2 = "정수2 입력 : ";
      int num1, num2, result;
      
      //3) 메시지 출력1
      System.out.println(msg1);
      //4) 입력 메소드 사용(next())
//      num1 = Integer.parseInt(sc.next());
      num1 = sc.nextInt();
//      String num = sc.next();
//      int num3 = Integer.parseInt(num);
      //5) 메시지 출력2
      System.out.println(msg2);
      //6) 입력 메소드 사용(next())      
//      num2 = Integer.parseInt(sc.next());
      num2 = sc.nextInt();
      //7) 결과변수 = 변수1 + 변수2
      result = num1 + num2;
      //8) 출력
      System.out.println(num1 + " + " + num2 + " = " + result);
      //9) 스캐너 해제
      sc.close();

   }
}

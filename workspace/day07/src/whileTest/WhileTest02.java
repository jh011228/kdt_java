package whileTest;
//9번 : while문 활용한 합계 구하기
public class WhileTest02 {
   public static void main(String[] args) {
      //1부터 100까지 합 구하기(for문 이용)
      //1) 총합 구할 변수 선언
      //2) for문    (초기식    int i = 1
      //         조건식   i <= 100
      //         증감식   i++ 
      //3) 중괄호 영역
      //      총합구할변수 += i   총합구할변수 = 총합구할변수 값 + i
      //4) 출력
      int result1 = 0;
      for(int i = 1; i <= 100; i++) {
         result1 += i;
      }
      System.out.println("1부터 100까지의 합(for문) : " + result1);
      
      //짝수의 합, 홀수의 합 추가적으로 구하기
      //1부터 100까지의 합을 구하기(while문 이용)
      //1) 변수 선언 2개(총합구할변수, 비교대상 변수 0)
      //+)   변수 2개 더 선언(짝수의 합, 홀수의 합 구할 변수)
      //2) while문   (조건식    비교대상변수 <= 100)
      //3) while중괄호영역
      //      총합구할변수 += 비교대상변수
      //+)   짝수 구할 조건문(if ~ else문)
      //      if(조건식 cnt % 2 == 0){
      //         짝수총합구할변수 += cnt;
      //      }else{
      //         홀수총합구할변수 += cnt;
      //      }      
      //      비교대상변수 1증가
      //4) 출력
      
      int result2 = 0, cnt = 0, even = 0, odd = 0;
      while(cnt <= 100) {
         result2 += cnt;
         if(cnt % 2 == 0) {
            even += cnt;
         }else {
            odd += cnt;
         }
         cnt++;
      }
      System.out.println("1부터 100까지의 합(while문) : " + result2);
      System.out.println("1부터 100까지의 짝수의 합 : " + even);
      System.out.println("1부터 100까지의 홀수의 합 : " + odd);
      
   }
}

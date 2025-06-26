package oper;
//3번 : 관계연산자와 논리 연산자
public class OperTest01 {
   public static void main(String[] args) { //main 시작
      
      System.out.println("=======관계 연산자======");
      
      int num1 = 10, num2 = 20, num3 = 10;
      System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
      System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
      System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
      System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
      System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
      System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
      
//      System.out.println(10 >= 10);
      System.out.println("\n==========논리연산자==========");
      System.out.println("and : 둘 다 참이면 참(&&)");
      System.out.println(true && true);   	//true
      System.out.println(true && false);   	//false
      System.out.println(false && true);   	//false
      System.out.println(false && false);   //false
      
      
      System.out.println("\nor : 둘 다 참이면 참(&&)");
      System.out.println(true || true);   	//true
      System.out.println(true || false);   	//true
      System.out.println(false || true);   	//true
      System.out.println(false || false);   //false
      
      System.out.println("\nnot : 둘 다 참이면 참(&&)");
      System.out.println(!true);   	//false
      System.out.println(!false);   //true
  
      
   } //main 끝
}

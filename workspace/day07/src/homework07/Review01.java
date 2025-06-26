package homework07;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {


	public static void main(String[] args) {
//		1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력(삼항 연산자)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int hol = sc.nextInt();
		System.out.println(hol%2==0 ? "짝수입니다" : "홀수입니다");
//		2. 한 개의 정수를 입력받아 양수, 음수, 0인지 출력(암거나)
		System.out.print("정수를 입력해주세요 : ");
		int yang = sc.nextInt();
		if(yang>0) {
			System.out.println(yang+"은 양수 입니다.");
		}
		else if(yang<0) {
			System.out.println(yang+"은 음수입니다.");
		}
		else {
			System.out.println(yang+"은 0입니다");
		}
		
//		3. 나이를 입력받아 다음 기준으로 출력하기(암거나)
//		0 ~ 12	: 어린이입니다
//		13 ~ 19 : 청소년입니다
//		20 이상 : 성인입니다
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age<=12&&age>=0) {
			System.out.println("현재 나이는 "+age+"이고 어린이입니다.");
		}
		else if(age>12&&age<20) {
			System.out.println("현재 나이는 "+age+"이고 청소년입니다.");
		}
		else if(age>=20){
			System.out.println("현재 나이는 "+age+"이고 성인입니다.");
		}
//		4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬 출력
//		단, 세 개의 정수는 모두 다른 숫자여야 한다(중복x)
//
//		숫자 3개 입력 : 5 1 9
//		정렬된 숫자 : 9 5 1
		System.out.println("정수 3개 입력 중복 X");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int thr = sc.nextInt();
//		if(one==two||one==thr||two==thr) {
//			System.out.println("중복 입력하셨습니다.");
//		}
//		else {
//			int[] ott = new int[] {one,two,thr};
//			Arrays.sort(ott);
//			
//			for(int i =ott.length-1;i>=0;i--) {
//				System.out.print(ott[i] + " ");
//			}
//			
//		}
		
		
		
		if(one==two||one==thr||two==thr) {
			System.out.println("중복 입력하셨습니다.");
		}
		else {
			if(one>two&&one>thr) {
				System.out.print(one +" ");
				if(two>thr) {
					System.out.print(two +" ");
					System.out.print(thr);
				}
				else{
					System.out.print(thr + " " + two);
				}
			}
			else if(two>one&&two>thr) {
				System.out.print(two +" ");
				if(one>thr) {
					System.out.print(one + " ");
					System.out.print(thr);
				}
				else {
					System.out.print(thr + " " + one);
				}
			}
			else {
				System.out.print(thr+" ");
				if(one>two) {
					System.out.print(one + " ");
					System.out.print(two);
				}
				else {
					System.out.print(two + " " + one);
				}
			}
		}
//		5. 사용자가 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열 출력[equals x]
		String X = "X";
		while(true) {
			System.out.print("문자열을 입력해 주세요 : ");
			String text = sc.next();
			if(text.equals(X)) {
				System.out.println("종료합니다.");
				break;
			}
			System.out.println("입력한 문자열 : "+text);
			
		}
		sc.close();
	}

}

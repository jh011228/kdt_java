package review;

import java.util.Scanner;

public class MethodTask02 {
	public static void main(String[] args) {
		// 1. 정수 1개 받아 짝수,홀수 반환 checkNum => String;
		MethodTask02 mt2 = new MethodTask02();
		System.out.println(mt2.checkNum(2));
		System.out.println(mt2.checkNum(-7));
		// 2. 10칸짜리 정수 배열 받아 총합을 계산해 반환 getSum => int;
		int[] ar1 = new int[10];
		for (int i = 1; i <= 10; i++) {
			ar1[i - 1] = i;
		}
		System.out.println(mt2.getSum(ar1));
		System.out.println(mt2.getSum(new int[] {1,2,3,4,5,6,7,8,9,10,11}));
		// 3. 문자열 매개변수로 받아 거꾸로 뒤집어 반환 reverseStr => String; //hello => olleh
		System.out.println(mt2.reverseStr("hello"));
		// 4. 정수열 배열과 찾을 값을 매개변수로 받아 배열에 존재하면 true 반환 contains => boolean
		// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
//		syso(메소드명(배열명,10)) => true
		int[] ten = { 1, 2, 3, 4, 10 };
		System.out.println(mt2.contains(ten, 10));
		System.out.println(mt2.contains(ten, 5));
		// 5.단수를 매개변수로 받아 해당 단의 구구단을(1~19)을 출력하는 메소드 printGugudan => String
		// 3 x 1 = 3
		// ...
		// 3 x 19 = 57
		mt2.printGugudan(3);
		// 6. 두 개의 문자열을 입력받아 두 문자열길이가 같으면 같음, 다르면 다름 반환하는 메소드 compareLength => boolean
		String word1 = "apple";
		String word2 = "pineaple";
		System.out.println(mt2.compareLength(word1, word2));
		// 7. 아이디, 비밀번호 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 loginTry => ?
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.nextLine();
		System.out.println();
		mt2.loginTry(id, pw);
		sc.close();
	}
	// 1. 정수 1개 받아 짝수,홀수 반환 checkNum => String;

	// 1) 리턴타입 => String
	// 2) 메소드명 => checkSum
	// 3) 매개변수 => int num
	// 4) 실행할문장 =>num 2로 나눠서 나머지가 0이면 짝수 아니면 홀수 return
	String checkNum(int num) {
		return num%2==0 ? "짝수입니다" : "홀수입니다" ;
	}

	// 2. 10칸짜리 정수 배열 받아 총합을 계산해 반환 getSum => int;
	// 1) 리턴타입 => int
	// 2) 메소드명 => getSum
	// 3) 매개변수 => int[] arr
	// 4) 실행할문장 => sum 정수형 변수 생성 후 sum에 arr 배열 안의 숫자 하나씩 더하기
//					return sum
	int getSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	// 3. 문자열 매개변수로 받아 거꾸로 뒤집어 반환 reverseStr => String; //hello => olleh
	// 1) 리턴타입 => String
	// 2) 메소드명 => revereseStr
	// 3) 매개변수 => String word
	// 4) 실행할문장 => drow 문자열 변수 생성후 word.length까지 반복시켜서
//						drow에 word의 마지막글자부터 하나씩 대입;
//						return drow 
	String reverseStr(String word) {
		String drow = "";
		for (int i = 0; i < word.length(); i++) {
			drow += word.charAt(word.length() - i - 1);
		}
		return drow;
	}

	// 4. 정수열 배열과 찾을 값을 매개변수로 받아 배열에 존재하면 true 반환 contains => boolean
	// 1) 리턴타입 => boolean
	// 2) 메소드명 => contains
	// 3) 매개변수 => int[] arr, int num
	// 4) 실행할문장 => i와 num 숫자를 비교해서 같으면 return true/ 다르면 return false 출력
	boolean contains(int[] arr, int num) {
		for (int i : arr) {
			if (num == i) {
				return true;
			}
		}
		return false;
	}

	// 5.단수를 매개변수로 받아 해당 단의 구구단을(1~19)을 출력하는 메소드 printGugudan =>
	// 1) 리턴타입 => void
	// 2) 메소드명 => printGugudan
	// 3) 매개변수 => int num
	// 4) 실행할문장 => 1부터 19까지 반복해서 num x i = 결과 19번 출력
	void printGugudan(int num) {
		for (int i = 1; i <= 19; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}

	// 6. 두 개의 문자열을 입력받아 두 문자열길이가 같으면 같음, 다르면 다름 반환하는 메소드 compareLength =>String
	// 1) 리턴타입 => String
	// 2) 메소드명 => compareLength
	// 3) 매개변수 => String word1,word2
	// 4) 실행할문장 => word1의 길이와 word2의 길이를 비교해서 같으면 같음 출력 다르면 다름 출럭
	String compareLength(String word1, String word2) {
		if (word1.length() == word2.length()) {
			return "같음";
		}
		return "다름";
	}

	// 7. 아이디, 비밀번호 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 loginTry =>void
	// 1) 리턴타입 => void
	// 2) 메소드명 => loginTry
	// 3) 매개변수 => String id,pw
	// 4) 실행할문장 => count를 1로 설정하고 id/pw를 admin/1234와 비교해서 맞으면 출력 후 종료/
//						다르면 count를 올리고 다시 입력받기
//						3회 넘어가면 잠금처리하기
//							스캐너 닫기
	void loginTry(String id, String pw) {
		int count = 1;
		String adminId = "admin";
		String adminPw = "1234";
		Scanner sc = new Scanner(System.in);
		do {
			if (id.equals(adminId) && pw.equals(adminPw)) {
				System.out.println("관리자님 환영합니다.");
				break;
			} else {
				count++;
				System.out.println("다시 확인하세요");
				System.out.print("아이디를 입력하세요 : ");
				id = sc.nextLine();
				System.out.print("비밀번호를 입력하세요 : ");
				pw = sc.nextLine();
			}
		} while (count < 3);
		if (count == 3) {
			System.out.println("잠금처리 되었습니다.");
		}
	sc.close();
	}

}

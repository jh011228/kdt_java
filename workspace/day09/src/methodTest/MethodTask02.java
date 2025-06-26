package methodTest;

public class MethodTask02 {
	public static void main(String[] args) {
		//1. 정수 1개 받아 짝수,홀수 반환 checkNum => String;
		MethodTask02 mt2 = new MethodTask02();
		System.out.println(mt2.checkNum(2));
		System.out.println(mt2.checkNum(3));
		//2. 10칸짜리 정수 배열 받아 총합을 계산해 반환 getSum => int;
		int[] ar1 = new int[10];
		for(int i=1;i<=10;i++) {
			ar1[i-1] = i;
		}
		System.out.println(mt2.getSum(ar1));
		//3. 문자열 매개변수로 받아 거꾸로 뒤집어 반환 reverseStr => String; //hello => olleh
		System.out.println(mt2.reverseStr("hello"));
		//4. 정수열 배열과 찾을 값을 매개변수로 받아 배열에 존재하면 true 반환 contains => boolean 
		//배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
//		syso(메소드명(배열명,10)) => true
		int[] ten = {1,2,3,4,10};
		System.out.println(mt2.contains(ten, 10));
		System.out.println(mt2.contains(ten, 5));
		//5.단수를 매개변수로 받아 해당 단의 구구단을(1~19)을 출력하는 메소드 printGugudan => String
		// 3 x 1 = 3
		// ...
		// 3 x 19 = 57
		mt2.printGugudan(3);
		//6. 두 개의 문자열을 입력받아 두 문자열길이가 같으면 같음, 다르면 다름 반환하는 메소드 compareLength => boolean
		String word1 = "apple";
		String word2 = "pinea";
//		mt2.compareLength(word1, word2) ? "같음" : "다름";
		//7. 아이디, 비밀번호 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 loginTry => ?
		
	}
	
	   // 1) 리턴타입 => void
	   // 2) 메소드명 => printMinMax
	   // 3) 매개변수 => int[] ar
	   // 4) 실행할문장 => 최소값, 최대값을 0번째 인덱스로 저장하고 반복문 통해 비교
	   // 0번째 인덱스의 값보다 작은값이 최소값, 큰값이 최대값이 된다 출력
	//1. 정수 1개 받아 짝수,홀수 반환 checkNum => String;
	String checkNum(int num) {
		if(num%2==0) {
			return "짝수";
		}
		else {
			return "홀수";
		}
	}
	//2. 10칸짜리 정수 배열 받아 총합을 계산해 반환 getSum => int;
		// 1) 리턴타입 => void
	   // 2) 메소드명 => printMinMax
	   // 3) 매개변수 => int[] ar
	   // 4) 실행할문장 => 최소값, 최대값을 0번째 인덱스로 저장하고 반복문 통해 비교
	   // 0번째 인덱스의 값보다 작은값이 최소값, 큰값이 최대값이 된다 출력
	int getSum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum +=i;
		}
		return sum;
	}
	//3. 문자열 매개변수로 받아 거꾸로 뒤집어 반환 reverseStr => String; //hello => olleh
	// 1) 리턴타입 => void
	   // 2) 메소드명 => printMinMax
	   // 3) 매개변수 => int[] ar
	   // 4) 실행할문장 => 최소값, 최대값을 0번째 인덱스로 저장하고 반복문 통해 비교
	   // 0번째 인덱스의 값보다 작은값이 최소값, 큰값이 최대값이 된다 출력
	String reverseStr(String word) {
		String drow = "";
		for(int i=0;i<word.length();i++) {
			drow += word.charAt(word.length()-i-1);
		}
		return drow;
	}
	//4. 정수열 배열과 찾을 값을 매개변수로 받아 배열에 존재하면 true 반환 contains => boolean 
	// 1) 리턴타입 => void
	   // 2) 메소드명 => printMinMax
	   // 3) 매개변수 => int[] ar
	   // 4) 실행할문장 => 최소값, 최대값을 0번째 인덱스로 저장하고 반복문 통해 비교
	   // 0번째 인덱스의 값보다 작은값이 최소값, 큰값이 최대값이 된다 출력
	boolean contains(int[] arr,int num) {
		for(int i : arr) {
			if(num==i) {
				return true;
			}
		}
		return false;
	}
	//5.단수를 매개변수로 받아 해당 단의 구구단을(1~19)을 출력하는 메소드 printGugudan => String
	// 1) 리턴타입 => void
	   // 2) 메소드명 => printMinMax
	   // 3) 매개변수 => int[] ar
	   // 4) 실행할문장 => 최소값, 최대값을 0번째 인덱스로 저장하고 반복문 통해 비교
	   // 0번째 인덱스의 값보다 작은값이 최소값, 큰값이 최대값이 된다 출력
	void printGugudan(int num) {
		for(int i=1;i<=19;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
	//6. 두 개의 문자열을 입력받아 두 문자열길이가 같으면 같음, 다르면 다름 반환하는 메소드 compareLength => boolean
	// 1) 리턴타입 => void
	   // 2) 메소드명 => printMinMax
	   // 3) 매개변수 => int[] ar
	   // 4) 실행할문장 => 최소값, 최대값을 0번째 인덱스로 저장하고 반복문 통해 비교
	   // 0번째 인덱스의 값보다 작은값이 최소값, 큰값이 최대값이 된다 출력
	boolean compareLength(String word1,String word2) {
		if(word1.length()==word2.length()) {
			return true;			
		}
		return false;
	}
	

}

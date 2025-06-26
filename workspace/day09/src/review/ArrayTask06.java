package review;

public class ArrayTask06 {
	public static void main(String[] args) {
		// A~F까지 배열 넣고 C뺴고 출력
		// char 배열생성
		// 5번 반복해서 배열 안에 A~F넣기
		// 5번 반복해서 배열 출력
		// 조건문으로 빼고 출력하기
		char[] alpha = new char[5];
		int bet = 0;
		char minus = 'C';
		for (int i = 0; i < alpha.length; i++) {
			bet = (char)('A' + i);
			if(bet<minus) {
				alpha[i] = (char)('A' + i);				
			}
			else{
				alpha[i] = (char)('A' + i+1);	
			}
			
		}
		for (int i = 0; i < alpha.length; i++) {
				System.out.print(alpha[i] + " ");
		}

	}
}

package review;

public class ArrayTask05 {
	public static void main(String[] args) {
		//A~F까지 배열 넣고 출력
		//char 배열생성
		//6번 반복해서 배열 안에 A~F넣기
		//6번 반복해서 배열 출력
		char[] alpha =new char['F'-'A'+1];
		for(int i=0;i<alpha.length;i++) {
			alpha[i] =(char)('A'+i);
		}
		for(char i : alpha) {
			System.out.print(i + " ");
		}
	}
}

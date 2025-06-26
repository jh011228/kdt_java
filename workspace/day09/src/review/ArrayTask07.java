package review;

public class ArrayTask07 {
	public static void main(String[] args) {
		// 26자리 char 배열 생성
		// 26번 반복하는데, 만약 짝수면 대문자로 대입하고,
//		홀수면 소문자로 대입
//		반복문으로 출력
		char[] alpha = new char[26];
		for(int i=0;i<alpha.length;i++) {
			if(i%2==0){
				alpha[alpha.length-1-i] =(char)('Z'-i);				
			}
			else {
				alpha[alpha.length-1-i] =(char)('z'-i);	
			}
		}
		for(int i=0;i<alpha.length;i++) {
			System.out.print(alpha[i]);			
		}
	}
}

package ex04_최장현;
//문제 4. 구구단을 2단부터 9단까지 출력하세요. (20점)
//
//- for문 이용 (ForGugudan) 로직구성 필요없음
// 
//- while문 이용(WhileGugudan) 로직구성 필요없음
public class Ex04 {
	public static void main(String[] args) {
		//for문
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+" x "+i+" = "+i*j+"\t");				
			}
			System.out.println();
		}
		int a = 0;
		int b = 1;
		//while문
		while(a!=9) {
			a++;
			b=2;
			while(b!=10) {
				System.out.print(b+" x "+a +" = "+a*b+"\t");
				b++;
			}
			System.out.println();
		}
	}
}

package forTest;
//6번 : for 문 연습
public class ForTask01 {
	public static void main(String[] args) {
		//for 문만 사용
		//1.100부터 1까지 출력
		for(int i =100;i>0;i--) {
			System.out.print(i + "\t");
		}
		System.out.println();
		//2. 구구단 3단만 출력
		for(int i=1;i<=9;i++) {
			System.out.print("3 x "+i +" = " +(i*3)+"\t");
		}
		System.out.println();
		//3. A ~ F 출력
		for(char i = 'A';i<='F';i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		//4. A ~ F 출력
		for(int i =0;i<='F'-'A';i++) {
				System.out.print((char)(i+'A')+"\t");
		}
		System.out.println();
		//5 aBcDeFgHiJkLmNoPqRsTuVwXyZ
		for(char i='a';i<='z';i+=2) {
			System.out.print(i + "\t");
			System.out.print((char)(i-('a'-'A'-1)) + "\t");
		}
		System.out.println();
		//첫번째
		//초기식 i = 0, 조건식 0 < 2 true, 중괄호영역 (char)(i % 2 == 0 ? 0 + 97) => a, 증감식 i++ => i = 0 + 1
		//현재 i 의 값 1
		//	조건식 1 < 26 true, 중괄호영역 (char)(1+65) => (char)66 => B, 증감식 i++ => i = 1 + 1
		//현재 i 의 값 2
		//	25까지 반복
		for(int i=0; i< 26; i++) { 
			System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65) + "\t");
		}
		
	}

}

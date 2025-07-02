package ex5;

public class Ex5_4 {
	public static void main(String[] args) {
		
		//1. 0부터 5까지 5번 반복
		//2. 그안에 1부터 j까지 " "빈칸을 한개씩 늘림
		//3. 그안에 1부터 10-ix2-1까지 *을 9개에서 1개까지 두개씩 반복횟수를 줄이면서 출력
		for(int i=0;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=10-i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

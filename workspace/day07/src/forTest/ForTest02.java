package forTest;

import java.util.stream.IntStream;

//5번 : for 문
public class ForTest02 {
	public static void main(String[] args) {
		//1부터 100까지 수 중 짝수만 출력
		//초기식 int i = 1
		//조건식 i <= 100 or i < 101
		//증감식 i++
			
		//1) for문과 if문 사용
		//1부터 100까지 100번 반복하는데 i를 2로 나눈 나머지 값이 0이면 i + " "를 반복출력
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		//2)for 문의 조건식을 50으로 사용
		//0부터 50까지 50번 반복 (i+1) * 2 + " " 를 반복출력
		for(int i=0;i<50;i++) {
			System.out.print((i+1) * 2 + " ");
		}
		
		System.out.println();
		//3) for 문의 초기식을 2로 사용해 증감식 변경
		//2부터 100까지 2씩 증가시켜 50번 반복해 i + " "반복출력
		for(int i=2;i<=100;i+=2) {
				System.out.print(i + " ");
			}
		System.out.println();
		//1부터 100까지의 수 중 짝수의 합만 구하기
		//변수 생성
		int total = 0;//토탈 변수에 0 대입
		//1부터 100까지 2씩 증가시켜서 50번 반복
		for(int i=1;i<=100;i+=2) {
			//total 에 i+1씩 증가 
			total += i+1;
		}
		System.out.println(total);
		//방법 4) for 문 사용하지 않기
		int num = 50;
		int sum = 2 * (num * (num + 1))/2;
		System.out.println(sum);
		
		
		
	}

}

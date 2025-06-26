package homework08;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
		//3명 수학점수 받아서 배열 저장 평균점수 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("3명의 수학점수를 차례대로 입력하시오 :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int arr[] = {a,b,c};
		int avg = 0;
		for(int i=0;i<arr.length;i++) {
			avg += arr[i];
		}
		int average = avg/arr.length;
		System.out.println("평균 점수는 "+average+"점 입니다.");
		
	}
}

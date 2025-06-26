package review;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
		//3명 수학점수 받아서 배열 저장 평균점수 출력
		//스캐너 생성
		//출력/3명분 입력/
		//입력한 것 배열 생성
		//반복문으로 arr 배열 안에 값 avg 변수 에 다 합한 것 넣기
		//average로 평균 계산
		//평균점수 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("3명의 수학점수를 차례대로 입력하시오 :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int arr[] = {a,b,c};
		double avg = 0;
		for(int i=0;i<arr.length;i++) {
			avg += arr[i];
		}
		double average = avg/(double)arr.length;
		System.out.printf("평균 점수는 %.1f점 입니다.",average);
		sc.close();
	}
}

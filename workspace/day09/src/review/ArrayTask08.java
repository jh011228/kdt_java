package review;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask08 {
//	8. 5개의 정수를 입력받은 뒤 그 값을 배열에 담고 최대값과 최소값 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수 5개 입력 받기
		//int 배열 만들기
		// int 배열 안에 정수 5개 넣기
		//Arrays.sort로 작은 순서대로 정렬하기
		//배열명[0], 배열명[배열명.length-1]로 최소, 최대값 뽑기
		int[] arr = new int[5];
		int max = 0, min = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번째 정수 입력 : ");
			arr[i] = sc.nextInt();	
		}
		max = arr[0];
		min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
		
		
//		Arrays.sort(arr);
//		System.out.println("최소값 : "+ arr[0]);
//		System.out.println("최댓값 : "+ arr[arr.length-1]);
		sc.close();
	}
}

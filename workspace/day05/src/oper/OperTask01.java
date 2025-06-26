package oper;

import java.util.Scanner;

//13번 : 산술연산자 응용
public class OperTask01 {
	public static void main(String[] args) {
		
		//코인노래방 프로그램
		//사용자에게 금액 입력받고 부를 수 있는 곡 수 출력, 잔 돈 출력
		
		//1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in);
		//2) 입력 클래스 import
		//ctrl + shift + o
		//3) 메시지 출력
		System.out.print("금액 입력 :  ");
		//4) 입력메소드 사용
		int money = sc.nextInt();
		//5) 메시지 출력 / 부를수 있는곡 수, 잔돈 수
		int song = money/300;
		int change = money%3*100;
		System.out.println(song + "곡을 부를 수 있으며, 잔돈은 "+change+"원입니다");
//		int song = money /100 % 10;
//		int songReal = money / 1000 * 3;
//		int surcharge = 1000-song*100;
//		if(song!=0 && money<1000) {
//			System.out.println("금액이 부족합니다. " +surcharge+"원이 더 필요합니다");
//		}
//		else if(song!=0){
//			System.out.println(songReal+"곡 충전 완료 " +surcharge+"원 추가시 3곡 추가 충전");
//		}
//		else {
//			System.out.println(songReal+"곡 충전 완료");
//		}
		sc.close();
	}
}

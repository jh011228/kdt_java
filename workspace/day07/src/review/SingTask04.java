package review;

import java.util.Scanner;

public class SingTask04 {
	public static void main(String[] args) {
//		3) 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
//	음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다
//		클래스명 : SingTask04
//		4) 총 부른 곡 수에 따른 보너스 곡 지급
//		5곡을 부르면 1곡 추가 제공
		//
		//1) 입력클래스 import
	    //2) 정수형 변수 1개 선언
	    //3) 입력 메시지 출력 1개
	    //4) 변수 입력메소드사용(nextInt())
		//+ 변수 한개 생성 보너스
		//if 문 생성
	    //5) 출력(2개)      
	    //+) sc.close();
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int price = sc.nextInt();
		int songM = 200, drink = 100;  
		int bonus = 5;
		int songAble = price/songM;
		//가격 = 0 배제
		if(price==0) {
			System.out.print("0원은 입력할 수 없습니다");
			return;
		}
		System.out.print("가능한곡 수 : "+songAble+" 부를 곡 수 : ");
		int song = sc.nextInt();
		int usedM = song * songM; 
		int changeM = price - usedM;
		int changeMd = changeM-drink;
		//가격 != 0, 노래가능횟수 0 배제
		if(songAble==0) {
			System.out.println("가능한 곡 수가 없습니다. 금액을 다시 입력해주세요");
			return;
		}
		//가격 !-= 0, 노래가능횟수보다 부를곡수가 큰경우 배제
		if(songAble - song < 0) {
			System.out.println("금액이 부족합니다 "+(songM-changeM)+"원이 더 필요합니다");
		}
		else {
			//노래가능횟수가 보너스보다 많으면
			if(song>=bonus) {
				System.out.println("총 부를 곡 수 : "+song+"곡 보너스 " +(song/bonus)+"곡 추가해서 총 부를곡수 : "+(song+song/bonus)+"곡");
				//잔돈이 음료수비용보다 크거나 같으면
				if(changeM-drink>=0) {
					System.out.println("잔돈은 "+changeM+"원 입니다.");
					System.out.println("음료를 마시고 싶으면 "+song+"곡을 부를 수 있으며 잔돈은 "+changeMd+"원 입니다.");			
				}
				//잔돈이 음료수비용보다 작으면
				else {
					System.out.println("잔돈은 "+changeM+"원 입니다.");
					song -=1;
					changeMd += songM;
					System.out.println("음료를 마시고 싶으면 "+song+"곡을 부를 수 있으며 잔돈은 "+changeMd+"원 입니다.");
				}		
			}
			//노래가능횟수보다 보너스가 적으면
			else {	
				System.out.println("총 부를 곡 수 : "+song+"곡");
				//잔돈이 음료수 비용보다 크거나 같으면
				if(changeM-drink>=0) {
					System.out.println("잔돈은 "+changeM+"원 입니다.");
					System.out.println("음료를 마시고 싶으면 "+song+"곡을 부를 수 있으며 잔돈은 "+changeMd+"원 입니다.");			
				}
				//잔돈이 음료수 비용보다 작으면
				else {
					System.out.println("잔돈은 "+changeM+"원 입니다.");
					song -=1;
					changeMd += songM;
					System.out.println("음료를 마시고 싶으면 "+song+"곡을 부를 수 있으며 잔돈은 "+changeMd+"원 입니다.");
				}		
			}			
		}
		sc.close();
	}
}

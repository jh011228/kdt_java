package singTask;

import java.util.Scanner;

public class SingTask03 {
	public static void main(String[] args) {
//		클래스명 : SingTask03
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
		int songM = 200; 
		int bonus = 5;
		int songAble = price/songM;
		System.out.print("가능한곡 수 : "+songAble+" 부를 곡 수 : ");
		int song = sc.nextInt();
		int usedM = song * songM;  
		int changeM = price - usedM; 
		if(songAble - song < 0) {
			System.out.println("금액이 부족합니다 "+(songM-changeM)+"원이 더 필요합니다");
		}
		else {
			if(song>=bonus) {
				System.out.println("총 부를 곡 수 : "+song+"곡 보너스 " +(song/bonus)+"곡 추가");
				System.out.println("잔돈은 "+changeM+"원 입니다.");
				
			}
			else {	
				System.out.println("총 부를 곡 수 : "+song+"곡");
				System.out.println("잔돈은 "+changeM+"원 입니다.");
			}			
		}
		sc.close();
	}
}

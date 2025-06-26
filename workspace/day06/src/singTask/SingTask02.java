package singTask;

import java.util.Scanner;

public class SingTask02 {
//	3) 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
//	금액입력 : 1000
//	[출력]
//	5곡을 부를 수 있으며 잔돈은 0원입니다
//	음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다
	 //1) 입력클래스 import
    //2) 정수형 변수 1개 선언
    //3) 입력 메시지 출력 1개
    //4) 변수 입력메소드사용(nextInt())
		//+ 변수 두개 생성 곡 200원, 음료 100원
		//if 문 생성
    //5) 출력(2개)
	// if 문 안에 변수 변경
    //+) sc.close();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int price = sc.nextInt();
		int song = 200, drink = 100; 
		
		int songAble = price/song;
		int changeM = price%song;
		int changeMd = changeM-drink;
		
		System.out.println(songAble+"곡을 부를 수 있으며 잔돈은 "+changeM+"원입니다");
		if(changeM-drink>=0) {
			System.out.println("음료를 마시고 싶으면 "+songAble+"곡을 부를 수 있으며 잔돈은 "+changeMd+"원 입니다.");			
		}
		else {
			songAble -=1;
			changeMd += song;
			System.out.println("음료를 마시고 싶으면 "+songAble+"곡을 부를 수 있으며 잔돈은 "+changeMd+"원 입니다.");
		}
		sc.close();
	}
}

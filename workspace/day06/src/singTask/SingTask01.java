package singTask;

import java.util.Scanner;

public class SingTask01 {

	public static void main(String[] args) {
	      //1) 입력클래스 import
	      //2) 정수형 변수 2개 선언
	      //3) 입력 메시지 출력 2개
	      //4) 변수 입력메소드사용(nextInt())
			//+ 변수 두개 생성
			//if 문 생성
	      //5) 출력(2개)      
	      //+) sc.close();
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 :");
		int price = sc.nextInt();
		System.out.print("곡 당 가격 입력 :");
		int song = sc.nextInt();
		int songM = price/song;
		int changeM = price%song;
		int songP = song-price;
		if(price-song<0) {
			System.out.println("입력한 금액은 "+price+"원입니다. 곡당 가격은 "+song+"원으로 "+songP+"원이 부족하여 노래를 부를 수 없습니다.");
		}
		else {			
			System.out.println(songM+"곡을 부를 수 있으며 잔돈은 "+changeM+"원입니다.");
		}
		
		sc.close();
	}

}

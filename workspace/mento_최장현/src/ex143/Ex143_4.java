package ex143;

import java.util.Random;

public class Ex143_4 {
	public static void main(String[] args) {
		//반복횟수 샐 count 생성
		//무한반복으로 성공할때까지 시도
		//dice1,dice2 에 1~6 랜덤 숫자 생성
		//만약 dice1이랑 dice2의 숫자가 같으면 dice1이나 dice2중 아무거나 출력하고 반복횟수 출력후 반복종료
		//그 아래 count 1씩 증가
		Random r = new Random();
		int count = 1;
		while(true) {
			int dice1 = r.nextInt(6)+1;
			int dice2 = r.nextInt(6)+1;
//			System.out.println(dice1);
//			System.out.println(dice2);
			if(dice1==dice2) {
				System.out.println("주사위 눈은 : "+dice1);
				System.out.println("반복 횟수는 : "+count);
				break;
			}
			count++;
		}
	}
}

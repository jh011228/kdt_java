package ex143;

import java.util.Random;

public class Ex143_4 {
	public static void main(String[] args) {
		Random r = new Random();
		int count = 1;
		while(true) {
			int dice1 = r.nextInt(6)+1;
			int dice2 = r.nextInt(6)+1;
			System.out.println(dice1);
			System.out.println(dice2);
			if(dice1==dice2) {
				System.out.println("주사위 눈은 : "+dice1);
				System.out.println("반복 횟수는 : "+count);
				break;
			}
			count++;
		}
	}
}

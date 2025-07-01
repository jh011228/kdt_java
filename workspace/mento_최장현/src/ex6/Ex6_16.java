package ex6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_16 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = r.nextInt(45)+1;
		}
//		for(int i : lotto) {
//			System.out.println(i);
//		}
		Scanner sc = new Scanner(System.in);
		int[] myLotto = new int[6];
		System.out.println("당첨 숫자 6개를 차례대로 입력해주세요 >>");
		for(int i=0;i<myLotto.length;i++) {
			myLotto[i] = sc.nextInt();
		}
		boolean[] isTrue = new boolean[6];
		for(int i=0;i<myLotto.length;i++) {
			if(lotto[i]!=myLotto[i]) {
				isTrue[i] = false;				
			}
			else {
				isTrue[i] = true;
			}
		}
		if(isTrue[0]==true&&isTrue[1]==true&&isTrue[2]==true&&isTrue[3]==true&&isTrue[4]==true&&isTrue[5]==true) {
			System.out.println("번호 당첨!!");
		}
		else {
			System.out.println("번호는 당첨되지 못했습니다.");
			System.out.print("당첨번호 : ");
			for(int i : lotto) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}

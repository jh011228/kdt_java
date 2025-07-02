package ex177;

import java.util.Arrays;
import java.util.Random;

public class Ex177_3 {
	public static void main(String[] args) {
		int[] card = new int[100];
		int[] cjftn = new int[10];
		for(int i=0;i<card.length;i++) {
			card[i] = i+1;
		}
		Random r = new Random();
		for(int i=0;i<cjftn.length;i++) {
			int count = card[r.nextInt(100)];
			System.out.println(count);
			cjftn[i] = count;
			for(int j=0;j<i;j++) {
				if(cjftn[j]==count) {
					cjftn[j] = card[r.nextInt(100)];
				}
			}
		}
		System.out.println("철수가 뽑은 숫자는 : "+Arrays.toString(cjftn));
	}
}

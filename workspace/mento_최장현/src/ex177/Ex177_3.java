package ex177;

import java.util.Arrays;
import java.util.Random;

public class Ex177_3 {
	//1. 1~100까지 들어있는 배열한개, 철수가 가지고있는 10개짜리 배열한개 생성
	//2. 랜덤객체 생성후 10번 반복
	//+)검사할때 계속반복해서 검사해야함.
	//3. count 변수 만들어서 card[r.nextInt(100)]으로 1~100까지 수중에 하나를 count에 넣음
	//4. boolean 으로 중복 제거 검사 만들고
	//5. 반복문으로 숫자하나 나올때마다 모든 숫자 검사하면서 count 랑 철수가 가지고간 배열안의 수랑 같은지 검사해서 틀리면 break
	//6. 검사통과시 철수 배열 안에 숫자 넣고 break 해서 반복문 으로 다시돌아감 
//	  7.Arrays.toString으로 10개 찍어냄
	public static void main(String[] args) {
		int[] card = new int[100];
		int[] cjftn = new int[10];
		for(int i=0;i<card.length;i++) {
			card[i] = i+1;
		}
		Random r = new Random();
		for(int i=0;i<cjftn.length;i++) {
			while(true) {
				int count = card[r.nextInt(100)];
//				System.out.println(count);
				boolean isTrue = true;
				for(int j=0;j<i;j++) {
					if(cjftn[j]==count) {
//						System.out.println("중복발생");
						isTrue = false; 
						break;
					}
				}
				if(isTrue) {
					cjftn[i] = count;
					break;
				}
			}
		}
		System.out.println("철수가 뽑은 숫자는 : "+Arrays.toString(cjftn));
	}
}

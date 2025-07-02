package ex6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex6_16 {
	public static void main(String[] args) {
		//1.lotto 배열에 6자리 넣기
		//2. 랜덤클래스로 lotto[i]안에 1~45 숫자중 랜덤으로 넣기
		//3. 중복제거
		//4. 당첨숫자 6개 입력받아서 자리수까지 맞는지 확인
		//5.맞으면 당첨 출력 틀리면 당첨되지 않았습니다, 당첨번호가 뭐였는지 출력
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i=0;i<lotto.length;i++) {
			int num = r.nextInt(45)+1;
			boolean noJ = true;
			for(int j=0;j<i;j++) {
				if(lotto[j]==num) {
					noJ = false; 
					break;
				}
			}
			if(noJ) {
				lotto[i] = num;
			}
			else {
				i--;
			}
			
			
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
			System.out.println("당첨번호 : " +Arrays.toString(lotto));
		}
		sc.close();
	}
}

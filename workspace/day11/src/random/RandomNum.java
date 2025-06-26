package random;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Random r = new Random();
		System.out.print("난이도 설정 1~5 : ");
		int level = sc.nextInt();
		Level v1 = new Level();
		int result = r.nextInt(v1.levelSetting(level));
		System.out.println(result);
		while(true) {
			System.out.print("정답을 입력하세요 : ");
			int user = sc.nextInt();
			
			if(user==result) {
				break;
			}
			
		}
		System.out.println("정답!!");
		sc.close();
	}
}

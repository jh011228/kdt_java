package scanner;

import java.util.Scanner;

//9번 : 입력 메소드 실습1
public class ScannerTask01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("성별 입력 : ");
		char gender = sc.next().charAt(0);
//		System.out.println("이름과 성별을 띄어쓰기로 입력하세요 : ");
//		String name, gender;
//		name = sc.next();
//		gender = sc.next();
		System.out.println("이름은 "+name+"이고 "+gender+"성입니다.");
		sc.close();
	}
}

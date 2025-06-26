package test;

import java.util.Scanner;

public class StarTask01 {
	public static void main(String[] args) {

//		//기본형
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//입력받는 기본형
//		Scanner sc = new Scanner(System.in);
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		for(int i=1;i<=row;i++) {
//			for(int j=1;j<=col;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		떨어져있는 직각 삼각형
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j<=4;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		//붙어있는 직각삼각형
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		//거꾸로된 직각삼각형
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 이등변삼각형
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j <= 4; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 이등변삼각형2
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j <= 4; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		// 다이아몬드
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j <= 4; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=10-i*2-1;j++) {
////				System.out.println("i = "+i + ", j = "+j);
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//입력받은 다이아몬드
//		Scanner sc = new Scanner(System.in);
//		int dia = sc.nextInt();
//		
//		for (int i = 1; i <= dia; i++) {
//			for (int j = i; j <= dia-1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=dia;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=(dia*2)-i*2-1;j++) {
////				System.out.println("i = "+i + ", j = "+j);
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//구구단 ?? 어떤구구단 
		//ver1 숫자하나 입력하면 2단부터 입력한 단까지 나온다.
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
//		for(int i = 2; i<=number1;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.print(i + "x"+j+" = "+i*j + "  ");
//			}
//			System.out.println(i+"단 끝");
//		}
//		//ver2 숫자 두개 입력해서 처음입력한 단부터 두번째 입력한 단까지 나온다.
//		int number2 = sc.nextInt();
//		for(int i = number1; i<=number2;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.print(i + "x"+j+" = "+i*j + "  ");
//			}
//			System.out.println(i+"단 끝");
//		}
	}
}

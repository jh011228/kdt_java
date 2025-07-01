package ex5;

public class Ex5_4 {
	public static void main(String[] args) {
		for(int i=0;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=14-i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

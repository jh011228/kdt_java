package ex143;

public class Ex143_6 {
	public static void main(String[] args) {
		//1,3,5,7 별찍기
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print("  ");
				
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

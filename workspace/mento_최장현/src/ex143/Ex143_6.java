package ex143;

public class Ex143_6 {
	public static void main(String[] args) {
		//1,3,5,7 별찍기
		//0부터 4까지 4번 반복
		for(int i=0;i<4;i++) {
			//0부터 3-i번씩 "  " 공백 두번씩 찍기
			for(int j=0;j<3-i;j++) {
				System.out.print("  ");
				
			}
			//0부터 i*2+1번씩 증가하며 *+" " 찍기
			for(int j=0;j<i*2+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

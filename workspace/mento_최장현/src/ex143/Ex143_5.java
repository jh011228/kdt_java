package ex143;

public class Ex143_5 {
	public static void main(String[] args) {
		//1,2,3,4 별찍기
		for(int i=0;i<4;i++) {
			//3부터 1씩줄어들어야함
			//3,2,1,0
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
				
			}
			//1부터 4까지 늘어나야함
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		
	}
}

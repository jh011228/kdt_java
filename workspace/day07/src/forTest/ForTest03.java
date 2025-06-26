package forTest;

public class ForTest03 {
	public static void main(String[] args) {
		//1부터 10까지 출력하기
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		//1부터 10까지 중 5까지만 출력
		for(int i=0;i<=9;i++) {
			System.out.println(i+1);
			if(i==4) {
				break;
			}
			System.out.println("출력 끝");
		}
		//1부터 10까지중 5만 제외하고 출력하기
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}

}

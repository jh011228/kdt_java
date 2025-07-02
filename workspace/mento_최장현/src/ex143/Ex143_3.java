package ex143;

public class Ex143_3 {
	public static void main(String[] args) {
		//a = 0 대입
		//i가 1부터 100까지 100번 반복
		//i%2 == 0이면 짝수로 인식해 a에 i를 더하기
		//a출력
		int a = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				a +=i;				
			}
		}
		System.out.println(a);
	}
}

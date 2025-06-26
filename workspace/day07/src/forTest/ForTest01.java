package forTest;
//4번 : for 문
public class ForTest01 {
	public static void main(String[] args) {
		
		//for(초기식; 조건식; 증감식){}
//		
//		for(int i=0;i<10;i++ ) {//10번 반복
//			//정수형 i 가 0일때부터 10보다 작아질 때 까지 i 를 1씩 증가시키면서 반복
//			System.out.println(i + "번 행복하다");//행복하다 출력
////			break;//멈추기
//		}
//		
//		for(int i = 1;i<10;i++) {
//			System.out.println(i);
//		}
//		
		//이름 10번 출력
		//초기식 i = 0 
//		for(int i=0;i<10;i++) {
//			System.out.println(i+1+"번 : 최장현");
//		}
		//for문 사용 
		//for 초기식 	=> int i=10		int i =0	int i= 1
		// 조건식		=> i > 0		i < 10		i <= 10		i < 11
		// 증감식		=> i--			i++			i++			i++
		//출력		=> i번쨰			10- i번째	11- i 번째
		for(int i=10;i>0;i--) {
			//정수형 i 가 10일때부터 0보다 커질 때 까지 i 를 1씩 감소시키면서 반복
			System.out.print(10 - i+" 번째\t");//10에서 i를 뺀 값 번째 + 탭키 반복
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			//정수형 i 가 10일때부터 0보다 커질 때 까지 i 를 1씩 감소시키면서 반복
			System.out.println(i+" 번째"); //i 번째 반복
		}
		//첫번째
//		초기식 i = 0		조건식 0 < 10		true	중괄호	10 - 0이므로 10번째 출력	증감식 i++
//		현재 i = 1로 증가

		//두번째
//		초기식 i = 1		조건식 1 < 10		true	중괄호	10 - 1이므로 9번째 출력		증감식 i++
//		현재 i = 2로 증가

		//세번째
//		초기식 i = 2		조건식 2 < 10		true	중괄호	10 - 2이므로 8번째 출력		증감식 i++
//		현재 i = 3로 증가
		
		int result = 0;//result 에 0 대입
		//1부터 10까지 더해서 출력
		for(int i=1;i<=10;i++) {
			result +=i;
		}
		System.out.println(result);
		
	}
}

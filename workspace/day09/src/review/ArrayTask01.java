package review;

public class ArrayTask01 {

	public static void main(String[] args) {
		//100~1까지 값 배열에넣고 출력
		// 100자리 있는 int 배열 생성
		// 0부터 length까지 반복
		// 배열명[i] = 배열명.길이-i
		// 반복문으로 100번 출력해서 숫자 다 찍기
		int[] hun = new int[100];
		for(int i=0;i<hun.length;i++) {
			hun[i] = hun.length-i;
		}
		for(int i =0;i<hun.length;i++) {
			System.out.println(hun[i]);
		}
	}	
}

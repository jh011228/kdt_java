package review;

public class ArrayTask02 {
	public static void main(String[] args) {
		//1~10까지 값 배열 넣고 총 합 출력
		
		//int 배열 안에 1부터 10까지 넣기
		//plus 변수 생성해서 총합 계산
		//10번 반복해서 plus에 1부터 10까지 합하기
		//총합 출력
		int [] ten = new int[10];
		int plus = 0;
		for(int i=0;i<ten.length;i++) {
			ten[i] = i+1;
			plus += ten[i];
		}
		System.out.println("총합 : "+plus);
		
	}
}

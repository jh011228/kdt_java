package homework08;

public class ArrayTask02 {
	public static void main(String[] args) {
		//1~10까지 값 배열 넣고 총 합 출력
		int [] ten = {1,2,3,4,5,6,7,8,9,10};
		int plus = 0;
		for(int i=0;i<ten.length;i++) {
			plus += ten[i];
		}
		System.out.println("총합 : "+plus);
		
	}
}

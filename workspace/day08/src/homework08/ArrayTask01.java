package homework08;

public class ArrayTask01 {

	public static void main(String[] args) {
		//100~1까지 값 배열에넣고 출력
		int[] hun = new int[100];
		for(int i=0;i<hun.length;i++) {
			hun[i] = hun.length-i;
		}
		for(int i : hun) {
			System.out.println(i);
		}
	}	
}

package review;

public class ArrayTask04 {
	public static void main(String[] args) {
		//0 1 2 3 0 1 2 3 담고 출력
		//8자리 새로운 배열 생성
		//8번 반복해서 a배열 안에 0123 반복해서 들어갈수 있게 반복
		// 출력
		int[] a = new int[8];
		for(int i=0;i<a.length;i++) {
			a[i] = i % 4;
		}
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}

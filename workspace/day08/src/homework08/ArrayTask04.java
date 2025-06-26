package homework08;

public class ArrayTask04 {
	public static void main(String[] args) {
		//0 1 2 3 0 1 2 3 담고 출력
		int[] a = new int[8];
		for(int i=0;i<a.length;i++) {
			a[i] = i % 4;
		}
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}

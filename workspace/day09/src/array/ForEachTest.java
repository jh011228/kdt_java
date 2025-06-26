package array;
//1번 : for-each문(빠른 for 문, 확장 for 문)
public class ForEachTest {
	public static void main(String[] args) {
		//1부터 5까지의 값을 담은 배열 선언
		int[] ar1 = new int[5];
		//값 대입 반복문
		for(int i=0;i<ar1.length;i++) {
			ar1[i] = i+1;
		}
		//값 출력 반복문
//		for(int i=0;i<ar1.length;i++) {
//			System.out.print(ar1[i]+ " ");
//		}
//		System.out.println();

		//for-each문
		int sum = 0;
		for(int num : ar1) {
			System.out.print(num+" ");
			sum += num;
		}
		System.out.println();
		System.out.println(sum);		
		
	}
}

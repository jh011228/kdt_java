package array;
//5번 : 배열 사용(저장공간과 값)
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arData = {5,2,6,4};
		System.out.println(arData);// 배열의 시작주소값(참조값)
//		System.out.println(arData.length);
		
		for(int i = 0;i<arData.length;i++) {
			System.out.println(arData[i]);
		}
		
		arData[0] = arData[1] + arData[3];
		System.out.println(arData[0]);
		
		int[] arData2 = new int[10];
		for(int i=0;i<arData2.length;i++) {
			arData2[i] = i+1;
		}
		for(int i : arData2) {
			System.out.print(i + " ");
		}
	}

}

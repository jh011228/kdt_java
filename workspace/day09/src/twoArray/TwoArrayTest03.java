package twoArray;
//5번 : 2차원 배열 연습
public class TwoArrayTest03 {
	public static void main(String[] args) {
		
		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
		
		//배열명  ar1 값 넣고 출력
		int[][] ar1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i=0;i<ar1.length;i++) {
			for(int j=0;j<ar1[i].length;j++) {
				System.out.print(ar1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		//2. 배열명 ar2 칸수만 선언
		int[][] ar2 = new int[3][4];
		//ar2 크기만 지정된 2차원 배열 3개의 행과 4개의 열
		int value = 1;
		for(int i=0;i<ar2.length;i++) {
			for(int j=0;j<ar2[i].length;j++) {
				ar2[i][j] = value;
				value++;
			}
		}
	
		for(int i=0;i<ar2.length;i++) {
			for(int j=0;j<ar2[i].length;j++) {
				System.out.print(ar2[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}

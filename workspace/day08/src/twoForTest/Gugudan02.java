package twoForTest;

public class Gugudan02 {
	public static void main(String[] args) {

		// 로직구성
		
//		반복문1 : 2~9까지 반복
//			바깥쪽 출력문 : i단
		
		//바깥 for 문 int i = 1; i <= 9; i++
		//안쪽 for 문 int j = 2; j <= 9; j++
//			안쪽 출력문 : j +"x"+ i + "=" + j*i+"\t"
		
		for(int i=2;i<=9;i++) {
			System.out.print(i+"단\t");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j +"x"+ i + "=" + j*i+"\t");
			}
			System.out.println();
		}

	}

}

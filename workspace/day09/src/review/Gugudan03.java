package review;

public class Gugudan03 {
	public static void main(String[] args) {
		//k = 1, 4, 7
		for(int k=1;k<=9;k+=3) {
			//i = 1, 2, 3 
			for(int i=1;i<=3;i++) {
				System.out.print(i+k-1+"단\t");
			}
			System.out.println();
			//i = 1,2,3,4,5,6,7,8,9
			for (int i = 1; i <= 9; i++) {
				// j = 123,456,789
				for (int j =k; j <= k+2; j++) {
					System.out.print(j +"x"+ i + "=" + j*i+"\t");
				}
				System.out.println();
			}
			
		}
	}
}

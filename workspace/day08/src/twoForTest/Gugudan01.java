package twoForTest;



public class Gugudan01 {
	
	public static void main(String[] args) {
		//바깥 for 문 i=2,i<=9;i++
		//안쪽 for 문 j=1;j<=9;j++
//			바깥쪽 출력문 : 2단
//			안쪽 출력문 : i "x" j "=" i*j + " "
		for(int i = 2; i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i + "x"+j+" = "+i*j + "  ");
			}
		}

	}

}

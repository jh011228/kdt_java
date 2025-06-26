package review;
//1번 : 연산자 복습
public class Oper {
	public static void main(String[] args) {
		int num1 = -4; //num1 변수에 -8 대입
		System.out.println(num1 >> 1); //-4 출력
		System.out.println(num1 >>> 1);//2147483644 출력
		System.out.println(Integer.toBinaryString(num1));//11111111111111111111111111111100 출력
		System.out.println(Integer.toBinaryString(num1 >>> 1));//1111111111111111111111111111110 출력
	}
}

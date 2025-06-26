package review;

//		4) while 문만 이용 구구단 출력(단별로 가로로 출력하기)
public class Gugudan04 {
	public static void main(String[] args) {
		//count1 = 왼쪽 숫자
		//count2 = 오른쪽 숫자
		int menu = 2;
		//메뉴가 10보다 작으면 menu + "단"을 탭해서 계속 출력하고 메뉴를 1씩올린다
		while (menu < 10) {
			System.out.print(menu + "단\t");
			menu++;
		}
		System.out.println();
		int count2 = 1;
		//가로 1줄씩 9번 찍어낸다.
//		count2가10보다 작으면 계속 반복한다 
		while(count2<10) {
			int count1 = 2;
//			count1이 10보다작으면 예)2x1=2	3x1=3	4x1=4	5x1=5	6x1=6	7x1=7	8x1=8	9x1=9	식으로 출력
			while (count1 < 10) {
				System.out.print(count1 + "x" + count2 + "=" + count1 * count2 + "\t");
				count1++;
			}
			count2++;
			System.out.println();
		};
		
	}
}

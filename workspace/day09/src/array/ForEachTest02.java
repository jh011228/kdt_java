package array;
//2) 3과목 점수의 총합과 평균점수 구하기(for-each문만 이용)
public class ForEachTest02 {
	public static void main(String[] args) {
		int[] scores = {100,88,99};
		
		int plus = 0;
		for(int i : scores) {
			plus += i;
		}
		double avg = plus/3.0;
		System.out.printf("3과목 점수의 총합은 %d점이고, 평균점수는 %.2f점입니다" ,plus,avg);
	}
}

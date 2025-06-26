package twoForTest;
//1번 : 이중 for 문 기본
public class TwoForTest01 {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {//바깥 for 문 //행
//			System.out.print(i);
			for(int j=1;j<5;j++) {//안쪽 for 문 //열 
//				System.out.print("i : "+i+", j : "+j);
				System.out.print(i+j);
			}
			System.out.println();
		}
	
		
//		1. 바깥 for 문 시작
//			1-1) 초기식 i 를 1로 초기회
//				조건식 i < 3 조건을 검사 => 1 < 3 true 이면 바깥 for 문 중괄호 영역 안으로 들어간다
//		2. 안쪽 for 문 시작	
//			2-1) 초기식 j 를 1로 초기화
//				조건식 j < 3 조건을 검사 => 1 < 3 true 이면 안쪽 for 문 중괄호 영역 안으로 들어간다
//			2-2) 출력메소드		System.out.println("i : " + i + ", j : " + j);
//				출력 결과 = > i : 1 , j = 1
//		3. 안쪽 for 문 계속 진행	
//			3-1) 증감식으로 이동 j 가 1증가 (j++) 현재 j 의 값 : 2
//			3-2) 조건식	j < 3 조건 검사 => 2 < 3 true 이면 안쪽 for 문 중괄호 영역 안으로 들어간다
//			3-3) 출력메소드		System.out.println("i : " + i + ", j : " + j);
//			출력결과 => i : 1, j : 2
//		4. 안쪽 for 문 계속 진행
//			4-1) 증감식으로 이동 j 가 1 증가(j++) 현재 j 의 값 : 3
//			4-2) 조건식	j < 3 조건 검사 => 3 < 3 false
//			4-3) 안쪽 for 문 중괄호 밖, 바깥쪽 for 문 중괄호 안의 내용이 있다면 해당 내용 실행
//		5. 바깥 for 문 계속 진행
//			5-1) 증감식이동		i 가 1증가(i++)	현재 i 의 값 : 2
//			5-2) 조건식	i < 3 조건 검사 => 2 < 3 true
//		6. 안쪽 for 문 시작
//		2~5 계속 반복
		
	}

}

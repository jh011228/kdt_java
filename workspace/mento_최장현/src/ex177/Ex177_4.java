package ex177;

import java.util.Arrays;

public class Ex177_4 {
	public static void main(String[] args) {
		int[][] ma = new int[5][5];
		//	0,2 -> 4,3 -> 3,4 -> 2,0 -> 1,1 -> 1,2 -> 0,3 -> 4,4 -> 3,0 -> 4,0 -> 3,1
		//기본적으로 아래로, 오른쪽으로 감 ↓→ 왼쪽 - 1, 오른쪽 +1 근데 4 넘어가면 0번이됨 %5==0
		//근데 이미 숫자가 있으면 위로 하나 올라감 ↑ if 자릿수 숫자 !=0, 왼쪽 +1
		
		//1. 왼쪽 0, 오른쪽 2로 시작
		//2. 25번 반복
		//3. ma[0][2] = 1
		//4. 다음왼쪽 = (5+left-1)%5 = 4, 다음오른쪽 = (right+1)%5 = 3
		//5. if 문으로 만약 숫자가 있으면 왼쪽에 하나 올림
		//6. 아니면 그냥 넣음
		//7. 출력
		int left = 0;
		int right = 2;
		
		for(int i=1;i<=25;i++) {
			ma[left][right] = i;
			int nextLeft = (5+left-1)%5;
			int nextRight = (right+1)%5;
			if(ma[nextLeft][nextRight]!=0) {
				left = (left+1)%5;
			}
			else {
				left = nextLeft;
				right = nextRight;
			}
			
		}
			System.out.println(Arrays.deepToString(ma));			
	}
}

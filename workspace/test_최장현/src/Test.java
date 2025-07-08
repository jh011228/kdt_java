import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int count = sc.nextInt();
		
			String[] arr = new String[count];
			boolean[] alpha = new boolean[26];
			int countScore = 0;
			boolean isTrue = false;
			for(int k=0;k<count;k++) {
				arr[k] = sc.next();
				for(int i=0;i<arr[k].length();i++) {
					if(alpha[arr[k].charAt(i)-'a']==false) {
						alpha[arr[k].charAt(i)-'a'] = true; 					
					}
					//옆자리인지 체크
					else {
						for(int j=0;j>i;j++) {
							int b = arr[k].charAt(i)-'a' - arr[k].charAt(j)-'a';
							if(b==0) {
								if(i-j==1||i-j==-1) {
									isTrue = true;
								}
								else {
									isTrue = false;
								}
							}
						}
					}
					
				}
				if(isTrue) {
					countScore++;
				}
			}
			System.out.println(countScore);
	}
}

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int count = sc.nextInt();
		
		String[] arr = new String[count];
			arr[0] = sc.next();
			boolean[] alpha = new boolean[26];
			int countScore = 0;
			boolean isTrue = true;
			for(int i=0;i<arr[0].length();i++) {
				alpha[arr[0].charAt(i)-'a'] = true; 
			}
			if(isTrue) {
					countScore++;
				}
			System.out.println(countScore);
	}
}

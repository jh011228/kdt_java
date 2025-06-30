package teamTask;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 0;i<1000;i++) {
			System.out.println(r.nextInt(5)+1);			
		}
	}
}

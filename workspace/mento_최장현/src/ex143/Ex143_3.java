package ex143;

public class Ex143_3 {
	public static void main(String[] args) {
		int a = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				a +=i;				
			}
		}
		System.out.println(a);
	}
}

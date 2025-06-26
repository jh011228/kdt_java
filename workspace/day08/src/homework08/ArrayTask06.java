package homework08;

public class ArrayTask06 {
	public static void main(String[] args) {
		//A~F까지 배열 넣고 출력
				char[] alpha =new char[6];
				for(int i=0;i<alpha.length;i++) {
					alpha[alpha.length-1-i] =(char)('F'-i);
				}
				for(int i=0;i<alpha.length;i++) {
					if(alpha[i]!='C') {
						System.out.println(alpha[i]);						
					}
				}
				
	}
}

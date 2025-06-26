package homework08;

public class ArrayTask07 {
	public static void main(String[] args) {
		char[] alpha = new char[26];
		for(int i=0;i<alpha.length;i++) {
			if(i%2==0){
				alpha[alpha.length-1-i] =(char)('Z'-i);				
			}
			else {
				alpha[alpha.length-1-i] =(char)('z'-i);	
			}
		}
		for(int i=0;i<alpha.length;i++) {
			System.out.println(alpha[i]);			
		}
	}
}

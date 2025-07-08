package day20_최장현;

public class ZeroHunException extends Exception {

	public ZeroHunException() {
		System.err.println("숫자는 0부터 100 사이여야 합니다.");
	}
	
}

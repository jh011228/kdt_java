package homework17;

public class NomoneyException extends Exception {
	public NomoneyException() {
		super("출금불가");
	}
}

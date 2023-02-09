package ezen.ams;

public class NotSufficientBalnceException extends Exception {
	// String message

	private int errorCode;

	public NotSufficientBalnceException() {
		this("예기치 않은 예외가 발생하였습니다.", 0);
	}

	public NotSufficientBalnceException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	@Override
	public String toString() {
		return "오류코드: " + errorCode + ", 오류메시지:" + getMessage();
	}

}

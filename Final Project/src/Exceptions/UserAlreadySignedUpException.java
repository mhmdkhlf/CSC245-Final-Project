package Exceptions;

@SuppressWarnings("serial")
public class UserAlreadySignedUpException extends Exception {
	
	public UserAlreadySignedUpException() {
		super();
	}
	public UserAlreadySignedUpException(String message) {
		super(message);
	}
	
}

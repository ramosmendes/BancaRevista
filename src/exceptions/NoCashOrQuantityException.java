package exceptions;

public class NoCashOrQuantityException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoCashOrQuantityException(String msg) {
		super(msg);
	}

}

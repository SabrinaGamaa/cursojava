package model.exception;

//RuntimeException Não obriga a tratar
//Exception é onrigado a tratar
public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}

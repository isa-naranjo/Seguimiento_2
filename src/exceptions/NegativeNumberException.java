package exceptions;

public class NegativeNumberException extends RuntimeException{
	
	public NegativeNumberException(String ing,double weigth) {
		super("No se puede usar n�meros negarivos "+weigth+" para el ingrediente "+ing);
		
	}
	

}

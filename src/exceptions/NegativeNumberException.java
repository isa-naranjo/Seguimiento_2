package exceptions;

public class NegativeNumberException extends RuntimeException{
	
	public NegativeNumberException(String ing,double weigth) {
		super("No se puede usar números negarivos "+weigth+" para el ingrediente "+ing);
		
	}
	

}

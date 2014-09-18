package MainPackage;

public class InsufficientFundsException extends Exception {
	
	public static final long serialVersionUID = 1L;
	
	private double amount;
	
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}
	
	public double getAmount(){
		return this.amount;
	}
	
}


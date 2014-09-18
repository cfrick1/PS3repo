package MainPackage;

public class Account {

	private int id = 0;
	
	private double balance = 0;
	
	private double annualInterestRate = 0;
	
	private java.util.Date dateCreated;
	
	public Account(){
	this.dateCreated = new java.util.Date();	
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		this.dateCreated = new java.util.Date();
	}

	public int getid(){
		return this.id;
	}

	public double getbalance(){
		return this.balance;
	}

	public double getannualInterestRate(){
		return this.annualInterestRate;
	}

	public void setid(int id){
		this.id = id;
	}

	public void setbalance(double balance){
		this.balance = balance;
	}

	public void setannualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	public java.util.Date getDate(){
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return this.annualInterestRate/12;
	}

	public void withdraw(double amount) throws InsufficientFundsException{
		if (amount <= balance)
			this.balance -= amount;
		else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public void deposit(double amount){
		this.balance += amount;
	}

}

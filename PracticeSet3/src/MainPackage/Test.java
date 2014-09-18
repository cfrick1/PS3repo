package MainPackage;

public class Test {
	public static void main(String[] args) {
		
		Account test = new Account(1122, 20000);
		test.setannualInterestRate(0.045);
		try{
			test.withdraw(2500);
		}
		catch(InsufficientFundsException ex){
			System.out.println("Error, Insufficient Funds.");
		}
		test.deposit(3000);
		System.out.printf("This account has a balance of: $%.2f", test.getbalance());
		System.out.printf("\nThis account has a monthly interest of %.2f per cent", 100*test.getMonthlyInterestRate());
		System.out.println("\nThis account was created on " + test.getDate());
	}
	
}

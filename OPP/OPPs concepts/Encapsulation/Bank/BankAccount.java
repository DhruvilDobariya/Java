public class BankAccount{
	private int balance;
	public long accountNumber;
	public String holderName;

	public BankAccount(int balance, long accountNumber, String holderName){
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	public void setBalance(int balance){
		if(balance<1000){
			System.out.println("Min 1000Rs balance should be there");
		}
		else{
			this.balance = balance;
		}
	}

	public int getBalance(){
		return this.balance;
	}

	public void printBalance(){
		System.out.println("Balance for "+ holderName + " = "+ balance);
	}
}
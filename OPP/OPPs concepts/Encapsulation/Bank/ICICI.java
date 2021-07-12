import java.util.Scanner;
public class ICICI{

	public static void main(String[] args){

		BankAccount ba1 = new BankAccount(1000,123,"arjun bala");
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter 1 to withdwaw");
			System.out.println("Enter 2 to deposite");
			System.out.println("Enter 0 to exit the program");
			int temp = sc.nextInt();
			if(temp==0){
				break;
			}
			else if(temp==1){
				System.out.println("Enter amount to withdwaw");
				temp = sc.nextInt();

				ba1.setBalance(ba1.getBalance() - temp);
			}
			else{
				System.out.println("Enter amount to deposite");
				temp = sc.nextInt();
				ba1.setBalance(ba1.getBalance() + temp);
			}
			ba1.printBalance();
		}


		

	}

}
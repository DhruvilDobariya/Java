import java.util.Scanner;

class ConstructorOverloading{
	
	public ConstructorOverloading(int a, int b) {
		System.out.println("Two number's adition is : " + (a+b));
	}
	public ConstructorOverloading(int a, int b, int c) {
		System.out.println("Three number's adition is : " + (a+b+c));
	}
}
class MethodOverloading{
	public void multiplication(int a,int b) {
		System.out.println("Two number's multiplication is : " + (a*b));
	}
	public void multiplication(int a,int b,int c) {
		System.out.println("Three number's multiplication is : " + (a*b*c));
	}
}
public class OverloadingMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 for make two number adition.");
			System.out.println("2 for make three number adition.");
			System.out.println("3 for make two number multiplication.");
			System.out.println("4 for make three number multiplication.");
			System.out.println("5 for exit.");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter first number : ");
				int a1 = sc.nextInt();
				System.out.print("Enter second number : ");
				int b1 = sc.nextInt();
				ConstructorOverloading obj1 = new ConstructorOverloading(a1,b1);
				break;
			case 2:
				System.out.print("Enter first number : ");
				int a2 = sc.nextInt();
				System.out.print("Enter second number : ");
				int b2 = sc.nextInt();
				System.out.print("Enter second number : ");
				int c1 = sc.nextInt();
				ConstructorOverloading obj2 = new ConstructorOverloading(a2,b2,c1);
				break;
			case 3:
				System.out.print("Enter first number : ");
				int a3 = sc.nextInt();
				System.out.print("Enter second number : ");
				int b3 = sc.nextInt();
				MethodOverloading obj3 = new MethodOverloading();
				obj3.multiplication(a3,b3);
				break;
			case 4:
				System.out.print("Enter first number : ");
				int a4 = sc.nextInt();
				System.out.print("Enter second number : ");
				int b4 = sc.nextInt();
				System.out.print("Enter second number : ");
				int c2 = sc.nextInt();
				MethodOverloading obj4 = new MethodOverloading();
				obj4.multiplication(a4, b4, c2);
				break;
			case 5:
				System.exit(0);
				break;
				default:
					System.out.println("Invalid input.");
			}
		}

	}

}

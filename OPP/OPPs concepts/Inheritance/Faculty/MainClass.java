import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("1 for collage faculty.");
			System.out.println("2 for school faculty.");
			System.out.println("3 for exit.");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
				CollageFaculty cF = new CollageFaculty();
				cF.display();
				break;
				case 2:
				SchoolFaculty sF = new SchoolFaculty();
				sF.display();
				break;
				case 3:
				System.exit(0);
				break;
				default:
				System.out.println("Invalid input.");
			}
		}
	}
}

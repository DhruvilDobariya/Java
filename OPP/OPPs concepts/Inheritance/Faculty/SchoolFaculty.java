import java.util.Scanner;

public class SchoolFaculty extends Faculty {  //  Sub Class.
    double parsantegeOfBed;

	public SchoolFaculty(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your parsantegeOfB.ed : ");
        parsantegeOfBed = sc.nextDouble();
	}
	public void display(){
		System.out.println("Your name is : "+ name);
        System.out.println("Your contectNo is : "+ contectNo);
        System.out.println("Your address is : "+ address);
        System.out.println("Your experience is : "+ experience);
		System.out.println("Your parsantegeOfB.ed is : "+ parsantegeOfBed);
	}
}

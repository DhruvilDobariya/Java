import java.util.Scanner;

public class CollageFaculty extends Faculty {  //  Sub Class.
    double parsantegeOfPhd;

    public CollageFaculty(){
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your parsantegeOfPhd : ");
        parsantegeOfPhd = sc.nextDouble();
	}
    public void display(){
		System.out.println("Your name is : "+ name);
        System.out.println("Your contectNo is : "+ contectNo);
        System.out.println("Your address is : "+ address);
        System.out.println("Your experience is : "+ experience);
		System.out.println("Your parsantegeOfB.ed is : "+ parsantegeOfPhd);
	}
}

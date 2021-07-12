import java.util.Scanner;

public class Faculty {  // Super Class.
    String name;
    String contectNo;
    String address;
    int experience;

    public Faculty(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter your contectNo : ");
        contectNo = sc.nextLine();
        System.out.print("Enter your address : ");
        address = sc.nextLine();
        System.out.print("Enter your experience : ");
        experience = sc.nextInt();
    }
}
import java.util.Scanner;
public class PositiveNagative{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        while(true){
            System.out.println("");
            System.out.println("1 for find number is nagative or positive.");
            System.out.println("2 for exit.");
            System.out.print("Enter your choice : ");
            int choice = myObj.nextInt();
            System.out.println("");

            switch(choice){
                case 1:
                System.out.print("Enter a number : ");
                int a = myObj.nextInt();

                if(a >= 0){
                    System.out.println("Your number is positive.");
                }else{
                    System.out.println("Your number is nagative.");
                }
                break;
                case 2:
                System.exit(0);
                break;
                default:
                System.out.println("Your input is invalid.");

            }
        }
    }
}
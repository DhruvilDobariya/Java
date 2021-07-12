import java.util.Scanner;
public class Result {
    public static void main(String[] args){
        Scanner myObj =new Scanner(System.in);
        
        while(true){
            System.out.println("");
            System.out.println("1 for find your class.");
            System.out.println("2 for exit.");
            System.out.print("Enter your choice : ");
            int choice = myObj.nextInt();
            System.out.println("");

            switch(choice){
                case 1:
                System.out.println("Enter Subject mark out of 100");
                System.out.println("");
                
                System.out.print("Enter your 1st subject mark : ");
                int m1 = myObj.nextInt();

                System.out.print("Enter your 2ed subject mark : ");
                int m2 = myObj.nextInt();

                System.out.print("Enter your 3rd subject mark : ");
                int m3 = myObj.nextInt();

                System.out.print("Enter your 4th subject mark : ");
                int m4 = myObj.nextInt();

                System.out.print("Enter your 5th subject mark : ");
                int m5 = myObj.nextInt();

                int total = m1 + m2 + m3 + m4 + m5;
                double avg = (float)total/5;
                
                System.out.println("");
                System.out.println("Your total mark is : "+total);
                System.out.println("Your Percentage is : "+avg+" %");
                System.out.println("");

                if(avg >= 60){
                    System.out.println("You are in first division.");
                }else if(avg >= 50 && avg < 60){
                    System.out.println("You are in second division.");
                }else if(avg >= 40 && avg < 50){
                    System.out.println("You are in third division.");
                }else{
                    System.out.println("You are fail.");
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

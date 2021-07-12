import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        while(true){
            System.out.println("");
            System.out.println("1 for find max number.");
            System.out.println("2 for exit.");
            System.out.print("Enter your choice : ");
            int choice = myObj.nextInt();
            System.out.println("");

            switch(choice){
                case 1:
                System.out.print("Enter first number : ");
                int a = myObj.nextInt();
                System.out.print("Enter second number : ");
                int b = myObj.nextInt();
                System.out.print("Enter third number : ");
                int c = myObj.nextInt();
                
                if(a < b){
                    if(b < c){
                        System.out.println(c+" is greter then "+a+" and "+b);
                    }
                    else{
                        System.out.println(b+" is greter then "+a+" and "+c);
                    }
                }else{
                    if(a < c){
                        System.out.println(c+" is greter then "+a+" and "+b);
                    }else{
                        System.out.println(a+" is greter then "+b+" and "+c);
                    }
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

import java.util.Scanner;

public class Dhruv {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int x = sc.nextInt();
        /* if(x > 0){
            System.out.println(x + " is Positive");
        }
        else if(x == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println(x + " is Negative");
        }
        System.out.println("Program End!"); */

        int a = 2;
        int b = 3;
        System.out.println("Sum is : " + a+b);
        System.out.println(a+b +"Sum is : ");


        switch(x){
            case 1:
            System.out.println("Sun");
            break;
            case 2:
            System.out.println("Mon");
            break;
            case 3:
            System.out.println("Tue");
            break;
            case 4:
            System.out.println("Wed");
            break;
            default:
            System.out.println("Day not exist!");
        }
    }
}

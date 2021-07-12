import java.util.Scanner;
public class Weekday {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        while(true){
            System.out.println("");
            System.out.println("1 for find day name.");
            System.out.println("2 for exit.");
            System.out.print("Enter your choice : ");
            int choice = myObj.nextInt();
            System.out.println("");

            switch(choice){
                case 1:
                System.out.print("Enter a day number : ");
                int day = myObj.nextInt();

                switch(day){
                    case 1:
                    System.out.println("It's Monday.");
                    break;
                    case 2:
                    System.out.println("It's Tuesday.");
                    break;
                    case 3:
                    System.out.println("It's Wednesday.");
                    break;
                    case 4:
                    System.out.println("It's Thursday.");
                    break;
                    case 5:
                    System.out.println("It's Friday.");
                    break;
                    case 6:
                    System.out.println("It's Saturday.");
                    break;
                    case 7:
                    System.out.println("It's Sunday.");
                    break;
                    default:
                    System.out.println("Your input is invalid.");
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

import java.util.Scanner;
public class Third {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
    
        System.out.print("Enter a number : ");
        int n = myObj.nextInt();
        for(int i = n;i > 0;i--){
            for(int j = i;j > 0;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

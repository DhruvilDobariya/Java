import java.util.Scanner;
public class Second {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
    
        System.out.print("Enter a number : ");
        int n = myObj.nextInt();
        for(int i = 1;i < n+1;i++){
            for(int j = 0;j < i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

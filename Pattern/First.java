import java.util.Scanner;
public class First {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
    
        System.out.print("Enter a number : ");
        int n = myObj.nextInt();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

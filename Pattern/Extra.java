import java.util.Scanner;
public class Extra {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
    
        System.out.print("Enter a number : ");
        int n = myObj.nextInt();

        for(int i = n;i > 0;i--){
            for(int j = n;j > (n-i)/2;j--){
                System.out.print(" ");
            }
            for(int j = (n-i)/2;j < (n+i)/2;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

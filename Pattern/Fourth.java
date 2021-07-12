import java.util.Scanner;
public class Fourth {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = myObj.nextInt();
        for (int i= 0; i<= n; i++) {    
            for (int j=1; j<=n-i; j++) {  
                System.out.print(" ");  
            }  
            for (int k=0;k<=i;k++) {  
                System.out.print("*");  
            }   
            System.out.println("");  
        }  
    }
}

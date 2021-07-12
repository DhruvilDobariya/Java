import java.util.Scanner;
public class FifthOne {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
    
        System.out.print("Enter a number : ");
        int n = myObj.nextInt();
        for(int i = 1;i < n+1;i++){
            if(i % 2 == 1){
                int p = 0;
                if(n % 2 == 0){
                    p = n - 1;
                }else{
                    p = n;
                }
                int k = (p - i)/2;
                for(int j = 1;j < k+1;j++){
                    System.out.print("  ");
                }
                for(int j = k+1;j < p-k+1;j++){
                    System.out.print("* "); 
                }               
            }else if(i % 2 == 0){
                int p = 0;
                if(n % 2 == 1){
                    p = n - 1;
                }else{
                    p = n;
                }
                int k = (p - i)/2;
                if(n % 2 == 1){
                    for(int j = 1;j < k+1;j++){
                        System.out.print("  ");
                    }
                    for(int j = k+1;j < p-k+1;j++){
                        System.out.print(" *"); 
                    }
                }else{
                    for(int j = 1;j < k+1;j++){
                        System.out.print(" ");
                    }
                    for(int j = k+1;j < p-k+1;j++){
                        System.out.print("* "); 
                    }
                }               
            }
            System.out.println("");
        }
    }
}
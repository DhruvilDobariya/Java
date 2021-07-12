import java.util.Scanner;
public class Eighth {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
    
        System.out.print("Enter a number : ");
        int n = myObj.nextInt();
        int count = 0;
        for(int i = 1;i < n+1;i++){
            for(int j = 0;j < i;j++){
                count ++;
                System.out.print(count+" ");
            }
            System.out.println(" ");
        }
    }
}

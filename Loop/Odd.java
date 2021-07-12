import java.util.Scanner;
public class Odd{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = myObj.nextInt();
        int count = 0;
        for(int i = 0;count < n;i++){
            if(i % 2 == 1){
                System.out.println(i);
                count++;
            }
        }

    }
}
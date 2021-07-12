import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        int count = 0;
        System.out.print("Enter a number : ");
        int n = myObj.nextInt();
        for(int i = 2;i < n;i++){
            if(n % i == 0){
                count++;     //We can't declear count here(like: int count++;), Because of Scope consept.
                if (count == 1) {
                    break;
                }
            }
        }
        if(count == 0){
            System.out.println(n+" is a prime number.");
        }else{
            System.out.println(n+" is not prime number.");
        }
    }
}

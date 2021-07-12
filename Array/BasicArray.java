import java.util.Scanner;

public class BasicArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter a number "+(i+1)+" : ");
            a[i] = sc.nextInt();
        }
        for(int temp : a){      //This is for-each loop.
        	System.out.println(temp);
        }
}
}
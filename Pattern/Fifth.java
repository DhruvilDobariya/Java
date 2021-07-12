import java.util.Scanner;

public class Fifth {
	public static void main(String[] args) {   
		Scanner sc = new Scanner(System.in);
		
		int i, j, k;
		System.out.print("Enter a number : ");  
		int n = sc.nextInt();       
		for (i= n-1; i>= 0; i--) {  
			for (j=0; j<i; j++) {  
				System.out.print(" ");  
			}  
			for (k=i; k<=n-1; k++) {  
				System.out.print("*" + " ");  
			}  
			System.out.println("");  
		}  
	}
}
import java.util.Scanner;  
public class Seventh {  
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);

		int i, j, k, n;    
		System.out.print("Enter a number : ");  
		n = sc.nextInt();              
		for (i= 0; i<= n-1 ; i++) {  
			for (j=0; j<i; j++) {  
				System.out.print(" ");  
			}  
			for (k=i; k<=n-1; k++) {   
				System.out.print("*" + " ");   
			}   
			System.out.println("");   
		}   
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
import java.util.Scanner;

public class Tenth {  
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");  
		int n = sc.nextInt();      
		for (int i=1; i<= n ; i++) {  
			for (int j = n; j > i ; j--) {  
				System.out.print(" ");  
			}  
			System.out.print("*");  
			for (int k = 1; k < 2*(i -1) ;k++) {   
				System.out.print(" ");   
			}  
			if( i==1) {   
				System.out.println("");  
			}  
			else {  
				System.out.println("*");   
			}  
		}   
		for (int i=n-1; i>= 1 ; i--) {  
			for (int j = n; j > i ; j--) {  
				System.out.print(" ");  
			}  
			System.out.print("*");  
			for (int k = 1; k < 2*(i -1) ;k++) {  
				System.out.print(" ");  
			}  
			if(i==1) {  
				System.out.println("");
			}else {  
				System.out.println("*");
			}  
		}  
	}  
}  
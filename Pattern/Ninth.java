import java.util.Scanner;

public class Ninth {  
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);

		int i, j, k;
		System.out.print("Enter a number : ");  
		int n = sc.nextInt(); 
		for (i=1; i<= n ; i++) {  
			for (j = i; j < n ; j++) {  
				System.out.print(" ");  
			}     
			for (k = 1; k <= (2*i -1) ;k++) {  
				if(k==1 || i == n || k==(2*i-1)) {  
					System.out.print("*");  
				}else {  
					System.out.print(" ");  
				}  
			}  
			System.out.println("");  
		}  
	}  
}  
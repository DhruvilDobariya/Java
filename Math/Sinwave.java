import java.util.Scanner;

public class Sinwave {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*while(i<=90){
			
			double a = Math.round(Math.sin(Math.toRadians(i)));
			j++;
			
			System.out.print("*");
			i++;
		}
		System.out.println(j);*/
		int k = 0;
		for (int i = 0;i <= 8;i++) {
			for (double j = Math.sin(Math.toRadians(k));j<= Math.sin(Math.toRadians(k+1));k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println(k);
	}
}
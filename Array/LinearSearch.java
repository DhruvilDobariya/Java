import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        for(int i=0;i<10;i++){
        	System.out.print("Enter a number "+(i+1)+" : ");
        	a[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.print("Enter number that what you need search : ");
        int n = sc.nextInt();
        System.out.println("");
        boolean isFound = false;
        int j = 0;
        outer:
        for(j=j;j<10;j++){
        	if(a[j] == n){
                System.out.println(n+" is found on index "+j);
                isFound = true;
                System.out.println("");
                System.out.println("Aru need more index?");
                System.out.println("If yes then enter 1.");
                int x = sc.nextInt();
                if(x == 1){
                    continue outer;
                }
                else{
                    break;
                }
            }
        }
        if(isFound && j == 10){
            System.out.println("No more index found.");
        }else{
            System.out.println("Your number is not found.");
        }
	}
}
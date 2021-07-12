import java.util.Scanner;

class Circle{
    double radius;
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
    public double Area(){
		double area = Math.PI*(Math.pow(getRadius(), 2));
		return area;
	}
	public void displayArea(){
		System.out.println("Area of circle is : "+(Area()));
	}
}
public class CircleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){ 
            System.out.println("1 for get radius of area.");
            System.out.println("2 exit.");
            System.out.print("Enter your choice : ");
            int y = sc.nextInt();
            System.out.println("");
            switch(y){
                case 1:
                System.out.print("Enter a number that how many Circle you need : ");
                int w = sc.nextInt();
                System.out.println(""); 
                makeCircle(w);
                System.out.println(""); 
                break;
                case 2:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid input.");
                System.out.println(""); 
            }
        } 
	}
	public static void makeCircle(int n){
		Scanner sc = new Scanner(System.in);
		Circle[] myCircle = new Circle[n];
		for(int i = 0;i < n;i++){
			myCircle[i] = new Circle();
			System.out.print("Enter a radius of circle of no "+(i+1)+" : ");
			double radius = sc.nextDouble();
			myCircle[i].setRadius(radius);
			myCircle[i].displayArea();
			System.out.println("");
		}
	}
}
import java.util.Scanner;

class Rectangle{
    double height;
    double width;
    public Rectangle(){
        height = 4;
        width = 4;
    }
    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }
    public double getPerimeter(){
        double perimeter = 2*(height + width);
        return perimeter;
    }
    public double getArea(){
        double area = height * width;
        return area;
    }
    public void dispalyPerimeter(){
        System.out.println("Perimeter of rectangle is : "+(getPerimeter()));
    }
    public void dispalyArea(){
        System.out.println("Area of rectangle is : "+(getArea()));
    }

}
public class RectangleDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        while(true){ 
            System.out.println("1 for get default rectangle.");
            System.out.println("2 for get spacified rectangle.");
            System.out.println("3 exit.");
            System.out.print("Enter your choice : ");
            int y = sc.nextInt();
            System.out.println("");
            switch(y){
                case 1:
                makeRect();
                System.out.println(""); 
                break;
                case 2:
                System.out.print("Enter a number that how many Rectangle you need : ");
                int w = sc.nextInt();
                System.out.println(""); 
                makeRectSpacified(w);
                System.out.println(""); 
                break;
                case 3:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid input.");
                System.out.println(""); 
            }
        } 
    }
    public static void makeRect(){
        Rectangle myObj = new Rectangle();
        myObj.dispalyPerimeter();
        myObj.dispalyArea(); 
    }
    public static void makeRectSpacified(int z){
        Scanner sc = new Scanner(System.in);
        Rectangle[] myRect = new Rectangle[z];
        for(int i = 0;i < z;i++){
            System.out.print("Enter a height of rectangle of no "+(i+1)+" : ");
            double height = sc.nextDouble();
            System.out.print("Enter a width of rectangle of no "+(i+1)+" : ");
            double width = sc.nextDouble();
            myRect[i] = new Rectangle(height,width);
            myRect[i].dispalyPerimeter();
            myRect[i].dispalyArea();
            System.out.println(""); 
        }
    }
}
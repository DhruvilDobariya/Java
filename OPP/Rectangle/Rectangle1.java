import java.util.Scanner;

class Rect{
	int length;
	int width;
	String  backgroundcolor;
	String bordercolor;
}
public class Rectangle1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rect obj1 = new Rect();
		Rect obj2 = new Rect();
		Rect obj3 = new Rect();
		Rect obj4 = new Rect();
		Rect obj5 = new Rect();

		obj1.length = 10;
		obj1.width = 5;
		obj1.backgroundcolor = "white";
		obj1.bordercolor = "black";

		obj2.length = 8;
		obj2.width = 5;
		obj2.backgroundcolor = "red";
		obj2.bordercolor = "black";

		obj3.length = 10;
		obj3.width = 7;
		obj3.backgroundcolor = "white";
		obj3.bordercolor = "green";

		obj4.length = 10;
		obj4.width = 10;
		obj4.backgroundcolor = "white";
		obj4.bordercolor = "none";

		System.out.println(obj1.length);
		System.out.println(obj1.backgroundcolor);
		System.out.println(obj5.length);  // By defulte int value is 0.
		System.out.println(obj5.backgroundcolor);  // By defulte String value is null.
	}
}
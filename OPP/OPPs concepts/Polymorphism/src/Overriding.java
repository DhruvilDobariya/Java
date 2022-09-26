class A {
	
	int a = 10;
	
	public void display() {
		System.out.println("Print from A class, a is : "+ a);
	}
}
class B extends A{
	
	public void display() {
		a = 20;
		System.out.println("Print from B class, a is : "+ a);
	}
}
/*
 *  If sub class contain same name and same signature of super class is called method overriding.
 *  Here display is name of method.
 *  Here arguments is signature of method.
 */
public class Overriding {

	public static void main(String[] args) {
		
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.display();
		obj2.display();
		
	}

}

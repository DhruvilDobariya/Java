
abstract class Abstraction { // Here, this is abstract class.
	int a = 50;
	public abstract void add();         // Here, this is abstract method, which is unimplemented. 
	public abstract void subtract();    // Here, this is abstract method, which is unimplemented.
	
	public void multiply() {  //Here, this is implemented method.
		// code ....
	}
	public void divide() {  //Here, this is implemented method.
		// code ....
	}
}
/*If we want to make abstract class then we use abstract key word to start class name 
 * For Ex. abstract access_specifiers class ClassName
 * Abstract class contain implemented or unimplemented(which known as abstract method) methods.
 * If we want to make abstract method then we use abstract key word.
 * For Ex. access_specifiers abstract return_type methodName();
 * Which methods is all ready implement in abstract class, they methods don't implement in sub class. 
 */

public class AbstractionMain extends Abstraction { // If we want inherit abstract class, then we must make define unimplemented methods in sub class.

	public static void main(String[] args) {
		System.out.println("Hello world");
		
	}
	
	public void add() {  // This is unimplemented method, which is we define in sub class.    
		// code ....
	}
	
	public void subtract() {  // This is unimplemented method, which is we define in sub class.
		// code ....
	}

}

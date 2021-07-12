
interface Interface {
	int a = 10;		// In interface if we define variable, then variable always become by default public static final.
	public abstract void add();         // Here, this is abstract method, which is unimplemented. 
	public abstract void subtract();    // Here, this is abstract method, which is unimplemented.
	
}
/*If we want to make interface then we use interface key word. 
 * For Ex. interface InterfaceName
 * Interface is strictly abstract, so interface contain only unimplemented(which known as abstract method) methods. 
 */
public class InterfaceMain implements Interface { // If we want to inherit interface in class then we use implements key word by using extends.  

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

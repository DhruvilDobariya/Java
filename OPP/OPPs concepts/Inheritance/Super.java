import java.util.Scanner;

class SuperClass {
    int a = 10;

    public SuperClass(){
        a = 15;
        System.out.println("Default constructure from super class : "+ a);
    }
    public SuperClass(int a){
        this.a = a;
        System.out.println("Perameterized constructure from super class : "+ a);
    }
}
class SubClass extends SuperClass {
    int a = 25;
    public SubClass(){
        super();
        a = 30;
        System.out.println("Default constructure from sub class : "+ a);
    }
    public SubClass(int subA, int superA){
        super(superA);
        a = subA;
        System.out.println("Perameterized constructure from sub class : "+ a);
    }
}
/* 
For access eliment of  super class:
Variable : super.variable;
Method : super.method();
Default Constructure : super();
Perameterized Constructure : super(perameter);

For access eliment of  self class:
Variable : this.variable;
Method : this.method();
Default Constructure : this();
Perameterized Constructure : this(perameter);
*/

public class Super {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Obj 1 :");
        SubClass obj1 = new SubClass();
        System.out.println("");

        System.out.println("Obj 2 :");
        SubClass obj2 = new SubClass(20, 35);
        System.out.println("");
	}
}
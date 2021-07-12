import java.util.Scanner;
public class InputFunction{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); //Define object

        System.out.println("Enter name, age and salary:");

        String Name = myObj.nextLine();  //Get String
        int age = myObj.nextInt();  //Get Int
        double salary = myObj.nextDouble(); //Get Double

        System.out.println("Name: " + Name); 
        System.out.println("Age: " + age); 
        System.out.println("Salary: " + salary); 
    }
}
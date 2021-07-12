import java.util.Scanner;

class Student{
    int idNo;
    int numberOfSubject;
    int subjectCode[] = new int[0];  //here I initialized array with 0 index, because we use dynamically indexing, I overwrite  indexing in program.
    int subjectCredit[] = new int[0]; 
    String grade[] = new String[0]; 
    double spi;
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a total number of subjects : ");
        numberOfSubject = sc.nextInt();
        subjectCode = new int[numberOfSubject];  //here I overwrite indexing of array.
        subjectCredit = new int[numberOfSubject]; 
        grade = new String[numberOfSubject]; 
        System.out.println("Enter subject's code.");
        for(int i = 0;i < this.numberOfSubject;i++){
            System.out.print("Enter a code of subject no. "+ (i+1) +" : ");
            subjectCode[i] = sc.nextInt();
        }
        System.out.println("Enter subject's credit.");
        for(int i = 0;i < this.numberOfSubject;i++){
            System.out.print("Enter a credit of which subject code is "+ subjectCode[i] +" : ");
            subjectCredit[i] = sc.nextInt();
        }
        System.out.println("Enter subject's grade.(like  this : AA)");
        int j = 0;
        while(j < this.numberOfSubject){
            System.out.print("Enter a grade of which subject code is "+ subjectCode[j] +" : ");
            String temp = sc.next();
            temp += sc.nextLine();
            if(temp.equals("AA") || temp.equals("AB") || temp.equals("BB") || temp.equals("BC") || temp.equals("CC") || temp.equals("CD") || temp.equals("DD") || temp.equals("FF")){
                grade[j] = temp;
                j++;
            }else{
                System.out.println("Your input is invalid, Please re-enter correct grade");
            }
        } 
    }
    public double calculateSpi(){
        int GC = 0;
        double C = 0;

        for(int i = 0;i < numberOfSubject;i++){
            C += subjectCredit[i];
        }
        for(int i = 0;i < numberOfSubject;i++){
            switch(grade[i]){
                case "AA":
                GC += 10 * subjectCredit[i];
                break;
                case "AB":
                GC += 9 * subjectCredit[i];
                break;
                case "BB":
                GC += 8 * subjectCredit[i];
                break;
                case "BC":
                GC += 7 * subjectCredit[i];
                break;
                case "CC":
                GC += 6 * subjectCredit[i];
                break;
                case "CD":
                GC += 5 * subjectCredit[i];
                break;
                case "DD":
                GC += 4 * subjectCredit[i];
                break;
                case "FF":
                GC += 0 * subjectCredit[i];
                break;
            }
        }
        spi = GC / C;
        return spi;
    }
    public void displaySpi(){
        System.out.println("Your S.P.I is : "+calculateSpi());
    }
}
public class StudentMain {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(true){ 
            System.out.println("1 for get S.P.I.");
            System.out.println("2 exit.");
            System.out.print("Enter your choice : ");
            int y = sc.nextInt();
            System.out.println("");
            switch(y){
                case 1:
                System.out.print("Enter a number that how students S.P.I. you need : ");
                int n = sc.nextInt();
                System.out.println(""); 
                makeStudent(n);
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
    public static void makeStudent(int n){
        Scanner sc = new Scanner(System.in);
        Student st[] = new Student[n];
        for(int i = 0;i < n;i++){
            System.out.println("Enter details of student no : "+(i+1));
            st[i] = new Student();
            st[i].displaySpi();
        }
    }
}

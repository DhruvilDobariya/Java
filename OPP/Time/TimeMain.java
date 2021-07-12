import java.util.Scanner;

class Time{
    int hour;
    int minute;
    int second;
    public void setHour(int hour){   //here I useed getter setter method just for practice.
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public int getHour(int hour){
        return hour;
    }
    public int getMinute(int minute){
        return minute;
    }
    public int getSecond(int second){
        return second;
    }
    public void addTime(Time t){
        this.second += t.second;
        if(this.second > 60){
            this.second -= 60;
            this.minute += 1;
        }
        this.minute += t.minute;
        if(this.minute > 60){
            this.minute -= 60;
            this.hour += 1;
        }
        this.hour += t.hour;
    }
    public void displayTime(){
        System.out.println("Sum of time is : "+ this.hour +" : "+ this.minute +" : "+ this.second);
    }
}
public class TimeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        while(true){ 
            System.out.println("1 for Sum of time.");
            System.out.println("2 exit.");
            System.out.print("Enter your choice : ");
            int n = sc.nextInt();
            System.out.println("");
            switch(n){
                case 1:
                makeTime();
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
    public static void makeTime(){
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time();
        System.out.println("Enter first time's parameters.");
        System.out.print("Hour : ");
        t1.setHour(sc.nextInt());
        System.out.print("Minute : ");
        t1.setMinute(sc.nextInt());
        System.out.print("Second : ");
        t1.setSecond(sc.nextInt());
        System.out.println("");
        System.out.println("Enter Second time's parameters.");
        System.out.print("Hour : ");
        t2.setHour(sc.nextInt());
        System.out.print("Minute : ");
        t2.setMinute(sc.nextInt());
        System.out.print("Second : ");
        t2.setSecond(sc.nextInt());
        System.out.println("");
        System.out.println("First time is : "+ t1.hour +" : "+ t1.minute +" : "+ t1.second);
        System.out.println("Second time is : "+ t2.hour +" : "+ t2.minute +" : "+ t2.second);
        t1.addTime(t2);
        t1.displayTime();
    }
}
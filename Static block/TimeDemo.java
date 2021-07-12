class Time{
	int hour;
	int minute;
	int second;

	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	void add(Time temp){
		this.second = this.second + temp.second;

		if(this.second>=60){
			this.minute++;
			this.second = this.second - 60;
		}

		this.minute = this.minute + temp.minute;

		if(this.minute>=60){
			this.hour++;
			this.minute = this.minute - 60;
		}
		this.hour = this.hour + temp.hour;

	}

	void printTime(){
		System.out.println("Hour = "+this.hour);
		System.out.println("Minute = "+this.minute);
		System.out.println("Second = "+this.second);
	}
}
public class TimeDemo{
	public static void main(String[] args){
		Time t1 = new Time(9,55,55);
		Time t2 = new Time(1,4,55);

		t1.add(t2);
		t1.printTime();
	}
}
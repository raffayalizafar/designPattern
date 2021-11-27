package oop.time;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toString() {
		if(hour > 9 && minute > 9 && second > 9) {
			return "Time : [hour: " +hour+ ", minute: " +minute+", second: " +second+"]";
		}
		else if(hour > 9 && minute > 9) {
			return "Time : [hour: " +hour+ ", minute: " +minute+", second: 0" +second+"]";
		}
		else if(hour > 9 && second > 9) {
			return "Time : [hour: " +hour+ ", minute: 0" +minute+", second: " +second+"]";
		}
		else if(minute > 9 && second > 9) {
			return "Time : [hour: 0" +hour+ ", minute: " +minute+", second: " +second+"]";
		}
		else{
			if(hour>9) {
				return "Time : [hour: " +hour+ ", minute: 0" +minute+", second: 0" +second+"]";
			}
			else if(minute>9) {
				return "Time : [hour: 0" +hour+ ", minute: " +minute+", second: 0" +second+"]";
			}
			else if(second>9){
				return "Time : [hour: 0" +hour+ ", minute: 0" +minute+", second: " +second+"]";
			}
			else {
				return "Time : [hour: 0" +hour+ ", minute: 0" +minute+", second: 0" +second+"]";
			}
		}
	}
}

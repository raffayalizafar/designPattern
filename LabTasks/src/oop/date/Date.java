package oop.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
//		this.day = day;
//		this.month = month;
//		this.year = year;
		setDate(day, month, year);
		}
	public int getDay() {return day;}
	public void setDay(int newDay) {day = newDay;}
	public int getMonth() {return month;}
	public void setMonth(int newMonth) {month = newMonth;}
	public int getYear() {return year;}
	public void setYear(int newYear) {year = newYear;}
	public void setDate(int day, int month,int year) {
		if(day>0 && day<=31) {
			if(month>0 && month<=12) {
				if(year>1900 && year<=9999) {
					this.day = day;
					this.month = month;
					this.year = year;
				}
			}
		}
		else {
			System.out.println("Please enter again!");
		}
//		this.day = day;
//		this.month = month;
//		this.year = year;
		}
	@Override
	public String toString() {
		if(day >=10 && month >=10) {
			return "Date: "+day+"/"+month+"/"+year;
		}
		else if(day >=10) {
			return "Date: "+day+"/"+"0"+month+"/"+year;
		}
		else if(month >=10) {
			return "Date: "+"0"+day+"/"+month+"/"+year;
		}
		else {
			return "Date: "+"0"+day+"/"+"0"+month+"/"+year;
		}
	}
}

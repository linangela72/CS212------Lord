public class Date212 {
	private int year;
	private int month;
	private int day;
	
	
	public Date212(String a) {
		int y=Integer.parseInt(a.substring(0,4));
		int m=Integer.parseInt(a.substring(4,6));
		int d=Integer.parseInt(a.substring(6,8));
		
		year=y;
		month=m;
		day=d;
	}//Date212
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	public void setYear(int y) {
		year=y;
	}
	public void setMonth(int m) {
		month=m;
	}
	public void setDay(int d) {
		day=d;
	}
	
	public static String monthName(int month) {
		String[] monthName= {"","January","Februray","March","April",
							"May","June","July","August","September",
							"October","November","December"};
		return monthName[month];
	}
	
	public String toString() {
		return monthName(month)+" "+day+", "+year;
	}
	
	public int compareTo(Date212 other) {
		if(this.year<other.year) {
			return -1;
		}
		if(this.year>other.year) {
			return 1;
		}
		if(this.year==other.year&&this.month<other.month) {
			return -1;
		}
		
		if(this.year==other.year&&this.month>other.month) {
			return 1;
		}
		
		if(this.year==other.year&&this.month==other.month&&this.day<other.day) {
			return -1;
		}
		
		if(this.year==other.year&&this.month==other.month&&this.day>other.day) {
			return 1;
		}
		if(this.year==other.year&&this.month==other.month&&this.day==other.day) {
			return 0;
		}
		return 1;
		
	}//compareTo
	
}//class Date212

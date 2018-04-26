/*****************************************
 * 
 * @author Angela
 *A program that sorts dates and changes the format the date was written
 *
 */
public class Date212 {
	private int year;
	private int month;
	private int day;
	
	/******
	 * the string a is taken and split into substrings of year, month, and day and turned into integers
	 * @param a is a string with the date in yyyymmdd format
	 *  
	 */
	public Date212(String a) {
		int y=Integer.parseInt(a.substring(0,4));
		int m=Integer.parseInt(a.substring(4,6));
		int d=Integer.parseInt(a.substring(6,8));
		
		year=y;
		month=m;
		day=d;
	}
	
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
	/******
	 * the month number is turned into a string with the Month written out.
	 * @param month is the month number of the string provided
	 * @return string corresponding to the month number
	 */
	public static String monthName(int month) {
		String[] monthName= {"","January","Februray","March","April",
							"May","June","July","August","September",
							"October","November","December"};
		return monthName[month];
	}
	/****
	 * prints out date in format month day, year
	 */
	public String toString() {
		return monthName(month)+" "+day+", "+year;
	}
	/*****
	 * compares 2 dates together to see if they are greater than, equal to, or less than
	 * @param other the other date it is being compared to
	 * @return int 1 for greater, 0 for equal, -1 for less than
	 */
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
		
	}
	public static void main(String[] args) {
	      Date212 date1 = new Date212("20131231");
	      Date212 date2 = new Date212("20120631");
	      System.out.println("year: "+date1.year);
	      System.out.println("month: "+date1.month);
	      System.out.println("day: "+date1.day);
	      System.out.println(date1.toString());
	      System.out.println("compare: "+date1.compareTo(date2));
	   }
}

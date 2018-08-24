
public class Date {
     
	 private int day;
	 private String month;
	 private int year;
	 
	 public Date() {
		 day=1;
		 month="January";
		 year=1900;
	 }
    public Date(int default_day, String default_month, int default_year)
    {
    	day=default_day;
    	month=default_month;
    	year=default_year;
    }
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	 public void display()
	 {
		 System.out.println("The date is-"+day+"-"+month+"-"+year+"\n");
	 }
}

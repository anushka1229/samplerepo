
public class TestPerson {

	   public static void main(String[] args)
	   {
		   Person P= new Person();
		   Person P1= new Person(19,"AnushkaS");
		  
		   P= new Person(); //re initialization
		   P.display();
		   P.setAge(129);
		   P.display();
		   P1.display();
		   Date d=new Date();
		   Date d1=new Date(29,"October",1994);
		   d.display();
		   d1.display();
		   d.setDay(12);
		   d.setMonth("August");
		   d.setYear(1998);
		   int day1=d.getDay();
		   day1++;
		   d.setDay(day1);
		   d.display();
		   String month1=d.getMonth();
		   month1="June";
		   d.setMonth(month1);
		   d.display();
		   
	   }
}

package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Main function for the calendar 
 * */
public class Calendar 
{
	public static void main(String[] args)
	{
		// initializes the variables 
		Month m = new Month(1); 
		Day d= new Day(1); 
		Year y= new Year(2016); 
		DayOfWeek dw = new DayOfWeek(m.getNum(),d.getNum(),y.getNum());
		
		DateCounter dc = new DateCounter(dw,m,d,y);
		
		// sets the loop to increment the date, and sets the limit to show a leap year and non-leap year
		for(int i=0;i<450; i++)
		{
			if(y.ifLeapYear()&&m.getNum()==1)
				d.setLastDay(m.monthLength()+1);
			else
				d.setLastDay(m.monthLength());
			
			System.out.println(dw.getValue()+","+m.getValue()+" "+d.getNum()+","+y.getValue());
			dc.increas();
		}
	}
}

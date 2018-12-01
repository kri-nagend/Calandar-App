package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Class used to control the day of the week 
 * */
public class DayOfWeek implements Rollable<String>
{
	// private memebers 
	private int theDay; 
	private int theMonth; 
	private int theYear;
	private int theDayOfWeek;
	private boolean rolledOver; 
	private static final String[] DAYS = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	/**
	 * Is a constructor that sets the day to 0 
	 * */
	public DayOfWeek()
	{
		theDay=0; 
	}
	/**
	 * @param d
	 * Is a constructor that takes day and assigns that to the week 
	 * */
	public DayOfWeek(int d)
	{
		theDay=d; 
	}
	/**
	 * @param d
	 * @param m
	 * @param y 
	 * Is a constructor that takes the month, day, and year 
	 * */
	public DayOfWeek(int m, int d, int y)
	{
		theMonth=m;
		theDay=d;
		theYear=y;
	}
	/**
	 * Is a function that resets the day of the week 
	 * */
	public void reset() 
	{
		theDay=0;
	}

	/**
	 * Is a function that increases the week and increments at the max
	 * */
	public void increas() 
	{
		rolledOver=false; 
		if(theDay==6)
		{
			reset(); 
			rolledOver=true; 
		}
		else
			theDay++; 
	}
	/**
	 * Is a function that return if the week rolled over on the last increment 
	 * */
	public boolean lastRolledOver() 
	{
		return rolledOver;
	}
	/**
	 * Is a function that returns the day of the week as a string 
	 * */
	public String getValue() 
	{
		return DAYS[zeller(theMonth,theDay,theYear)]; 
	}
	/**
	 * Is a function that uses zellers congruence to find the day of the week 
	 * */
	public int zeller(int mon, int da, int ye)
	{
		mon = mon+1; 
		if(mon<=0)
		{
			mon=mon+12;
			ye=ye-1; 
		}
		int first2 = ye/100;
		int last2 = ye%100;
		int result = (26*mon-2)/100+da+first2+first2/4+last2/4-2*last2;
		result = result %7; 
		if(result <0)
		{
			result = result +7; 
		}
		return result; 
	}

}

package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Class used to control the date
 * */
public class DateCounter<T> implements WheelCounterInterface<T>
{
	// private members 
	private int countersInUse=4;
	private DayOfWeek dWeek;
	private Month month;
	private Day day;
	private Year year; 	
	/**
	 * @param dayWeek
	 * @param month
	 * @param day
	 * @param year
	 * Is a constructor that takes the day of week, day, month and year 
	 * */
	public DateCounter(DayOfWeek dayWeek, Month month, Day day, Year year) 
	{
		this.dWeek= dayWeek; 
		this.month = month;
		this.day = day;
		this.year = year; 
	}
	/**
	 * Is a function that resets the date
	 * */
	public void reset() 
	{
		dWeek.reset();
		month.reset();
		day.reset();
		year.reset();
	}
	/**
	 * Is a function that increments the date 
	 * */
	public void increas() 
	{
		dWeek.increas();
		day.increas();
		if(day.lastRolledOver())
		{
			month.increas();
			if(month.lastRolledOver())
			{
				year.increas();
			}
		}
		
	}

	
	/**
	 * Is a function that returns the # of wheels in use 
	 * */
	public int getwheelsInUse() 
	{
		return 4;
	}
	/**
	 * Is a function that returns the value of each wheel 
	 * */
	public T getwheelValue(int thewheel) 
	{
		if(thewheel==1)
			return (T) dWeek.getValue();
		else if(thewheel==2)
			return (T) month.getValue();
		else if(thewheel==3)
			return (T) day.getValue();
		else 
			return (T) year.getValue();
	}

}

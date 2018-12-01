package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Class used to control the day
 * */
public class Day implements Rollable<String>
{
	// private members 
	private int day;
	private int lastDay; 
	private boolean rollOver;
	
	/**
	 * @param lDay
	 * Is a constructor that takes the last day, and sets the day to one
	 * */
	public Day(int lDay)
	{
		day=1;
		lastDay = lDay; 
	}
	/**
	 * @param sDay
	 * @param lDay
	 * Is a constructor that takes the start day, and last day 
	 * */
	public Day(int sDay, int lDay)
	{
		day= sDay;
		lastDay= lDay; 
	}
	
	/**
	 * Is a reset function that sets the day back to 1 
	 * */
	public void reset() 
	{
		day=1; 
	}
	/**
	 * Is a function that takes an int and sets it to the lastDay
	 * */
	public void setLastDay(int lDay)
	{
		lastDay= lDay; 
	}
	/**
	 * Increase function, that rolls over when it reaches the limit 
	 * */
	public void increas() 
	{
		rollOver=false;
		if(day==lastDay)
		{
			reset(); 
			rollOver=true; 
		}
		else
		{
			day++; 
		}
		
	}
	/**
	 * Returns if the day rolled over on the last increment
	 * */
	public boolean lastRolledOver() {
		return rollOver;
	}
	/**
	 * Does nothing
	 * */
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	} 
	/**
	 * Returns the day as an int, used in calculations 
	 * */
	public int getNum()
	{
		return day; 
	}
	
		
}

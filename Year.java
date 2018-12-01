package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Class used to control the year
 * */
public class Year implements Rollable<String>
{
	// private memebers 
	public int year; 
	
	/**
	 * Is a constructor that sets the year to zero 
	 * */
	public Year()
	{
		year=0; 
	}
	/**
	 * @param y
	 * Is a constructor that sets the year to the passed value 
	 * */
	public Year(int y)
	{
		year =y; 
	}

	/**
	 * Is a function that sets the year back to 0 
	 * */	
	public void reset() 
	{
		year=0; 		
	}

	/**
	 * Is a function that increases the year
	 * */
	public void increas() 
	{
		year++; 
	}
	/**
	 * Is a function that returns if the month rolled over last increment 
	 * */
	public boolean lastRolledOver() 
	{
		return true;
	}
	/**
	 * Is a function that returns the year in int form 
	 * */
	public int getNum()
	{
		return year; 
	}

	/**
	 * Is a fucntion that returns the year in string form 
	 * */
	public String getValue() 
	{
		return Integer.toString(year);
	}
	/**
	 * Is a fucntion that returns a boolean that shows if the its a leap year or not
	 * */
	public boolean ifLeapYear()
	{
		if(year%4==0&&year%100 !=0)
			return true; 
		else if(year%4==0&&year%100==0&&year%400==0)
			return true;
		else
			return false; 
	}
	

}

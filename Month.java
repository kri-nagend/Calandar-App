package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Class used to control the month
 * */
import java.time.Year;

public class Month implements Rollable<String>
{
	// private memebers 
	private int theMonth;
	private boolean rolledOver; 
	private static final String[] MONTHS = {"Jan","Feb","Mar","Apr","May",
			"Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	/**
	 * Is a constructor that sets the month to Jan 
	 * */
	public Month()
	{
		String m= MONTHS[0]; 
	}
	/**
	 * @param month
	 * Is a constructor that sets the month to the passed value 
	 * */
	public Month(int month)
	{
		String m = MONTHS[month+1]; 
	}
	
	/**
	 * Is a function that sets the month back to Jan 
	 * */	
	public void reset() 
	{
		theMonth=0; 		
	}
	/**
	 * Is a function that increases the month and rolls over at Dec
	 * */
	public void increas() 
	{
		rolledOver=false;
		if(theMonth==11)
		{
			reset();
			rolledOver=true; 
			
		}
		else
		{
			theMonth++;
			rolledOver=false;
		}
			 
		
	}
	/**
	 * Is a fucntion that returns the lenght of the month 
	 * */
	public int monthLength()
	{
		if(theMonth==0)
			return 31;
		else if(theMonth==1)
			return 28;
		else if(theMonth==2)
			return 31;
		else if(theMonth==3)
			return 30;
		else if(theMonth==4)
			return 31;
		else if(theMonth==5)
			return 30;
		else if(theMonth==6)
			return 31;
		else if(theMonth==7)
			return 31;
		else if(theMonth==8)
			return 30;
		else if(theMonth==9)
			return 31;
		else if(theMonth==10)
			return 30;
		else if(theMonth==11)
			return 31;
		else
			return 0;
		
	}
	/**
	 * Is a function that returns if the month rolled over last increment 
	 * */
	public boolean lastRolledOver() 
	{
		return rolledOver; 
	}
	/**
	 * Is a fucntion that returns the month in string form 
	 * */
	public String getValue() 
	{
		return MONTHS[theMonth]; 
	}
	/**
	 * Is a function that returns the month in int form 
	 * */
	public int getNum()
	{
		return theMonth; 
	}
	 
}

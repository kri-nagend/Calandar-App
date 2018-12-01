package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Acts as an extenstion for the Wheel class
 * */
public class Counter 
{
	// priavte memeber variables
	private int count; 
	
	/**
	 * Is a constructor that initializes the count at 1
	 * */
	public Counter()
	{
		count =1; 
	}
	/**
	 * Is a function that increments the counter by 1
	 * */
	public void increase()
	{
		count++; 
	}
	/**
	 * Is a function that decrements the counter by 1
	 * */
	public void decrease()
	{
		count--;
	}
	/**
	 * Is a function that returns the counter
	 * */
	public int getCount()
	{
		return count; 
	}
	/**
	 * Is a function that sets the counter to zero
	 * */
	public void setZero()
	{
		count=1; 
	}
	/**
	 * Is a function that checks if the counter is zero
	 * */
	public boolean isZero()
	{
		if(count==0)
			return true;
		else
			return false;
	}
	/**
	 * Is a function that expresses the counter as a string
	 * */
	public String toString()
	{
		return " "+count; 
	}
}

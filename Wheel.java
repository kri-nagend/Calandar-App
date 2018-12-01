package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Extends the Counter class and implements the Rollable interface to code the functions for each specifc wheel 
 * */
public class Wheel extends Counter implements Rollable<Integer> 
{
	// private members 
	private int maxi;
	private int mini;
	private boolean rolledOver; 
	public int[] w={0,0,0,0}; 
	public int a; 
	
	/**
	 * @param maximum
	 * Is a constructor that accepts a maximum value and sets the minimum to 0
	 * */
	public Wheel(int maximum)
	{
		mini=0;
		maxi=maximum;
		rolledOver = false; 
	}
	/**
	 * @param maximum
	 * @param mimiumu
	 * Is a constructor that accepts a maximum value and minimum value
	 * */
	public Wheel(int minimum, int maximum)
	{
		mini=minimum;
		maxi=maximum;
		rolledOver=false; 
	}
	/**
	 * Calls the reset function in the counter class
	 * */
	public void reset()
	{
		super.setZero();
		rolledOver=false;
	}
	/**
	 * Calls the setZero function i nthe counter class and rolls over if the maximum is reached
	 * */
	public void increas()
	{
		if(super.getCount()==maxi)
		{
			super.setZero(); 
			rolledOver=true; 
		}
		else
		{
			super.increase();
			rolledOver=false; 
		}
			 
	}
	/**
	 * Returns the rolledOver boolean 
	 * */	
	public boolean lastRolledOver()
	{
		return rolledOver; 
	}
	/**
	 * Calls the getCount function from the counter class and returns it
	 * */
	public Integer getValue()
	{
		return super.getCount(); 
	}
}

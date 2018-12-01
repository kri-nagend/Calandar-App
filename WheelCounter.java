package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Implements the WheelCounterInterface 
 * */
public class WheelCounter<T> implements WheelCounterInterface<T>
{
	// member variables 
	private Rollable<T>[] wheels; 
	public int[] w={0,0,0,0}; 
	public T a;
	public int countersInUse;
	public boolean rolledOver; 
	
	/**
	 * @param wheelOne
	 * Is a constructor when one parameter is passed to WheelCounter
	 * */
	public WheelCounter(Rollable<T> wheelOne)
	{
		countersInUse=1; 
		wheels= new Rollable[1];
		wheels[0]=wheelOne; 
	}
	/**
	 * @param wheelOne
	 * @param wheelTwo
	 * Is a constructor when two parameters are passed to WheelCounter
	 * */
	public WheelCounter(Rollable<T> wheelTwo, Rollable<T> wheelOne)
	{
		countersInUse=2;
		wheels= new Rollable[2]; 
		wheels[0]=wheelOne; 
		wheels[1]=wheelTwo; 
	}
	/**
	 * @param wheelOne
	 * @param wheelTwo
	 * @param wheelThree
	 * Is a constructor when three parameters are passed to WheelCounter
	 * */
	public WheelCounter(Rollable<T> wheelThree, Rollable<T> wheelTwo, Rollable<T> wheelOne)
	{
		countersInUse=3;
		wheels= new Rollable[3];
		wheels[0]=wheelOne; 
		wheels[1]=wheelTwo;
		wheels[2]=wheelThree; 
	}
	/**
	 * @param wheelOne
	 * @param wheelTwo
	 * @param wheelThree
	 * Is a constructor when three parametes are passed to WheelCounter
	 * */
	public WheelCounter(Rollable<T> wheelFour ,Rollable<T> wheelThree, Rollable<T> wheelTwo, Rollable<T> wheelOne)
	{
		countersInUse=4;
		wheels= new Rollable[4];
		wheels[0]=wheelOne; 
		wheels[1]=wheelTwo;
		wheels[2]=wheelThree;
		wheels[3]=wheelFour; 
	}
	/**
	 * Is a function that uses the Counter class to reset all of the wheels
	 * */	
	public void reset()
	{
		for(int i=0;i>countersInUse;i++)
			wheels[i].reset();
	}
	/**
	 * Is a function that uses the Counter class to increment all of the wheels
	 * */
	public void increas()
	{
		rolledOver=true; 
		for(int i=0; i<countersInUse&&rolledOver; i++)
		{
			wheels[i].increas();
			rolledOver = wheels[i].lastRolledOver();
		}
	}
	/**
	 * Is a function that uses the Counter class to access the values of all of the wheels
	 * */
	public T getwheelValue(int thewheel)
	{
		 return wheels[thewheel].getValue(); 
	}
	/**
	 * Is a function that returns the number of wheels in use
	 * */
	public int getwheelsInUse()
	{
		return countersInUse; 
	}
}

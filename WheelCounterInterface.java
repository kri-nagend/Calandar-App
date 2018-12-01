package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Acts as an interface for the WheelCounter and DateCounter class
 * */

public interface WheelCounterInterface<T> 
{	
	public void reset();
	
	public void increas();
	
	public T getwheelValue(int thewheel);
	
	public int getwheelsInUse(); 
}

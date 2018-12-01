package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Acts as an interface for the Wheel class
 * */
public interface Rollable<T> 
{
	public void reset();
	
	public void increas();
	
	public boolean lastRolledOver();
	
	public T getValue(); 
}

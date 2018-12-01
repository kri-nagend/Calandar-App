package code_knagend_assignment1;
/**
 * @author Krishanth Nagendrasooriyar, knagend@uwo.ca
 * @version 1.0, 02/02/2016
 * Main function, used to find the probability of a certain sum 
 * */
import java.text.DecimalFormat;

public class DiceProbability 
{
	public static void main(String[] args)
	{
		// initializes the 4 wheels, and sets the min and max to dice values 
		System.out.println("welcome to the dice roller program");
		Wheel wheelOne= new Wheel(1,6);
		Wheel wheelTwo= new Wheel(1,6);
		Wheel wheelThree= new Wheel(1,6);
		Wheel wheelFour = new Wheel(1,6);
		WheelCounterInterface<Integer> dice = new WheelCounter(wheelOne, wheelTwo, wheelThree, wheelFour);
		
		// runs the loop for all possible combination for 4 dice
		Integer sum= 0;
		double c=0; 
		for (int i=0; i <6*6*6*6; i++)
		{   sum = dice.getwheelValue(0)+dice.getwheelValue(1)+dice.getwheelValue(2)+dice.getwheelValue(3);
			System.out.println(dice.getwheelValue(0)+" "+dice.getwheelValue(1)+" "+dice.getwheelValue(2)+" "+dice.getwheelValue(3)+" The sum is "+sum);
			if(sum>12)
				c++;
			dice.increas();
		}
		// calculates the probablitiy and outputs it 
		double p = c/1296; 
		System.out.println("The number of rolls out of 1296 that were greater than 12 was "+c+"\nThe probability is "+p );
	}
}

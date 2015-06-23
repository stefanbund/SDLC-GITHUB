import java.util.*;

public class randomifmain {

	public static void main(String[] args) 
	{	
		Random r = new Random(); //random number generator
		int n =   r.nextInt(); //truncate each random number into an integer

		//variable scope example
		int negatives = 0;
		int positives = 0; 
		int zeroes = 0;
		
		//lengths of various number types
		int lengthsOfNegatives = 0;
		int lengthsOfPositives = 0;
		int lengthsOfZeroes = 0;//helps us to count the lengths of various occurences, in nature
		
		//averages, products of our study
		int averageNegativeLength = 0;
		int averagePositiveLength = 0;
		int averageZeroLength = 0; //we already know this, but...
		
		for(int i = 0; i <= 10000000; i++)
		{
			//System.out.println(" step: " + i);
			int x = r.nextInt();
			//execute some rules on the number
			if(x < 0)
			{
				System.out.println("just got a negative random... by value of " + x + 
						" during step " + i);
				negatives++;//incremental operator, this tells us how many numbers of this kind
				//we've had thus far
				int c = countNumerals(x);
				//calculate an average length -> lengths / # of lengths
				lengthsOfNegatives = lengthsOfNegatives + c; 
				averageNegativeLength = lengthsOfNegatives / negatives; 
			}
			else if(x  == 0)
			{
				System.out.println("just got a zero equivalent in step " + i);
				zeroes++;
				int c = countNumerals(x); //gives us the length of the number in this situation
			}
			else
			{
				System.out.println("positive integer... from step " + i);
				positives++;
				int c = countNumerals(x);
				lengthsOfPositives = lengthsOfPositives + c; 
				averagePositiveLength = lengthsOfPositives / positives; 
				
			}
			
			
		}//end of the for loop
		System.out.println("we got " + negatives + " negatives, " + zeroes + " zeroes, and "
				+ positives + " positives ");
		System.out.println("the average length of negative numbers is " + averageNegativeLength );
		System.out.println("the average length of positive numbers is " + averagePositiveLength );

		
	}

	/**
	 * calculates the length of any given number, no matter what the sign
	 * 
	 * @param x, a number
	 * @return the length of the input number
	 */
	public static int countNumerals(int x)
	{
		String s = new Integer(x).toString();
		
		int len = s.length();
		System.out.println("length of random is " + len);

		System.out.println(x);
		return len; //return the length to the caller
	}

}

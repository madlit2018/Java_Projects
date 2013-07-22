package lesson7_2;

//This problem will use the same data as the previous one. This time you are
//to complete the TemperatureDifferenceCalculator. It has two methods:
//
//public double maxDifference() - Calculates the maximum difference between
//any two consecutive days. If Jan 7 temperature is 5 degrees and
//Jan 8 is -10 degrees, the difference between the two temperatures is 15.
//The temperature changed 15 degrees between one day and the next. The difference
//is always the absolute value..
//
//public double minDifference() - Calculates the minimum difference between
//any two consecutive days
//
//For the draft, provide the method stubs (in this case the headers and
//a return value of 0)
//
// Yuttanant Suwwansiri 07/17/13

public class TemperatureDifferenceCalculator
{
	  private double[] data;
	
	  /**
	   * Constructs a TemperatureDifferenceCalculator with the given array
	   * @param the array to process
	   */
	  public TemperatureDifferenceCalculator(double[] list)
	  {
	      data = list;
	  }
	
	  /**
	   * Gets the maximum difference between any two consecutive values
	   * @return the maximum difference
	   */
	// TODO: add the stub for the maxDifference method. That is the header, the braces, and the return statement
	  public double maxDifference()
	  {
		  double diff = 0;
		  double max = 0;
		  for (int i = 0; i < data.length - 1; i++) 
		  {
			diff = Math.abs(data[i + 1] - data[i]);
			if (diff > max)
			{
				max = diff;
			}
		  }
	      return max;
	  }
	    
	
	  /**
	   * Gets the minimum difference between any two consecutive values
	   * @return the minimum difference
	   */
	
	  // TODO: add the stub for the minDifference method. That is the header, the braces, and the return statement
	  public double minDifference() 
	  {
		  double diff = 0;
		  double min = Integer.MAX_VALUE;
		  for (int i = 0; i < data.length - 1; i++) 
		  {
			diff = Math.abs(data[i + 1] - data[i]);
			if (diff < min)
			{
				min = diff;
			}
		  }
	      return min;

	  }
	  
	  public static void main(String[] args) 
	  {
		  double[] list = {1.2, 2.4, 3, 2};
		  TemperatureDifferenceCalculator temp = new TemperatureDifferenceCalculator(list);
		  System.out.println("Max: " + temp.maxDifference());
		  System.out.println("Min: " + temp.minDifference());		  
	  }
}

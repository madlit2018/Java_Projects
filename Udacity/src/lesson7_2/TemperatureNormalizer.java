package lesson7_2;

//We want to get the average temperature in Anchorage, Alaska, in
//January and February, 1955. But to get a better idea of the normal temperature,
//we will discard the highest and lowest temperatures. The tester will
//get the temperatures from the website
//http://academic.udayton.edu/kissock/http/Weather/gsod95-current/AKANCHOR.txt
//It will put them into a double[]array that is passed to the constructor of
//your class. You will complete the TemperatureNormalizer class below.

//The TemperatureNormalizer class has a constructor that takes an array of
//doubles as a parameter
//public TemperatureNormalizer(double[] list)

//It also has methods:
//public double getAdjustedAverage() - gets the average minus the max and min
//public double getMax()
//public double getMin()
//public double getSum()
//
//For the draft, implement the getSum method. The other methods are implemented
//as stubs
//
//Note: the tester uses code we have not covered to get the values from
//the website. You can just ignore it and think of it as the plumbing that
//gets you a double.
//
// Yuttanant Suwansiri 07/15/13

public class TemperatureNormalizer
{
	 private double[] data;
	
	 /**
	 /* Constructs a TemperatureNormalizer with the given array
	 /* @param the array to process
	 */
	 public TemperatureNormalizer(double[] list)
	 {
	     data = list;
	 }
	
	 /**
	  * Gets the adjusted average of the values in this array. The adjusted average
	  * is calculated by removing the highest and lowest values and calculating
	  * the average of the values that are left
	  * @return the adjusted average
	  */
	 public double getAdjustedAverage()
	 {
	     // TODO: find the adjusted average as described in the javadoc.
		 double sum = 0;
		 int count = 0;
		 
		 for (int i = 0; i < data.length; i++) 
		 {
			if (data[i] != getMax() && data[i] != getMin())
			{
				sum = sum + data[i];
				count++;
			}
		 }
		 
	     return sum / count;
	 }
	
	 /**
	  * Gets the maximum value in the array of doubles
	  * @return the maximum value
	  */
	  public double getMax()
	  {
	      // TODO: find the maximum value
		  double max = data[0];
		  for (int i = 0; i < data.length; i++) 
		  {
			if (data[i] > max)
			{
				max = data[i];
			}
		  }
	      return max;
	  }
	
	 /**
	  * Gets the minimum value in the array of doubles
	  * @return the minimum value
	  */
	  public double getMin()
	  {
	      // TODO: find the minimum value
		  double min = data[0];
		  for (int i = 0; i < data.length; i++) 
		  {
			if (data[i] < min)
			{
				min = data[i];
			}
		  }
	      return min;
	  }  
	
	  /**
	   * Gets the sum of the values in the array
	   * @return the sum of the values in the array
	   */
	  public double getSum()
	  {
	      // TODO find the sum
		  double sum = 0;
		  for (double num : data) 
		  {
			  sum = sum + num;
		  }
	      return sum;
	  }

	  public static void main(String[] args) 
	  {
		  double[] list = {1.2, 3, 4, 2};
		  TemperatureNormalizer temp = new TemperatureNormalizer(list);
		  System.out.println("Sum is: " + temp.getSum());
		  System.out.println("Max: " + temp.getMax());
		  System.out.println("Min: " + temp.getMin());
		  System.out.println("Adjusted Avg: " + temp.getAdjustedAverage());
	  }

}

package lesson7_2;

//BlueJ project: lesson7/scores1
// Yuttanant Suwansiri 07/14/13

import java.util.Arrays;
import java.util.Scanner;

/**
* Holds the homework scores for a student.
*/
public class HomeworkScores
{
	 private double[] scores;
	 private int currentSize; // The currentSize of the array of scores.
	
	 /**
	  * @param maxScores the maximum number of scores this object can hold.
	  */
	 public HomeworkScores(int maxScores)
	 {
	     scores = new double[maxScores];
	     currentSize = 0;
	 }
	 
	 /**
	     * Calculates the average of all the scores collected so far.
	     * @return the average of the scores in scores.
	     */
	    public double averageScore()
	    {
	        // TODO: Calculate the average score.
	        // Add up all the scores and divide by the number of scores.
	        // return the result.
//	    	System.out.println(sumScores());
//	    	System.out.println(scores.length);
	    	if (currentSize == 0) return 0;
	    	return sumScores() / currentSize;
	    }
	    
	    /**
	     * Removes the lowest score.
	     */
	    public void removeLowest()
	    {
	        // YOUR CODE HERE
	        // Remove the lowest score.
	        // You can use any of the other methods in this class.
	    	int lowestIndex = getLowScoreIndex();
	    	System.out.println(lowestIndex);
	    	remove(lowestIndex);
	    	
	    }
	    
	    /**
	     * Finds the index of the lowest score.
	     * @return the index of the lowest score.
	     */
	    public int getLowScoreIndex()
	    {
	        // TODO: Find and return the index of the lowest score in scores.
	    	double lowest = scores[0];
	    	int index = 0;
	    	for (int i = 0; i < currentSize; i++) 
	    	{
				if (scores[i] < lowest)
				{
					lowest = scores[i];
					index = i;
				}
			}
	    	return index;
	    }
	    
	    /**
	     * Finds the first occurrence of the given score.
	     * @param searchedValue the score to look for
	     * @return the position of scoreToFind, -1 if it's not there
	     */
	    public int find(double searchedValue)
	    {
	        int pos = 0;
	        boolean found = false;
	        while (pos < currentSize && !found)
	        {
	            if (scores[pos] == searchedValue)
	            {
	                found = true;
	            }
	            else
	            {
	                pos++;
	            }
	        }
	        if (found)
	        {
	            return pos;
	        }
	        else
	        {
	            return -1;
	        }
	    }
	    
	    /**
	     * Returns the lowest of the scores.
	     * @return the lowest score
	     */
	    public double lowScore()
	    {
	        double lowestSoFar = scores[0];
	        for (int i = 1; i < currentSize; i++)
	        {
	            if (scores[i] < lowestSoFar)
	            {
	                lowestSoFar = scores[i];
	            }
	        }
	        return lowestSoFar;
	    }

	    /**
	     * Removes the score at the given position.
	     * @param pos the position of the value to remove.
	     */
	    public void remove(int pos)
	    {
	        for (int i = pos + 1; i < currentSize; i++)
	        {
	            scores[i - 1] = scores[i];
	        }
	        currentSize--;
	    }
	 
	 /**
	     * Calculates the Sum of all the scores entered.
	     * @return the sum of all the scores in scores.
	     */
	    public double sumScores()
	    {
	        // YOUR CODE HERE
	        // Sum all the scores that have been entered so far and
	        // return the result.
	    	double sum = 0;
	    	for (int i = 0; i < scores.length; i++) 
	    	{
				sum = sum + scores[i];
			}
	        return sum;
	    }

	
	 public void readScores(Scanner userInput)
	 {
	     // YOUR CODE HERE
	     // Read (userInput) scores between 0 and 100 until a non number is entered.
	     // Use the scanner passed in in the argument userInput.
	     // Save each score that is read in the partially filled scores array.
	     // Make sure not to lose track of how filled the array is.
		 while (userInput.hasNextDouble())
		 {
			 scores[currentSize] = userInput.nextDouble();
			 currentSize++;
		 }
		 
	 }
	
	 /**
	  * Builds an easy-to-read description of the scores in the object.
	  * @return A description of the scores.
	  */
	 public String toString()
	 {
	     return Arrays.toString(Arrays.copyOf(scores, currentSize));
	 }
	 
	 public static void main(String[] args) 
	 {
		 Scanner userInput = new Scanner(System.in);
		 HomeworkScores hw = new HomeworkScores(100);
		 System.out.println("Enter scores, Q to quit");
		 hw.readScores(userInput);
		 System.out.println("Sum scores: " + hw.sumScores());
		 System.out.println("Avg score: " + hw.averageScore());
		 hw.removeLowest();
		 System.out.println("The Array contains: ");
		 for (int i = 0; i < hw.currentSize; i++) 
		 {
			 System.out.print(hw.scores[i] + " ");
		 } 
	 }
}

package lesson7;


//
// Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)
// HINT: You can use the ArrayList algorithm for finding the minimum
//
// Yuttanant 07/10/13

import java.util.ArrayList;

public class StringArrayUtil
{
   public String shortestString(ArrayList<String> words)
   {
      // TODO: initialize the string to the hold the shortest string
      String shortest = ""; //initialize
      int min = Integer.MAX_VALUE;
      // TODO: Write the code to find the shortest string
      
      for (String word : words)
      {
    	  if (word.length() < min)
    	  {
    		  min = word.length();
    		  shortest = word.toString();
    	  }
      } 
      return shortest;
   }
   
   public static void main(String[] args)
   {
	   ArrayList<String> wordList = new ArrayList<String>();
	   StringArrayUtil anArray = new StringArrayUtil();
	   wordList.add("arm");
	   wordList.add("suwansiri");
	   
	   System.out.println(anArray.shortestString(wordList));
   }
}

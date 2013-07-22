package lesson7;

//
//Complete the method in this class to return the number of strings
//that start with the target
//
// Yuttanant 07/10/13

import java.util.ArrayList;
public class Counter
{
/**
 * Gets the number of strings that starts with the target
 * @param text the array list to process
 * @param target the desired letter
 * @return the count of strings starting with target
 */
	 public int getCount(ArrayList<String> text, String target)
	 {
	    // TODO: Adapt an ArrayList algorithm to return the number of Strings that start within the target
	     int count = 0;
	     for (String word : text)
	     {
	         if (word.toString().contains(target))
	         {
	             count++;
	         }
	     }
	     return count;
	 }
	 
	 public static void main(String[] args) 
	 {
		 ArrayList<String> wordList = new ArrayList<String>();
		 Counter count = new Counter();
		 wordList.add("Arm");
		 wordList.add("target");
		 wordList.add("Suwansiri");
		 
		 System.out.println(count.getCount(wordList, "target"));
	 }
}

package lesson7;

//
//Complete the method in this class to return the index of the first string
//that starts with the target. Return -1 if no string starts with the target
//
// Yuttanant 07/10/13

import java.util.ArrayList;
public class Finder
{
	/**
	 * Gets the index of the first String that starts with the target
	 * @param text the array list to process
	 * @param target the desired letter
	 * @return the index of first string starting with target or -1 if not found
	 */
	 public int getIndex(ArrayList<String> text, String target)
	 {
	     int i = 0;
	     int index = -1;
	     boolean found = false;
	     while (!found) //supply condition
	     {
	         // TODO: Adapt an ArrayList algorithm to return the index of the first string that start with the target
	         // TODO: Return -1 if no string starts with the target
	    	 if (text.get(i).toString().contains(target))
	    	 {
	    		 found = true;
	    		 return i;
	    	 }
	    	 i++;
	     }
	     return index;
	 }
	 
	 public static void main(String[] args) 
	 {
		 ArrayList<String> wordList = new ArrayList<String>();
		 Finder find = new Finder();
		 wordList.add("Arm");
		 wordList.add("target");
		 wordList.add("Suwansiri");
		 
		 System.out.println(find.getIndex(wordList, "target"));
	 }
}

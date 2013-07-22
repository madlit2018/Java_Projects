package lesson7;

//
//Complete the class ArrayListMethods. It consists of four short methods to manipulate an array list of strings.
//The method header and javadoc are given to you.
//
//For the draft, provide the isSorted method.
//
// Yuttanant 07/09/13

import java.util.ArrayList;

public class ArrayListMethods
{
	  ArrayList<String> list; //instance variable
	  /**
	   * Constructor for objects of class ArrayListMethods
	   */
	  public ArrayListMethods(ArrayList<String> arrayList)
	  {
	      // initialise instance variables
	      list = arrayList;
	  }
	
	  /**
	   * Determines if the array list is sorted (do not sort)
	   * When Strings are sorted, they are in alphabetical order
	   * Use the compareTo method to determine which string comes first
	   * You can look at the String compareTo method in the Java API
	   * @return true if the array list is sorted else false.
	   */
	  public boolean isSorted()
	  {
	      boolean sorted = true;
	      // TODO: Determine if the array is sorted.
	      for (int i = 1; i < list.size(); i++)
	      {
	    	  if (list.get(i).compareTo(list.get(i - 1)) < 0)
	    	  {
	    		  sorted = false;
	    	  }
		  }
	      return sorted;
	  }
	
	  /**
	   * Replaces all but the first and last with the larger of its to neighbors
	   * You can use compareT to determine which string is larger (later in alphabetical
	   * order.
	   * @return a string representation of the array list. (do this with list.toString()
	   */
	  public void replaceWithLargerNeighbor()
	  {
	
	      // TODO: Replace all but the first and last elements with the larger of its to neighbors
		  for (int i = 1; i < list.size() - 1; i++)
		  {
			  if (list.get(i + 1).compareTo(list.get(i)) > 0)
	    	  {
	    		  list.set(i, list.get(i + 1));
	    	  }
		  }
	  }
	
	  /**
	   * Gets the number of duplicates in the list.
	   * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
	   * Get the next word. It is at index i. Does it match any of the words with index > i?)
	   * @return the number of duplicate words in the list
	   */
	  public int countDuplicates()
	  {
	      int duplicates = 0;
	
	      // TODO: Write the code to get the number of duplicates in the list
	      for (int i = 0; i < list.size(); i++)
	      {
	    	  for (int j = i + 1; j < list.size(); j++)
	    	  {
		    	  if (list.get(i).equals(list.get(j)))
		    	  {
		    		  duplicates++;
		    	  }
			  }
	      }
	
	      return duplicates;
	  }
	
	   /**
	   * Moves any word that startw with x, y, or z to the front of the arraylist, but
	   * otherwise prserves the order
	   */
	  public void xyzToFront()
	  {
	      int insertAt = 0;
	
	      // TODO:  Move any word that starts with x, y, or z to the front of the arraylist, but otherwise preserves the order
	      for (int i = 0; i < list.size(); i++)
	      {
	    	  //System.out.println(list.get(i));
	    	  if ("xyzXYZ".contains(list.get(i).substring(0, 1)))
	    	  {
	    		  String tmpStr = list.remove(i);
	    		  list.add(insertAt, tmpStr);
	    		  insertAt++;
	    		  //System.out.println(list.get(i));
	    	  }
	      }
	  }
	
	  /**
	   * gets the string representation of this array list
	   * @returns the string representation of this array list in
	   * standard collectiuon format
	   */
	  public String toString()
	  {
	      return list.toString();
	  }
	  
	  public static void main(String[] args)
	  {
		  ArrayList<String> stringList = new ArrayList<String>();
		  stringList.add("ape");
		  stringList.add("dog");
		  stringList.add("xantus");
		  stringList.add("zebra");
		  stringList.add("cat");
		  stringList.add("yak");
		  
		  System.out.println(stringList.toString());
		  ArrayListMethods arrayMethods = new ArrayListMethods(stringList);
		  System.out.println(arrayMethods.isSorted());
//		  arrayMethods.replaceWithLargerNeighbor();
//		  System.out.println(stringList.toString());
		  System.out.println(arrayMethods.countDuplicates());
		  arrayMethods.xyzToFront();
		  System.out.println(stringList.toString());
	  }
}

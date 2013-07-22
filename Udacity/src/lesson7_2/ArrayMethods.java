package lesson7_2;


//
// Complete the methods below. These methods manipulate Arrays of Strings
// For the draft, complete the first method
//
// Yuttanant Suwansiri 07/15/13

public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialize the instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order.
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it
        for (int i = 0; i < list.length - 1; i++) 
        {
			if (list[i + 1].compareTo(list[i]) < 0)
			{
				sorted = false;
			}
		}
        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its neighbors.
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order.
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {
    	for (int i = 1; i < list.length - 1; i++) 
    	{
			if (list[i + 1].compareTo(list[i]) > 0)
    		{
    			String tmp = list[i];
    			list[i] = list[i + 1];
    			if (i == list.length - 1) list[i + 1] = tmp;
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
        for (int i = 0; i < list.length - 1; i++) 
        {
        	for (int j = i + 1; j < list.length; j++) 
        	{
				if (list[i] == list[j])
				{
					duplicates++;
				}
			}
		}
        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the arraylist, but
     * otherwise preserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;
        for (int i = 0; i < list.length; i++)
	      {
	    	  if ("xyzXYZ".contains(list[i].substring(0, 1)))
	    	  {
	    		  String temp = list[i];
	    		  // Adjust before i
	    		  for (int j = i - 1; j >= insertAt; j--) 
	    		  {
					list[j + 1] = list[j];
	    		  }
	    		  list[insertAt] = temp;
	    		  insertAt++;
	    	  }
	      }
    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collection format
     */
    public String toString()
    {
    	String output = "";
    	for (int i = 0; i < list.length; i++) 
    	{
    		if (i == 0)
    		{
    			output = output + list[i];
    		}
    		else 
    		{
    			output = output + ", " + list[i];
    		}		
		}
        return "[" + output + "]";
    }
    
    public static void main(String[] args) 
    {
    	String[] list = {"cat", "ape", "dog", "horse", "zebra"};
    	String[] list2 = {"ape", "dog", "xantus", "zebra", "cat", "yak"};
    	ArrayMethods array = new ArrayMethods(list);
    	ArrayMethods array2 = new ArrayMethods(list2);
    	System.out.println("Is the array sorted?: " + array.isSorted());
    	array.replaceWithLargerNeighbor();
    	System.out.println(array.toString());
    	System.out.println("Duplicates: " + array.countDuplicates());
    	array2.xyzToFront();
    	System.out.println(array2.toString());
    }
}